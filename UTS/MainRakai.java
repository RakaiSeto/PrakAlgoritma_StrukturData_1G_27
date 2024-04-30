package UTS;

import java.util.Scanner;

public class MainRakai {
    static NasabahRakai[] arrRakai = new NasabahRakai[6];
    public static void main(String[] args) {
        Scanner scRakai = new Scanner(System.in);

        for (int iRakai = 0; iRakai < arrRakai.length; iRakai++) {
            System.out.print("Masukkan no rekening: ");
            String norekRakai = scRakai.next();

            System.out.print("Masukkan nama: ");
            String namaRakai = scRakai.next();

            System.out.print("Masukkan NIK: ");
            String nikRakai = scRakai.next();

            System.out.print("Masukkan umur: ");
            int umurRakai = scRakai.nextInt();

            System.out.print("Masukkan saldo: ");
            double saldoRakai = scRakai.nextDouble();
            scRakai.nextLine();

            arrRakai[iRakai] = new NasabahRakai(norekRakai, namaRakai, nikRakai, umurRakai, saldoRakai);
        }

        int pilihanRakai = -1;
        while (pilihanRakai == -1) {
            System.out.println("===== Menu =====");
            System.out.println("1. Tampilkan Data Nasabah");
            System.out.println("2. Cari Data Nasabah (nama)");
            System.out.println("3. Urutkan Data Nasabah (umur termuda)");
            System.out.println("4. Keluar");
            System.out.println("================");
            System.out.print("Pilihan Menu: ");
            pilihanRakai = scRakai.nextInt();
            scRakai.nextLine();

            if (pilihanRakai == 1) {
                tampilkanDataRakai(arrRakai);
                pilihanRakai = -1;
            } else if (pilihanRakai == 2) {
                System.out.print("Masukkan nama yang dicari: ");
                String namaRakai = scRakai.next();

                NasabahRakai[] tempRakai = urutkanNama(arrRakai);
                int indexRakai = cariData(tempRakai, namaRakai);
                if (indexRakai != -1) {
                    tampilkanSatuData(arrRakai[indexRakai]);
                } else {
                    System.out.println("Data tidak ditemukan");
                    System.out.println("================");
                }
                pilihanRakai = -1;
            } else if (pilihanRakai == 3) {
                NasabahRakai[] tempRakai = urutkanUmur(arrRakai);
                tampilkanDataRakai(tempRakai);
                pilihanRakai = -1;
            } else if (pilihanRakai == 4) {
                System.out.println("Terima kasih telah menggunakan program ini");
                System.exit(0);
            } else {
                System.out.println("pilihan tidak ditemukan");
                pilihanRakai = -1;
            }
        }
    }

    static void tampilkanSatuData(NasabahRakai dataRakai) {
        System.out.println("No Rekening: " + dataRakai.norek);
        System.out.println("Nama: " + dataRakai.nama);
        System.out.println("NIK: " + dataRakai.nik);
        System.out.println("Umur: " + dataRakai.umur);
        System.out.println("Saldo: " + dataRakai.saldo);
        System.out.println("================");
    }

    static void tampilkanDataRakai(NasabahRakai[] arrRakai) {
        for (NasabahRakai nasabahRakai : arrRakai) {
            System.out.println("No Rekening: " + nasabahRakai.norek);
            System.out.println("Nama: " + nasabahRakai.nama);
            System.out.println("NIK: " + nasabahRakai.nik);
            System.out.println("Umur: " + nasabahRakai.umur);
            System.out.println("Saldo: " + nasabahRakai.saldo);
            System.out.println("================");
        }
    }

    static int cariData(NasabahRakai[] arrRakai, String namaRakai) {
        int lRakai = 0, rRakai = arrRakai.length - 1;

        while (lRakai <= rRakai) {
            int mRakai = lRakai + (rRakai - lRakai) / 2;
            int resRakai = namaRakai.compareToIgnoreCase(arrRakai[mRakai].nama);

            if (resRakai == 0) {
                return mRakai;
            } else if (resRakai > 0) {
                lRakai = mRakai + 1;
            } else {
                rRakai = mRakai - 1;
            }
        }

        return -1;
    }

    static NasabahRakai[] urutkanNama(NasabahRakai[] arrRakai) {
        for (int iRakai = 0; iRakai < arrRakai.length; iRakai++) {
            for (int jRakai = iRakai + 1; jRakai < arrRakai.length; jRakai++) {
                if (arrRakai[iRakai].nama.compareToIgnoreCase(arrRakai[jRakai].nama) > 0) {
                    NasabahRakai temp = arrRakai[iRakai];
                    arrRakai[iRakai] = arrRakai[jRakai];
                    arrRakai[jRakai] = temp;
                }
            }
        }
        return arrRakai;
    }

    static NasabahRakai[] urutkanUmur(NasabahRakai[] arrRakai) {
        for (int iRakai = 1; iRakai < arrRakai.length; iRakai++) {
            NasabahRakai key = arrRakai[iRakai];
            int jRakai = iRakai - 1;
            while (jRakai >= 0 && arrRakai[jRakai].umur > key.umur) {
                arrRakai[jRakai + 1] = arrRakai[jRakai];
                jRakai = jRakai - 1;
            }
            arrRakai[jRakai + 1] = key;
        }
        return arrRakai;
    }
}