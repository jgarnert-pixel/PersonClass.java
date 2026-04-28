public abstract class AQueue<T> {

    /**
     * The first node in the linked list queue.
     * Marked as `protected` for convenience.
     */
    protected Node<T> head;

    /**
     * The last node in the linked list queue.
     * Marked as `protected` for convenience.
     */
    protected Node<T> tail;

    /**
     * Add an element node to the back of the queue.
     * If the tail is not null, this node's previous should become the old tail
     * and the old tail's next should become this node.
     * If the head is null, this node should become the new head.
     * Regardless, this new node should become the tail.
     *
     * @param element the value of the node to be added.
     */
    public abstract void push(T element);

    /**
     * Remove the head node and return it to the user.
     * If the head is null, and therefore the queue is empty, null should be
     * returned.
     * Otherwise, the element of the head node should be extracted, the head
     * node's next node should become the new head, and the original head's
     * element should be returned.
     *
     * @return value of the head node if exists. null otherwise.
     */
    public abstract T pop();

    /**
     * Print out all the elements in the list. Works regardless of length.
     */
    public abstract void display();

}
