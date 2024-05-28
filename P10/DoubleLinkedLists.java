package P10;

public class DoubleLinkedLists {
    Node head;
    int size;

    public DoubleLinkedLists() {
        head = null;
        size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(int data) {
        if (isEmpty()) {
            head = new Node(data, null, null);
        } else {
            Node newNode = new Node(data, null, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    void addLast(int data) {
        if (isEmpty()) {
            addFirst(data);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(data, current, null);
            current.next = newNode;
            size++;
        }
    }

    void add(int item, int index){
        if (isEmpty()) {
            addFirst(item);
        } else {
            if (index < 0 || index > size) {
                System.out.println("Index out of bound");
            } else {
                Node current = head;
                for (int i = 0; i < index - 1; i++) {
                    current = current.next;
                }
                if (index == 0) {
                    addFirst(item);
                } else {
                    Node newNode = new Node(item, current, current.next);
                    current.next = newNode;
                    newNode.next.prev = newNode;
                    size++;
                }
            }
        }
    }

    int size() {
        return size;
    }

    void clear() {
        head = null;
        size = 0;
    }

    void print() {
        if (!isEmpty()) {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        } else {
            System.out.println("List is empty");
        }
    }
}
