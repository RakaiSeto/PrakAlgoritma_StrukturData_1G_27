package P5;

public class HotelService {
    Hotel rooms[] = new Hotel[10];

    public void tambah(Hotel h) {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] == null) {
                rooms[i] = h;
                break;
            }
        }
    }

    public void tampilAll() {
        for (Hotel h : rooms) {
            if (h != null) {
                System.out.println("Nama: " + h.nama);
                System.out.println("Kota: " + h.kota);
                System.out.println("Harga: " + h.harga);
                System.out.println("Bintang: " + h.bintang);
                System.out.println("--------------------");
            }
        }
    }

    public void bubbleSort() {
        for (int i = 0; i < rooms.length - 1; i++) {
            for (int j = 1; j < rooms.length - i; j++) {
                if (rooms[j].harga > rooms[j - 1].harga) {
                    Hotel tmp = rooms[j];
                    rooms[j] = rooms[j - 1];
                    rooms[j - 1] = tmp;
                }
            }
        }
    }

    public void selectionSort() {
        for (int i = 0; i < rooms.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < rooms.length; j++) {
                if (rooms[j].harga < rooms[idxMin].harga) {
                    idxMin = j;
                }
            }
            Hotel tmp = rooms[idxMin];
            rooms[idxMin] = rooms[i];
            rooms[i] = tmp;
        }
    }
}
