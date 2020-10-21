package pt.pa.adts;

/**
 * TODO: Fornecer documentação da classe.
 *
 * @param <T>
 */
public class QueueLinkedList<T> implements Queue<T> {

    private Node header, trailer;
    private int size;

    public QueueLinkedList() {
        //TODO: construtor deve inicializar uma fila vazia
        this.header = new Node(null, null, null);
        this.trailer = new Node(null, header, null);

        this.header.next = trailer;
        this.size = 0;

    }

    @Override
    public void enqueue(T element) throws FullQueueException {

        Node newNode = new Node(element, header, header.next);
        header.next.prev = newNode;
        //header.next = newNode;


        this.size++;

    }

    @Override
    public T dequeue() throws EmptyQueueException{
        if(isEmpty()) throw new EmptyQueueException();



        return null;
    }

    @Override
    public T front() throws EmptyQueueException{
        if(isEmpty()) throw new EmptyQueueException();

        return trailer.prev.element;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return (this.size==0);
    }

    @Override
    public void clear() {

    }

    //TODO: implementar métodos da interface à custa da estrutura de dados fornecida

    private class Node {
        private T element;
        private Node next;
        private Node prev;

        public Node(T element, Node prev, Node next) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }
}
