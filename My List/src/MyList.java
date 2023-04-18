public class MyList<E> {
    private E[] dataBase;
    private int capacity;
    private int size;
    private int DEFAULT_CAPACITY = 10;

    public MyList() {
        this.capacity = DEFAULT_CAPACITY;
        dataBase = (E[]) new Object[capacity];
    }

    public MyList(int capacity) {
        this.capacity = capacity;
        dataBase = (E[]) new Object[getCapacity()];
    }

    public int size() {
        int count = 0;
        for (int i = 0; i < capacity; i++) {
            if (dataBase[i] != null) {
                count++;
            }
        }
        this.size = count;
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(E data) {
        if (size() == getCapacity()) {
            this.setCapacity(getCapacity() * 2);
            E[] tempData = (E[]) new Object[getCapacity()];
            for (int i = 0; i < dataBase.length; i++) {
                tempData[i] = dataBase[i];
            }
            dataBase = tempData;
        }
        dataBase[size()] = data;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public E get(int index) {
        return dataBase[index];
    }

    public E remove(int index) {
        if (index >= 0 && index < getCapacity()) {
            for (int i = index; i < getCapacity(); i++) {
                if (i < size() - 1) {
                    dataBase[i] = dataBase[i + 1];
                } else {
                    dataBase[i] = null;
                }
            }

            if (size() * 2 < getCapacity() || size() == getCapacity() / 2) {
                setCapacity(getCapacity() / 2);
            }

        }
        return null;
    }

    public void set(int index, E data) {
        if (index >= 0 && index < size()) {
            dataBase[index] = data;
        }
    }

    public String toString() {
        String result = "[";
        for (int i = 0; i < size(); i++) {
            result += dataBase[i];
            if (i != size() - 1) {
                result += ",";
            }
        }
        result += "]";
        return result;
    }

    public int indexOf(E data) {
        for (int i = 0; i < size(); i++) {
            if (dataBase[i] == data) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(E data) {
        for (int i = 0, j = size() - 1; i < size(); i++, j--) {
            if (dataBase[j] == data) {
                return size() - i - 1;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public E[] toArray() {
        return dataBase;
    }

    public void clear() {
        this.setCapacity(10);
        E[] data = (E[]) new Object[getCapacity()];
        dataBase = data;
    }

    public MyList<E> subList(int start, int finish) {
        if (start >= 0 && start < size && finish >= 0 && finish < size) {
            MyList<E> sublist = new MyList<>();

            for (int i = start; i < finish; i++) {
                sublist.add(dataBase[i]);
            }
            return sublist;
        }
        return null;
    }
    public boolean contains(E data){
        for (int i=0;i<size();i++){
            if (data==dataBase[i])
                return true;
        }
        return false;
    }
}
