import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        MyList<Integer> list1 = new MyList<>();
        System.out.println("Dizideki Eleman Sayısı : " + list1.size());
        System.out.println("Dizinin Kapasitesi : " + list1.getCapacity());
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        System.out.println("Dizideki Eleman Sayısı : " + list1.size());
        System.out.println("Dizinin Kapasitesi : " + list1.getCapacity());
        list1.add(50);
        list1.add(60);
        list1.add(70);
        list1.add(80);
        list1.add(90);
        list1.add(100);
        list1.add(110);
        System.out.println("Dizideki Eleman Sayısı : " + list1.size());
        System.out.println("Dizinin Kapasitesi : " + list1.getCapacity());

        // ---------------------------------------------------------------------------
        System.out.println("\n==================================================\n");

        MyList<Integer> list2 = new MyList<>();
        System.out.println("Dizideki Eleman Sayısı : " + list2.size());
        System.out.println("Dizinin Kapasitesi : " + list2.getCapacity());
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        System.out.println("Dizideki Eleman Sayısı : " + list2.size());
        System.out.println("Dizinin Kapasitesi : " + list2.getCapacity());
        list2.add(50);
        list2.add(60);
        list2.add(70);
        list2.add(80);
        list2.add(90);
        list2.add(100);
        list2.add(110);
        System.out.println("Dizideki Eleman Sayısı : " + list2.size());
        System.out.println("Dizinin Kapasitesi : " + list2.getCapacity());

        // ---------------------------------------------------------------------------
        System.out.println("\n==================================================\n");


        MyList<Integer> list3 = new MyList<>();
        list3.add(10);
        list3.add(20);
        list3.add(30);
        System.out.println("2. indisteki değer : " + list3.get(2));
        list3.remove(2);
        list3.add(40);
        list3.set(0, 100);
        System.out.println("2. indisteki değer : " + list3.get(2));
        System.out.println(list3.toString());

        //------------------------------------------------------------------------
        System.out.println("\n==================================================\n");

        MyList<Integer> list4 = new MyList<>();
        System.out.println("Liste Durumu : " + (list4.isEmpty() ? "Boş" : "Dolu"));
        list4.add(10);
        list4.add(20);
        list4.add(30);
        list4.add(40);
        list4.add(20);
        list4.add(50);
        list4.add(60);
        list4.add(70);

        System.out.println("Liste Durumu : " + (list4.isEmpty() ? "Boş" : "Dolu"));

        // Bulduğu ilk indeksi verir
        System.out.println("Indeks : " + list4.indexOf(20));

        // Bulamazsa -1 döndürür
        System.out.println("Indeks :" + list4.indexOf(100));

        // Bulduğu son indeksi verir
        System.out.println("Indeks : " + list4.lastIndexOf(20));

        // Listeyi Object[] dizisi olarak geri verir.
        Object[] dizi = list4.toArray();
        System.out.println("Object dizisinin ilk elemanı :" + dizi[0]);

        // Liste veri türünde alt bir liste oluşturdu
        MyList<Integer> subList = list4.subList(0, 3);
        System.out.println("SubList Elements: "+subList.toString());

        // Değerim listedeki olup olmadığını sorguladı
        System.out.println("Listemde 20 değeri : " + list4.contains(20));
        System.out.println("Listemde 120 değeri : " + list4.contains(120));

        // Listeyi tamamen boşaltır ve varsayılan boyutuna çevirir
        list4.clear();
        System.out.println(list4.toString());


    }
}