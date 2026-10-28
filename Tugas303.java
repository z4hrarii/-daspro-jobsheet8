import java.util.Scanner;

public class Tugas303{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int jumlahToko;
        do {
            System.out.print("Masukkan jumlah toko: ");
            jumlahToko = sc.nextInt();
            if (jumlahToko < 1) {
                System.out.println("Jumlah toko minimal 1. Ulangi input!");
            } 
        } while (jumlahToko < 1);
        int totalSemuaBarang = 0;
        int tokoTerbanyak = 0;
        int barangTerbanyak = -1;
        String ringkasan = " ";

        for (int toko = 1; toko <= jumlahToko; toko++) {
            System.out.println("Toko " + toko);
            int jumlahPelanggan;
            do {
                System.out.print("  Jumlah pelanggan: ");
                jumlahPelanggan = sc.nextInt();
                if (jumlahPelanggan < 0) {
                    System.out.println("  Jumlah pelanggan tidak boleh negatif. Ulangi input!");
                }
            } while (jumlahPelanggan < 0);
            int totalBarangToko = 0;
            
            for (int pelanggan = 1; pelanggan <= jumlahPelanggan; pelanggan++) {
                int jumlahBarang;
                do {
                    System.out.print("    Jumlah barang pelanggan " + pelanggan + ": ");
                    jumlahBarang = sc.nextInt();
                    if (jumlahBarang < 0) {
                        System.out.println("    Jumlah barang tidak boleh negatif. Ulangi input!");
                    }
                } while (jumlahBarang < 0);

                totalBarangToko += jumlahBarang;
            }
            ringkasan += "Toko " + toko + " - pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangToko + "\n";
            totalSemuaBarang += totalBarangToko;

            if (totalBarangToko > barangTerbanyak) {
                barangTerbanyak = totalBarangToko;
                tokoTerbanyak = toko;
            }
        }

        System.out.println();
        System.out.print(ringkasan);
        System.out.println(" Total barang seluruh toko: " + totalSemuaBarang);
        System.out.println(" Toko dengan barang terbanyak: " + tokoTerbanyak);

        sc.close();
    }

}