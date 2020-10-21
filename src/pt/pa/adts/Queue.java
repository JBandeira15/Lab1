package pt.pa.adts;

/**
 * Uma fila é um contentor de elementos que garante uma política de acesso FIFO
 *
 *
 * @param <T> tipo de elemento a armazenar na fila.
 */
public interface Queue<T> {

    //TODO: definir operações do ADT e documentá-las

    /**
     *  Insere o elemento no final da fila.
     * @param element elemento a inserir.
     *
     * @throws FullQueueException se não houver capacidade/memória para mais elementos
     */
    public void enqueue(T element) throws  FullQueueException;

    /**
     * Remove o elemento no início da fila.
     * @return o elemento no inicio da fila.
     * @throws EmptyQueueException se a fila estiver vazia.
     */
    public T dequeue();

    /**
     * Mostra o elemento no inicio da fila.
     *
     * @return o elemento no inicio da fila.
     */
    public T front() throws EmptyQueueException;

    /**
     * Devolve o número de elementos atualmente na fila.
     * @return o número de elementos na fila.
     */
    public int size();

    /**
     * Devolve um valor lógico que indica se a fila está ou não vazia.
     * @return true Se a fila se encontra vazia. false, caso não esteja vazia.
     */
    public boolean isEmpty();

    /**
     * Descarta todos os elementos presentes na fila.
     */
    public void clear();

}
