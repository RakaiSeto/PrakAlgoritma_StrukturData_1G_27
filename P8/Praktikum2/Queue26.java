package P8.Praktikum2;

public class Queue26 {
    Nasabah26[] data;
    int front, rear, size, max;

    public Queue26(int n) {
        this.max = n;
        this.size = 0;
        this.front = this.rear = -1;
        this.data = new Nasabah26[n];
    }

    boolean isFull() {
        return this.size == this.max;
    }

    boolean isEmpty() {
        return this.size == 0;
    }

    void enqueue(Nasabah26 x) {
        if (!isFull()) {
            this.rear = (this.rear + 1) % this.max;
            this.data[this.rear] = x;
            this.size++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    Nasabah26 dequeue() {
        Nasabah26 x = new Nasabah26();
        if (!isEmpty()) {
            x = this.data[this.front];
            this.front = (this.front + 1) % this.max;
            this.size--;
        } else {
            System.out.println("Data kosong!");
        }
        return x;
    }

    void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan: " + this.data[this.front].norek + " " + this.data[this.front].nama + " " + this.data[this.front].alamat + " " + this.data[this.front].saldo);
        } else {
            System.out.println("Data kosong!");
        }
    }

    void peekBelakang() {
        if (!isEmpty()) {
            System.out.println("Elemen terbelakang: " + this.data[this.rear].norek + " " + this.data[this.rear].nama + " " + this.data[this.rear].alamat + " " + this.data[this.rear].saldo);
        } else {
            System.out.println("Data kosong!");
        }
    }

    void print() {
        if (!isEmpty()) {
            int i = this.front;
            while (i != this.rear) {
                System.out.println(this.data[i].norek + " " + this.data[i].nama + " " + this.data[i].alamat + " " + this.data[i].saldo);
                i = (i + 1) % this.max;
            }
            System.out.println(this.data[this.rear].norek + " " + this.data[this.rear].nama + " " + this.data[this.rear].alamat + " " + this.data[this.rear].saldo);
            System.out.println("Jumlah elemen = " + this.size);
        } else {
            System.out.println("Data kosong!");
        }
    }

    void clear() {
        this.size = 0;
        this.front = this.rear = -1;
    }
}
