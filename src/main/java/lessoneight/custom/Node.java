package lessoneight.custom;

public class Node {
    private Integer data;
    private  Node next;

    public Integer getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node(Integer data, Node next) {
        this.data = data;
        this.next = next;
    }
}
