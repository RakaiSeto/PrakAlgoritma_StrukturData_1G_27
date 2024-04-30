package P7;

public class StackKonversi {
    int size;
    int[] tumpukanBiner;
    int top;

    public StackKonversi() {
        this.size = 32;
        this.tumpukanBiner = new int[32];
        this.top = -1;
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public boolean isFull() {
        return this.top == this.size - 1;
    }

    public void push(int data) {
        if (!isFull()) {
            this.tumpukanBiner[++top] = data;
            System.out.println("Data " + data + " berhasil ditambahkan ke stack!");
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int data = this.tumpukanBiner[top];
            top--;
            return data;
        } else {
            System.out.println("Data kosong!");
            return -1;
        }
    }
}
