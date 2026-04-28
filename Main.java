public class Main {

    public static void main(String[] args) {

        AQueue<String> queue = new LinkedListQueue<>();

        // all very significant computer science people
        // in no particular order
        queue.push("Hatsune Miku");
        queue.push("Alan Turing");
        queue.push("Dennis Ritchie");
        queue.push("Grace Hopper");
        queue.push("Ada Lovelace");
        queue.push("John von Neumann");
        queue.push("Linus Torvalds");
        queue.push("Edsger W. Dijkstra");
        queue.push("Tim Berners-Lee");

        System.out.println("Original list:");
        queue.display();
        // Node: Hatsune Miku
        // Node: Alan Turing
        // Node: Dennis Ritchie
        // Node: Grace Hopper
        // Node: Ada Lovelace
        // Node: John von Neumann
        // Node: Linus Torvalds
        // Node: Edsger W. Dijkstra
        // Node: Tim Berners-Lee

        System.out.println("\nPopping...");

        System.out.println("Popped: " + queue.pop());
        System.out.println("Popped: " + queue.pop());
        System.out.println("Popped: " + queue.pop());

        System.out.println("\nNew list:");
        queue.display();
        // Node: Grace Hopper
        // Node: Ada Lovelace
        // Node: John von Neumann
        // Node: Linus Torvalds
        // Node: Edsger W. Dijkstra
        // Node: Tim Berners-Lee

    }

}
