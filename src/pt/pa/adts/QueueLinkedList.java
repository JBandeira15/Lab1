package pt.pa.adts;

/**
 * TODO: Fornecer documentação da classe.
 *
 * @param <T>
 */
public class QueueLinkedList<T> implements Queue<T> {

    private Node header, trailer;
    private int size;
    private int capacity;

    public QueueLinkedList(int capacity) {
        //TODO: construtor deve inicializar uma fila vazia
        clear();
        this.capacity = capacity;
        this.trailer = new Node(null, null, null);
        this.header = new Node(null, trailer, null);


        this.trailer.next = header;
        this.size = 0;

    }

    @Override
    public void enqueue(T element) throws FullQueueException {
        if(size() == capacity) throw new FullQueueException();

        Node newNode = new Node(element, trailer, trailer.next);
        trailer.next.prev = newNode;
        trailer.next = newNode;


        this.size++;


    }

    @Override
    public T dequeue() throws EmptyQueueException{
        if(isEmpty()) throw new EmptyQueueException();

        T elem = header.prev.element;

        header = header.prev;

        size--;

        return elem;
    }

    @Override
    public T front() throws EmptyQueueException{

        if(isEmpty()) throw new EmptyQueueException();

        return header.prev.element;
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

        while(!isEmpty()){
            dequeue();
        }

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
