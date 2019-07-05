package AlgorLesson2;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main1 {
    public static void main(String[] args) {
//        testArray();
//        testArrayImpl();
        long t1,t2;
        ArrayImpl arrUsual = new ArrayImpl(10000);
        ArrayImpl arrUsual1 = new ArrayImpl(10000);
        ArrayImpl arrUsual2 = new ArrayImpl(10000);
        ArrayImpl[] ar = {arrUsual,arrUsual1,arrUsual2};
        fillArraysRandom(ar,100000,20);
        t1 = System.currentTimeMillis();
        arrUsual.sortBubble();
        t2 = System.currentTimeMillis();
        System.out.println("Bubble sort time - " + TimeUnit.MILLISECONDS.toSeconds(t2 - t1));
        t1 = System.currentTimeMillis();
        arrUsual1.sortSelect();
        t2 = System.currentTimeMillis();
        System.out.println("Select sort time - " + TimeUnit.MILLISECONDS.toSeconds(t2 - t1));
        t1 = System.currentTimeMillis();
        arrUsual2.sortInsert();
        t2 = System.currentTimeMillis();
        System.out.println("Insert sort time - " + TimeUnit.MILLISECONDS.toSeconds(t2 - t1));
//        testHomeArray();
    }

    public static void fillArraysRandom(Array[] arr,int length, int range) {
        Random rnd = new Random();
        for (int i = 0; i < length ; i++) {
            int value = rnd.nextInt(range);
            for (Array a : arr ) {
                a.add(value);
            }
        }
    }

    private static void testHomeArray() {
        Array arrUsual = new ArrayImpl(10000);
        Array arrUsual1 = new ArrayImpl(10000);
        Array arrUsual2 = new ArrayImpl(10000);
        Array arrSorted = new SortedArrayImpl(10000);
        long t1,t2;


/*        t1 = System.currentTimeMillis();
        arrUsual.fillArrayRandom(100000,20);
        t2 = System.currentTimeMillis();
        System.out.println("Fill usual array time - " + (t2 - t1));
        t1 = System.currentTimeMillis();
        arrSorted.fillArrayRandom(100000,20);
        t2 = System.currentTimeMillis();
        System.out.println("Fill sorted array time - " + (t2 - t1));

        t1 = System.currentTimeMillis();
        arrUsual.sortBubble();
        t2 = System.currentTimeMillis();
        System.out.println("Bubble sort time - " + (t2 - t1));
        arrUsual.clear();
        arrUsual.fillArrayRandom(100000,20);

        t1 = System.currentTimeMillis();
        arrUsual.sortSelect();
        t2 = System.currentTimeMillis();
        System.out.println("Select sort time - " + (t2 - t1));
        arrUsual.clear();
        arrUsual.fillArrayRandom(100000,20);

        t1 = System.currentTimeMillis();
        arrUsual.sortInsert();
        t2 = System.currentTimeMillis();
        System.out.println("Insert sort time - " + (t2 - t1));*/

//        arrUsual.display();
    }

    public static void testArray() {
//        int[] a = new int[5];
//        Integer[] a = new Integer[5];
        Integer[] a = /*new Integer[]*/ {21, 22, 23, 24};

//        a[0] = 21;
//        a[1] = 22;
//        a[2] = 23;

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void testArrayImpl() {

        Array arr1 = new ArrayImpl(10);
        System.out.println("Size = " + arr1.getSize());
        System.out.println("Is array empty = " + arr1.isEmpty());

        /*for (int i = 0; i < 10; i++) {
            arr1.add((int) (Math.random() * 10));
        }*/
        arr1.add(9);
        arr1.add(7);
        arr1.add(4);
        arr1.add(6);
        arr1.add(2);
        arr1.add(8);
        arr1.add(7);
        arr1.add(1);
        arr1.add(5);
        arr1.add(5);
        arr1.add(5);
        arr1.add(1);

        arr1.display();

        System.out.println("Size = " + arr1.getSize());
        System.out.println("Is array empty = " + arr1.isEmpty());
        System.out.println("arr[2] = " + arr1.get(2));
        System.out.println("get last = " + arr1.get());
        System.out.println("Remove 43 = " + arr1.remove(43));
        System.out.println("Remove 7 = " + arr1.remove(7));

        arr1.display();

        System.out.println("Remove 22 = " + arr1.remove(22));

        arr1.display();

        /*System.out.println("Size = " + arr1.getSize());
        System.out.println("Is array empty = " + arr1.isEmpty());
        System.out.println("Index  = " + arr1.indexOf(6));
        System.out.println("Contains 7 = " + arr1.contains(7));*/

        arr1.sortInsert();
        arr1.display();


//        while (!arr1.isEmpty()) {
//            arr1.remove();
//            arr1.display();
//        }

    }

}
