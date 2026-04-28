/**
 * TODO Write a one-sentence summary of your class here.
 * TODO Follow it with additional details about its purpose, what abstraction
 * it represents, and how to use it.
 *
 * @author  TODO Your Name
 * @version Apr 27, 2026
 */
public class LinkedListQueue<T> extends AQueue<T> {
    
    public LinkedListQueue() {
        this.head = null;
        this.tail = null;
    }

    @Override
    public void push(T element) {
        Node<T> newNode = new Node<>(element);

        if (this.tail != null) {
            newNode.setPrev(this.tail);
            this.tail.setNext(newNode);
        }

        if (this.head == null) {
            this.head = newNode;
        }

        this.tail = newNode;
    }
    
    @Override
    public T pop() {
        if (this.head == null) {
            return null;
        }

        T element = this.head.getElement();
        this.head = this.head.getNext();

        if (this.head != null) {
            this.head.setPrev(null);
        } else {
            // Queue is now empty — clear tail too
            this.tail = null;
        }

        return element;
    }
    
    @Override
    public void display() {
        Node<T> current = this.head;
        while (current != null) {
            System.out.println(current);
            current = current.getNext();
        }
    }
}
