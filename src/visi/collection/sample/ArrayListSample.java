package visi.collection.sample;

import java.util.*;

public class ArrayListSample {

    public static void main(String[] args) {

        //Declare ArrayList
        //stores heterogeneous data
        ArrayList arrayList = new ArrayList();
        List list = new ArrayList();

        //stores homogeneous data
        ArrayList<String> stringList = new ArrayList<>();

        //add elements to heterogeneous arrayList
        //elements added to the end of the arrayList
        arrayList.add("Welcome to Java world");
        arrayList.add(2);
        arrayList.add(2.5);
        arrayList.add('B');
        arrayList.add(true);

        System.out.println("Data from heterogeneous ArrayList " + arrayList);
        System.out.println("Size of the ArrayList : " + arrayList.size());

        //remove element from ArrayList
        arrayList.remove(2);
        System.out.println("Data after removing element 2.5 : " + arrayList);
        arrayList.remove((Object)'B');
        System.out.println("Data after removing element  B : " + arrayList);

        //add elements to the middle of the arrayList
        arrayList.add(1,'z');
        System.out.println("Data added to middle of arrayList z : " + arrayList);

        //retrieve element from the arrayList
        System.out.println("Second element of the arrayList : " + arrayList.get(1));

        //replace element with new value
        arrayList.set(1,"Collections");
        System.out.println("Data after replacing second element : " + arrayList);

        //Search elements in the arrayList
        System.out.println("Does arrayList Contain 2  : " + arrayList.contains(2) );
        System.out.println("Does arrayList Contain 'Threads'  : " + arrayList.contains("Threads") );

        System.out.println("is arrayList empty " + arrayList.isEmpty());

        //Read elements from arrayList
        for( int i=0; i< arrayList.size(); i++){
            System.out.println( "index : " +i + "  element : " + arrayList.get(i));
        }

        for(Object o : arrayList){
            System.out.println(o);
        }

        Iterator iterator = arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        stringList.add("Java");
        stringList.add("React");
        stringList.add("Angular");
        stringList.add("NodeJS");

        list.addAll(stringList);
        System.out.println(list);

        list.removeAll(stringList);
        System.out.println(list);

        //sorting and shuffling on the homogeneous data
        System.out.println("Elements of ArrayList before sorting : " + stringList);
        Collections.sort(stringList);
        System.out.println("Elements of ArrayList after sorting : " + stringList);
        Collections.sort(stringList,Collections.reverseOrder());
        System.out.println("Elements of ArrayList after reverse order sorting : " + stringList);

        Collections.shuffle(stringList);
        System.out.println("Elements of ArrayList after shuffling : " + stringList);

        //convert array into ArrayList
        String frontEnd[] = { "JavaScript", "Bootstrap","JQuery"};
        for(String tech: frontEnd ){
            System.out.println(tech);
        }

        ArrayList techArrayList = new ArrayList(Arrays.asList(frontEnd));
        System.out.println(techArrayList);
    }
}
