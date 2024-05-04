package P8.Praktikum1;

public class Queue26 {
    int[] data;
    int front, rear, size, max;

    public Queue26(int n) {
        this.max = n;
        this.size = 0;
        this.front = this.rear = -1;
        this.data = new int[n];
    }

    boolean isFull() {
        return this.size == this.max;
    }

    boolean isEmpty() {
        return this.size == 0;
    }

    void enqueue(int x) {
        if (!isFull()) {
            this.rear = (this.rear + 1) % this.max;
            this.data[this.rear] = x;
            this.size++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    int dequeue() {
        if (!isEmpty()) {
            int x = this.data[this.front];
            this.front = (this.front + 1) % this.max;
            this.size--;
            return x;
        } else {
            System.out.println("Data kosong!");
            return -1;
        }
    }

    void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan: " + this.data[this.front]);
        } else {
            System.out.println("Data kosong!");
        }
    }

    void print() {
        if (!isEmpty()) {
            int i = this.front;
            while (i != this.rear) {
                System.out.print(this.data[i] + " ");
                i = (i + 1) % this.max;
            }
            System.out.println(this.data[this.rear]);
        } else {
            System.out.println("Data kosong!");
        }
    }

    void clear() {
        this.size = 0;
        this.front = this.rear = -1;
    }
}
