public class node {
    BarangRental barang;
    node prev, next;

    public node (node p, BarangRental br, node n){
        prev = p;
        barang = br;
        next = n;
    }

}

class BarangRental {
    int tahun, biaya_sewa;
    String noTNKB, namaKendaraan, jenisKendaraan;

    BarangRental(String no, String nama, String jenis, int tahun, int biaya) {
        noTNKB = no;
        namaKendaraan = nama;
        jenisKendaraan = jenis;
        this.tahun = tahun;
        biaya_sewa = biaya;
    }
    BarangRental(){}
}


class TransaksiRental{
    public node head;
    public int size;
    int kdTRX = 1, lamaPinjam;
    String namaPeminjam;
    double totalBiaya;
    BarangRental barang;
    TransaksiRental(){
        head = null;
        size = 0;
    }
    TransaksiRental( String nama, int lama, BarangRental br){
        kdTRX += 1;
        namaPeminjam = nama;
        lamaPinjam = lama;
        totalBiaya = lama * br.biaya_sewa;
        barang = br;
    }

    public void addBarang(BarangRental item) {
        if (isEmpty()) {
            head = new node(null, item, head);
        } else {
            node newNode = new node(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void size() {
        System.out.println(size);
    }



    public void totBI(int lamaPinjam, int biaya){
        totalBiaya = lamaPinjam * biaya;
    }

    public void PrintBarang(){
        node current = head;
        System.out.printf("| %-12s | %-20s | %-12s | %-7s | %-20s\n", "No TNKB", "Nama Kendaraan", "Jenis", "Tahun", "Biaya Sewa Perjam");
       while (current != null) {
        System.out.printf("| %-12s | %-20s | %-12s | %-7d | %-20s\n", current.barang.noTNKB, current.barang.namaKendaraan, current.barang.jenisKendaraan, current.barang.tahun, current.barang.biaya_sewa);

        current = current.next;
       }
    }
    

    public void PrintTrx(){
        if (isEmpty()) {
            System.out.println("Belum ada Transaksi masuk kak :)");
        }else{
            node current = head;
            System.out.printf("| %-4s | %-8s | %-25s | %-25s | %-5s | %-15s \n", "Kode", "no TNKB", "Nama Barang", "Nama Peminjam" , "Lama Pinjam", "Total Biaya");
            while (current != null) {
                System.out.printf("| %-4s | %-8s | %-25s | %-25s | %-5s | %-15s \n", kdTRX, current.barang.noTNKB, namaPeminjam);

                current = current.next;
            }
        }
    }



}

