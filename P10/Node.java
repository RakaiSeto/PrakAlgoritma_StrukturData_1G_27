package P10;

public class Node {
    int data;
    Node prev, next;

    public Node(int d, Node p, Node n){
        data = d;
        prev = p;
        next = n;
    }
}
