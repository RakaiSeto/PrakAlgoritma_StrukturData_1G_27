package Kuis2;

import P9.Node;

import javax.xml.crypto.Data;

public class LinkedList_26 {
    Node_26 head;
    Node_26 tail;
    int size = 0;

    public LinkedList_26() {
        head = null;
        tail = null;
    }

    public void addLastPembeli(Data_26 pembeli) {
        Node_26 newNode26 = new Node_26(pembeli, null, null);
        if (head == null) {
            head = newNode26;
            tail = newNode26;
        } else {
            newNode26.prev_26 = tail;
            tail.next_26 = newNode26;
            tail = newNode26;
        }
        size++;
    }

    public void addLastPesanan(Data_26 pesanan) {
        Node_26 newNode26 = new Node_26(pesanan, null, null);
        if (head == null) {
            head = newNode26;
            tail = newNode26;
        } else {
            newNode26.prev_26 = tail;
            tail.next_26 = newNode26;
            tail = newNode26;
        }
        size++;
    }

    public Node_26 removeAt(int index) {
        Node_26 returnNode26 = null;
        if (index < 0 || index > size) {
            System.out.println("Index out of bound");
        } else if (index == 0) {
            head = head.next_26;
            size--;
        } else {
            Node_26 current26 = head;
            for (int i = 0; i < index - 1; i++) {
                current26 = current26.next_26;
            }
            if (index == 1) {
                System.out.println("menghapus " + current26.data_26.pembeli.NamaPembeli_26);
                head = current26.next_26;
                current26.next_26.prev_26 = null;
                returnNode26 = current26;
            } else if (index != size) {
                System.out.println("menghapus " + current26.data_26.pembeli.NamaPembeli_26);
                current26.prev_26.next_26 = current26.next_26;
                returnNode26 = current26;
            } else {
                System.out.println("menghapus " + current26.data_26.pembeli.NamaPembeli_26);
                tail = current26.prev_26;
                current26.prev_26.next_26 = null;
                returnNode26 = current26;
            }
            size--;
        }
        return returnNode26;
    }

    public Node_26 removeFirst() {
        Node_26 returnNode26 = null;
        if (head == null) {
            System.out.println("List kosong");
        } else {
            returnNode26 = head;
            head = head.next_26;
            size--;
        }
        return returnNode26;
    }

    public void printAntrian() {
        Node_26 current26 = head;
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("Daftar Antrian Resto Royal Delish");
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("|No.\t|Nama Customer\t|No hp");
        if (current26 == null) {
            System.out.println("Antrian kosong");
        }
        while (current26 != null) {
            System.out.println("|" + current26.data_26.urutan + "\t\t|" + current26.data_26.pembeli.NamaPembeli_26 + "\t\t\t|" + current26.data_26.pembeli.NoHp_26);
            current26 = current26.next_26;
        }
        System.out.println("total antrian : " + size);
    }

    public void printPesanan() {
        Node_26 current26 = head;
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("Daftar Pesanan Masuk Resto Royal Delish");
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("|No.\t|Nama Pesanan\t|Harga");
        if (current26 == null) {
            System.out.println("Antrian kosong");
        }
        while (current26 != null) {
            System.out.println("|" + current26.data_26.urutan + "\t\t|" + current26.data_26.pesanan.NamaPesanan_26 + "\t\t\t|" + current26.data_26.pesanan.Harga_26);
            current26 = current26.next_26;
        }
        System.out.println("total antrian : " + size);
    }

    // Merge sort algorithm for linked list
    public Node_26 mergeSort(Node_26 head) {
        if (head == null || head.next_26 == null) {
            return head;
        }

        // Find the middle of the list
        Node_26 middle26 = getMiddle(head);
        Node_26 nextOfMiddle26 = middle26.next_26;

        // Set the next of middle26 node to null
        middle26.next_26 = null;

        // Apply mergeSort on left26 list
        Node_26 left26 = mergeSort(head);

        // Apply mergeSort on right26 list
        Node_26 right26 = mergeSort(nextOfMiddle26);

        // Merge the left26 and right26 lists
        Node_26 sortedList26 = sortedMerge(left26, right26);
        return sortedList26;
    }

    // Utility function to get the middle26 of the linked list
    public Node_26 getMiddle(Node_26 head) {
        if (head == null) {
            return head;
        }
        Node_26 slow = head, fast = head.next_26;
        while (fast != null) {
            fast = fast.next_26;
            if (fast != null) {
                slow = slow.next_26;
                fast = fast.next_26;
            }
        }
        return slow;
    }

    // Utility function to merge two sorted linked lists
    public Node_26 sortedMerge(Node_26 left26, Node_26 right26) {
        if (left26 == null) {
            return right26;
        }
        if (right26 == null) {
            return left26;
        }

        Node_26 result;
        if (left26.data_26.pesanan.NamaPesanan_26.compareTo(right26.data_26.pesanan.NamaPesanan_26) <= 0) {
            result = left26;
            result.next_26 = sortedMerge(left26.next_26, right26);
        } else {
            result = right26;
            result.next_26 = sortedMerge(left26, right26.next_26);
        }
        return result;
    }

    // Function to sort the linked list
    public void sort() {
        head = mergeSort(head);
    }

    public void hitungTotal() {
        Node_26 current = head;
        int total = 0;
        while (current != null) {
            total += current.data_26.pesanan.Harga_26;
            current = current.next_26;
        }
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("TOTAL PENDAPATAN");
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("Pendapatan hari ini :" + total);
    }
}
