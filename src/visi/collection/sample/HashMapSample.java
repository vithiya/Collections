package visi.collection.sample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapSample {

    public static void main(String[] args) {

        HashMap hashMap = new HashMap();

        hashMap.put(1,"Television");
        hashMap.put(2,"Refrigerator");
        hashMap.put(3,"Microwave");
        hashMap.put(4,"Sewing machine");
        hashMap.put(5,"Fan");

        System.out.println(hashMap);
        System.out.println(hashMap.get(1));

        hashMap.remove(5);
        System.out.println(hashMap);

        System.out.println("Hash map contains key 3 : " + hashMap.containsKey(3));
        System.out.println("Hash map contains key 6 : " + hashMap.containsKey(6));

        System.out.println("Hash map contains value laptop : " + hashMap.containsValue("laptop"));
        System.out.println("Hash map contains value Sewing machine : " + hashMap.containsValue("Sewing machine"));

        System.out.println("Hash map empty or not : " + hashMap.isEmpty());
        System.out.println("Hash map keysets : " + hashMap.keySet());
        System.out.println("Hash map values : " + hashMap.values());
        System.out.println("Hash map entryset : " + hashMap.entrySet());

        for (Object o: hashMap.keySet()) {
            System.out.println( o +" , " +hashMap.get(o));
        }

        for(Object e : hashMap.entrySet()){
            Map.Entry entry = (Map.Entry) e;
            System.out.println( entry.getKey() +" , " +entry.getValue());
        }

        Set entries = hashMap.entrySet();
        Iterator it = entries.iterator();
        while(it.hasNext()){
            Map.Entry entry = (Map.Entry) it.next();
            System.out.println(entry.getKey() + " ,  " + entry.getValue());
        }

    }
}
