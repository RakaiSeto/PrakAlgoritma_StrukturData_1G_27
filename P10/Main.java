package P10;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedLists dll = new DoubleLinkedLists();
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("=========================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("=========================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("=========================");
        System.out.println("Data awal pada Linked list : "+dll.getFirst());
        System.out.println("Data akhir pada Linked list : "+dll.getLast());
        System.out.println("Data indeks ke 1 pada Linked list : "+dll.get(1));
    }
}
