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

    void removeFirst() {
        if (!isEmpty()) {
            if (size == 1) {
                head = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            size--;
        } else {
            System.out.println("List is empty");
        }
    }

    void removeLast() {
        if (!isEmpty()) {
            if (size == 1) {
                head = null;
            } else {
                Node current = head;
                while (current.next.next != null) {
                    current = current.next;
                }
                current.next = null;
            }
            size--;
        } else {
            System.out.println("List is empty");
        }
    }

    void remove(int index) {
        if (!isEmpty()) {
            if (index < 0 || index >= size) {
                System.out.println("Index out of bound");
            } else {
                if (index == 0) {
                    removeFirst();
                } else {
                    Node current = head;
                    for (int i = 0; i < index - 1; i++) {
                        current = current.next;
                    }
                    current.next = current.next.next;
                    current.next.prev = current;
                    size--;
                }
            }
        } else {
            System.out.println("List is empty");
        }
    }

    int getFirst() {
        if (!isEmpty()) {
            return head.data;
        } else {
            return -1;
        }
    }

    int getLast() {
        if (!isEmpty()) {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            return current.data;
        } else {
            return -1;
        }
    }

    int get(int index) {
        if (!isEmpty()) {
            if (index < 0 || index >= size) {
                System.out.println("Index out of bound");
                return -1;
            } else {
                Node current = head;
                for (int i = 0; i < index; i++) {
                    current = current.next;
                }
                return current.data;
            }
        } else {
            return -1;
        }
    }
}
