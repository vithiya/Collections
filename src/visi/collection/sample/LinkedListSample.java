package visi.collection.sample;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

import static java.lang.Boolean.TRUE;

public class LinkedListSample {

    public static void main(String[] args) {

        //Declare heterogeneous linked list
        LinkedList linkedList = new LinkedList();
        linkedList.add("Welcome");
        linkedList.add("1000");
        linkedList.add(TRUE);
        linkedList.add(null);
        linkedList.add(" Collection");
        linkedList.add('@');
        linkedList.add(98.5);

        System.out.println(linkedList);
        System.out.println("No of elements in the linked list : " +linkedList.size());

        linkedList.remove(5);
        System.out.println("Linkedlist after removing element: " + linkedList);

        //Insert element in the middle of linkedList
        linkedList.add(5,"LinkedList");
        System.out.println(linkedList);

        System.out.println("3rd element of the linkedList : " + linkedList.get(2));

        //replace the value in a given index
        linkedList.set(4,"new element");
        System.out.println("After replacing 4th element : " + linkedList);

        System.out.println("linked list contains @ element : " + linkedList.contains("@"));
        System.out.println("linked list contains 98.5 element : " + linkedList.contains(98.5));
        System.out.println("Checking linked list is empty?  : " + linkedList.isEmpty());

        for(int i=0; i< linkedList.size(); i++ ){
            System.out.println(linkedList.get(i));
        }

        for (Object element: linkedList) {
            System.out.println(element);
        }

        Iterator it = linkedList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }



        //Declare homogeneous linked list
        LinkedList<String> stringLinkedList = new LinkedList<String>();
        stringLinkedList.add("Docker");
        stringLinkedList.add("Kubernetes");
        stringLinkedList.add("Jenkins");
        stringLinkedList.add("Git");

        LinkedList<String> ciCd = new LinkedList<String>();
        ciCd.addAll(stringLinkedList);

        System.out.println("Elements in ciCd linked list : "+ ciCd);
        ciCd.removeAll(stringLinkedList);
        System.out.println("Elements in ciCd linked list after removing : "+ ciCd);

        //sorting
        System.out.println("Before Sorting linkedList : "+ stringLinkedList);
        Collections.sort(stringLinkedList);
        System.out.println("After Sorting linkedList : "+ stringLinkedList);
        Collections.sort(stringLinkedList, Collections.reverseOrder());
        System.out.println("After Sorting in reverse order linkedList : "+ stringLinkedList);
        Collections.shuffle(stringLinkedList);
        System.out.println("After shuffling linkedList : "+ stringLinkedList);

        LinkedList frontEnd = new LinkedList();
        frontEnd.add("JavaScript");
        frontEnd.add("React");
        frontEnd.add("JavaScript");
        frontEnd.add("Vue");

        System.out.println(frontEnd);
        frontEnd.addFirst("HTML");
        frontEnd.addLast("TypeScript");
        System.out.println(frontEnd);

        System.out.println("Retrieve first element : " + frontEnd.getFirst());
        System.out.println("Retrieve last element : " + frontEnd.getLast());

        frontEnd.removeFirst();
        frontEnd.removeLast();
        System.out.println("After removing first and last element : " +frontEnd);


    }
}
