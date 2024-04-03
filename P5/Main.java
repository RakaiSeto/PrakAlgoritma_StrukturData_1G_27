package P5;

public class Main {
    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi list = new DaftarMahasiswaBerprestasi();
        Mahasiswa m1 = new Mahasiswa("Rakai", 2018, 20, 3.9);
        Mahasiswa m2 = new Mahasiswa("Raihan", 2018, 20, 3.7);
        Mahasiswa m3 = new Mahasiswa("Rai", 2018, 20, 3.5);
        Mahasiswa m4 = new Mahasiswa("Raka", 2018, 20, 3.6);
        Mahasiswa m5 = new Mahasiswa("Ayleen", 2018, 20, 3.8);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data Mahasiswa sebelum sorting: ");
        list.Tampil();

        System.out.println("Data Mahasiswa setelah sorting desc berdasarkan IPK: ");
        list.BubbleSort();
        list.Tampil();

        System.out.println("Data Mahasiswa setelah sorting asc berdasarkan IPK: ");
        list.SelectionSort();
        list.Tampil();

        System.out.println("Data Mahasiswa setelah sorting asc berdasarkan IPK: ");
        list.InsertionSort();
        list.Tampil();

    }
}
