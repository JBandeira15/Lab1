package pt.pa;

import pt.pa.adts.Queue;
import pt.pa.adts.QueueLinkedList;

public class Main {

    public static void main(String[] args) {

        Queue<Integer> queue = new QueueLinkedList<>();

        //TODO: testar implementação

        queue.enqueue(2);
        queue.enqueue(5);
        System.out.println(queue.front());

    }
}
