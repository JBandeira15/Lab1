package pt.pa;

import pt.pa.adts.Queue;
import pt.pa.adts.QueueLinkedList;

public class Main {

    public static void main(String[] args) {

        Queue<Integer> queue = new QueueLinkedList<>();

        //TODO: testar implementação
        System.out.println("Tamanho atual da fila: " + queue.size());
        queue.enqueue(2);
        System.out.println("Tamanho atual da fila: " + queue.size());
        queue.enqueue(5);
        System.out.println("Tamanho atual da fila: " + queue.size());
        queue.enqueue(7);
        System.out.println("Tamanho atual da fila: " + queue.size());
        queue.enqueue(10);
        System.out.println("Tamanho atual da fila: " + queue.size());

        try {
            System.out.println("Front: " + queue.front());
            System.out.println("Elemento retirado: " + queue.dequeue());
            System.out.println("Tamanho atual da fila: " + queue.size());

            System.out.println("\nNova Front: " + queue.front());
            System.out.println("Elemento Retirado: " + queue.dequeue());
            System.out.println("Tamanho atual da fila: " + queue.size());

            System.out.println("\nNova Front: " + queue.front());
            System.out.println("Elemento Retirado: " + queue.dequeue());
            System.out.println("Tamanho atual da fila: " + queue.size());

            System.out.println("\nNova Front: " + queue.front());
            System.out.println("Elemento Retirado: " + queue.dequeue());
            System.out.println("Tamanho atual da fila: " + queue.size());

            System.out.println("Queue está vazia?" + queue.isEmpty());



            queue.enqueue(13);
            System.out.println("\n" + queue.size());
            System.out.println("Queue está vazia?" + queue.isEmpty());
            queue.clear();
            System.out.println("Queue está vazia?" + queue.isEmpty());

            System.out.println(queue.dequeue());

        } catch(Exception e){
            System.out.println(e.getMessage());
        }






    }
}
