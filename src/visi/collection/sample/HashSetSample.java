package visi.collection.sample;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetSample {

    public static void main(String[] args) {

        HashSet hashSet = new HashSet(); //Initial size =16 load factor =0.75
        HashSet hashSet1 = new HashSet(100); //Initial size =100 load factor is default 0.75
        HashSet hashSet2 = new HashSet(100, (float) 0.95); // Initial size =100 load factor = 0.95


        //add
        hashSet.add("Welcome");
        hashSet.add(100);
        hashSet.add(false);
        hashSet.add('A');
        hashSet.add(75.5);
        hashSet.add("Collections");

        System.out.println(hashSet);

        //remove
        hashSet.remove('A');
        System.out.println("HashSet after removing element : " + hashSet);

        //contains
        System.out.println("HashSet contains element 100 : " + hashSet.contains(100));
        System.out.println("HashSet contains element test : " + hashSet.contains("test"));

        //isEmpty
        System.out.println("HashSet empty ?  : " + hashSet.isEmpty());

        for (Object o: hashSet ) {
            System.out.println(o);
        }

        Iterator it = hashSet.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        HashSet<String> hashSet3 = new HashSet<String>();
        hashSet3.add("Red");
        hashSet3.add("Green");
        hashSet3.add("Yellow");
        hashSet3.add("Blue");

        System.out.println(hashSet3);

        //addAll
        HashSet<String> hashSet4 = new HashSet<String>();
        hashSet4.addAll(hashSet3);
        hashSet4.add("Purple");
        System.out.println(hashSet4);

        //removeAll
        hashSet4.removeAll(hashSet3);
        System.out.println("After removing : " + hashSet4);

        HashSet<Integer> set1 = new HashSet<Integer>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        HashSet<Integer> set2 = new HashSet<Integer>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

        System.out.println("Hash set 1 : " + set1);
        System.out.println("Hash set 2 : " + set2);

        //Union
        set1.addAll(set2);
        System.out.println("Union : " + set1);

        /*//Intersection
        set1.retainAll(set2);
        System.out.println("Intersection : " + set1);

        //difference
        set1.removeAll(set2);
        System.out.println("Difference : " + set1);

        //subset
        System.out.println("Subset : " + set1.containsAll(set2));*/
    }
}
