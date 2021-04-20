package visi.collection.sample;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetSample {

    public static void main(String[] args) {

        HashSet set = new HashSet();
        set.add(100);
        set.add(200);
        set.add(300);
        set.add(400);
        set.add(500);

        LinkedHashSet linkedSet = new LinkedHashSet();
        linkedSet.add(100);
        linkedSet.add(200);
        linkedSet.add(300);
        linkedSet.add(400);
        linkedSet.add(500);
        System.out.println("Insertion order : [100, 200, 300, 400,500]");
        System.out.println("HashSet elements , Insertion order is not preserved : "+ set);
        System.out.println("LinkedHashSet elements , Insertion order is preserved : "+ linkedSet);
    }
}
