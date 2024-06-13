import java.util.Scanner;

public class mainUAS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\n");
        TransaksiRental rental = new TransaksiRental();

        BarangRental br1 = new BarangRental("AG 1234 KDD", "Datsun", "Mobil", 2021, 100000);
        BarangRental br2 = new BarangRental("N 3278 ABC", "Honda SUPRA X 125", "Motor", 2017, 50000);
        BarangRental br3 = new BarangRental("AG 8743 IS", "Toyota Innova Reborn", "Mobil", 2018, 250000);
        BarangRental br4 = new BarangRental("B 605 GIO", "Porsche 911 Spider", "Mobil", 2023, 550000);
        BarangRental br5 = new BarangRental("B 805 BBQ", "Toyota Innova Zenix", "Mobil", 2024, 600000);
        rental.addBarang(br1);
        rental.addBarang(br2);
        rental.addBarang(br3);
        rental.addBarang(br4);
        rental.addBarang(br5);


        int menu = -1;
        while (menu !=0) {
            System.out.println("\n===========MENU===========");
            System.out.println("1. Daftar Kendaraan");
            System.out.println("2. Peminjaman");
            System.out.println("3. Tampilkan seluruh transaksi");
            System.out.println("4. Urutkan Transaksi sesuai no TNKB");
            System.out.println("0. Keluar");
            menu = input.nextInt();
            input.nextLine();

            switch (menu) {
                case 1:
                System.out.println("Daftar Kendaraan Gio Ganteng 123");
                rental.PrintBarang();
                
                    break;
            
                default:
                    break;
            }
        }


        input.close();
    }
}
