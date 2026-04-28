public class Node<T> {

    /**
     * The element value of the node.
     */
    private T element;
    /**
     * The node that comes after this one in the linked list.
     */
    private Node<T> next;
    /**
     * The node that comes before this one in the linked list.
     */
    private Node<T> prev;

    /**
     * Constructs a new node object with a given element. Next and previous
     * fields are set to null.
     */
    public Node(T element) {
        this.element = element;
        this.next = null;
        this.prev = null;
    }

    /**
     * Returns the element value of this node.
     *
     * @return element value.
     */
    public T getElement() {
        return this.element;
    }

    /**
     * Sets the element value of this node.
     *
     * @param element the value of the element to be added.
     */
    public void setElement(T element) {
        this.element = element;
    }

    /**
     * Returns the next node object.
     *
     * @return next node object.
     */
    public Node<T> getNext() {
        return this.next;
    }

    /**
     * Sets the node that comes after this one.
     *
     * @param node next node object.
     */
    public void setNext(Node<T> node) {
        this.next = node;
    }

    /**
     * Returns the previous node object.
     *
     * @return previous node object.
     */
    public Node<T> getPrev() {
        return this.prev;
    }

    /**
     * Sets the node that comes before this one.
     *
     * @param node previous node object.
     */
    public void setPrev(Node<T> node) {
        this.prev = node;
    }

    @Override
    public String toString() {
        return "Node: " + element;
    }

}
