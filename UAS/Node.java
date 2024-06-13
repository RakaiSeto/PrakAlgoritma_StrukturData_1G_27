package UAS;

public class Node {
    Data data;
    Node prev, next;

    public Node(Data d, Node p, Node n) {
        data = d;
        prev = p;
        next = n;
    }
}
