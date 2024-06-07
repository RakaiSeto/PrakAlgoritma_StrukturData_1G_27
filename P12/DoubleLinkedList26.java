package P12;

public class DoubleLinkedList26 {
    Node26 head;
    int size;

    public DoubleLinkedList26() {
        head = null;
        size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(int data, int jarak) {
        if (isEmpty()) {
            head = new Node26(data, jarak, null, null);
        } else {
            Node26 newNode = new Node26(data, jarak, null, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    void addLast(int data, int jarak) {
        if (isEmpty()) {
            addFirst(data, jarak);
        } else {
            Node26 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node26 newNode = new Node26(data, jarak, current, null);
            current.next = newNode;
            size++;
        }
    }

    void add(int item, int index, int jarak) {
        if (isEmpty()) {
            addFirst(item, jarak);
        } else {
            if (index < 0 || index > size) {
                System.out.println("Index out of bound");
            } else {
                Node26 current = head;
                for (int i = 0; i < index - 1; i++) {
                    current = current.next;
                }
                if (index == 0) {
                    addFirst(item, jarak);
                } else {
                    Node26 newNode = new Node26(item, jarak, current, current.next);
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
            Node26 current = head;
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
                Node26 current = head;
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
        Node26 current = head;
        while (current != null) {
            if (current.data == index) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                size--;
                break;
            }
            current = current.next;
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
            Node26 current = head;
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
                Node26 current = head;
                for (int i = 0; i < index; i++) {
                    current = current.next;
                }
                return current.data;
            }
        } else {
            return -1;
        }
    }

    int getJarak(int index) {
        if (!isEmpty()) {
            if (index < 0 || index >= size) {
                System.out.println("Index out of bound");
                return -1;
            } else {
                Node26 current = head;
                for (int i = 0; i < index; i++) {
                    current = current.next;
                }
                return current.jarak;
            }
        } else {
            return -1;
        }
    }
}
