package UAS;

public class DoubleLinkedList {
    Node head;
    Node tail;
    int size = 0;

    public DoubleLinkedList() {
        head = null;
        tail = null;
    }

    public void addFirst(Data data) {
        Node newNode = new Node(data, null, null);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Data data) {
        Node newNode = new Node(data, null, null);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void printKendaraan() {
        Node current = head;
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Data Kendaraan");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("|Nomor TNKB\t|Nama Pemilik\t|Jenis\t|CC Kendaraan\t|Tahun\t|Bulan Harus Bayar");
        if (current == null) {
            System.out.println("Data kosong");
            return;
        }
        while (current != null) {
            System.out.printf("|%s\t|%s\t\t\t|%s\t|%d\t\t\t|%d\t|%d\n", current.data.kendaraan.noTNKB, current.data.kendaraan.nama, current.data.kendaraan.jenis, current.data.kendaraan.cc, current.data.kendaraan.tahun, current.data.kendaraan.bulanHarusBayar);
            current = current.next;
        }
    }

    public boolean searchKendaraan(String noTNKB) {
        Node current = head;
        while (current != null) {
            if (current.data.kendaraan.noTNKB.equals(noTNKB)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void printBayar() {
        Node current = head;
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Daftar Transaksi Pembayaran Pajak");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("|Kode\t|TNKB\t\t|Nama\t|Nominal\t|Denda");
        if (current == null) {
            System.out.println("Data kosong");
            return;
        }
        while (current != null) {
            System.out.printf("|%d\t\t|%s\t|%s\t|%d\t|%d\n", current.data.transaksiPajak.kode, current.data.transaksiPajak.kendaraan.noTNKB, current.data.transaksiPajak.kendaraan.nama, current.data.transaksiPajak.nominalBayar, current.data.transaksiPajak.denda);
            current = current.next;
        }
    }

    public void urutkanNama() {
        Node current = head;
        Node index = null;
        Data temp;
        if (head != null) {
            while (current != null) {
                index = current.next;
                while (index != null) {
                    if (current.data.transaksiPajak.kendaraan.nama.compareTo(index.data.transaksiPajak.kendaraan.nama) > 0) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    public Kendaraan getKendaraan(String noTNKB) {
        Node current = head;
        while (current != null) {
            if (current.data.kendaraan.noTNKB.equals(noTNKB)) {
                return current.data.kendaraan;
            }
            current = current.next;
        }
        return null;
    }


}
