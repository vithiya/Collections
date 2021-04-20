package visi.collection.sample;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableSample {

    public static void main(String[] args) {

        Hashtable hashtable = new Hashtable(); //default capacity 11, load factor 0.75
        Hashtable hashtable1 = new Hashtable(100); // capacity 11, default load factor 0.75
        Hashtable hashtable2 = new Hashtable(100, (float) 0.95); // capacity 11, load factor 0.75

        Hashtable<Integer, String> hashtable3 = new Hashtable<Integer, String>(100);

        hashtable.put(1, "TV");
        hashtable.put(2, "Fan");
        hashtable.put(3, "Grinder");
        hashtable.put(4, "Telephone");

        System.out.println(hashtable);
        System.out.println(hashtable.get(1));

        hashtable.remove(4);
        System.out.println(hashtable);

        System.out.println("Hash table contains key 3 : " + hashtable.containsKey(3));
        System.out.println("Hash table contains key 6 : " + hashtable.containsKey(6));

        System.out.println("Hash table contains value Fan : " + hashtable.containsValue("Fan"));
        System.out.println("Hash table contains value Sewing machine : " + hashtable.containsValue("Sewing machine"));

        System.out.println("Hash table empty or not : " + hashtable.isEmpty());
        System.out.println("Hash table keysets : " + hashtable.keySet());
        System.out.println("Hash table values : " + hashtable.values());
        System.out.println("Hash table entryset : " + hashtable.entrySet());

        for (Object o : hashtable.keySet()) {
            System.out.println(o + " , " + hashtable.get(o));
        }

        for (Object e : hashtable.entrySet()) {
            Map.Entry entry = (Map.Entry) e;
            System.out.println(entry.getKey() + " , " + entry.getValue());
        }

        Set entries = hashtable.entrySet();
        Iterator it = entries.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            System.out.println(entry.getKey() + " ,  " + entry.getValue());
        }
        //null not allowed as key or value, it will throw an exception
        hashtable.put(null,"text");
    }

}
