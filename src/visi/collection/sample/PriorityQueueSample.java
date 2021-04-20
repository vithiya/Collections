package visi.collection.sample;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class PriorityQueueSample {

    public static void main(String[] args) {

        PriorityQueue priorityQueue = new PriorityQueue();

        priorityQueue.add('A');
        priorityQueue.add('B');
        priorityQueue.add('A');
        priorityQueue.add('C');
        priorityQueue.add('A');
        priorityQueue.offer('D');

        //Insertion order is not preserved, based on priority  order ascending by default and duplicates allowed
        System.out.println(priorityQueue);

        System.out.println("Head element using element() : "+ priorityQueue.element());
        System.out.println("Head element using peek() : "+ priorityQueue.peek());



        System.out.println("Return and remove element from queue : "+ priorityQueue.remove());
        System.out.println("After removing head element : "+ priorityQueue);

        System.out.println("Return and remove element from queue using : "+ priorityQueue.poll());
        System.out.println("After removing head element : "+ priorityQueue);

        Iterator it = priorityQueue.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        for (Object e : priorityQueue){
            System.out.println(e);
        }

        PriorityQueue emptyQueue = new PriorityQueue();
        System.out.println("Head element of empty queue using peek() : "+ emptyQueue.peek());

        //Adding heterogeneous data not allowed
        //System.out.println("Add heterogeneous data to queue :" + priorityQueue.offer(100));
        //System.out.println("Add heterogeneous data to queue :" + priorityQueue.add(200));

        //Heterogeneous data is allowed in linked list
        LinkedList linkedList = new LinkedList();

        linkedList.add('A');
        linkedList.add('B');
        linkedList.add('A');
        linkedList.add('C');
        linkedList.add(100);
        linkedList.offer('D');

        //Insertion order is not preserved, based on priority  order ascending by default and duplicates allowed
        System.out.println(linkedList);

        System.out.println("Head element of empty queue using element() : "+ emptyQueue.element());

    }
}
