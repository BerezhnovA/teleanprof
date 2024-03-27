package lessoneight.custom;

public class CustomLinkedList {

    private Node head;
    private int size;

    public void add(int data) {
        Node newNode = new Node(data, null);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(newNode);

    }

    public void add(int index, int data) {
        if (index < 1|| index>=size) {
            System.out.println("Index out of bounds");
            return;
        }
        size++;

        Node newNode = new Node(data, null);
        Node current = head;
        int count = 0;
        while (count < index - 1) {
            current = current.getNext();
            count++;
        }
        Node next = current.getNext();
        newNode.setNext(next);
        current.setNext(newNode);

    }

    public void addFirst(int data) {

        Node newNode = new Node(data, null);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.setNext(head);
        head = newNode;
    }

    private String print() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.getData()).append(" ");
            current = current.getNext();
        }
        return sb.toString();
    }

    public int size() {
        return size;

    }

    @Override
    public String toString() {
        return print();
    }
}

