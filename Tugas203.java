import java.util.Scanner;

public class Tugas203 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.print("Masukkan nilai n (minimal 3) : ");
            n = sc.nextInt();
            if (n < 1) {
                System.out.println("n harus minimal 1. Ulangi input!");
            }
        } while (n < 3);
        int lebar = String.valueOf(n * n).length() + 1;
        String format = "%" + lebar + "d";
        int jumlah = 0;

        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int hasil = i * j;
                System.out.printf(format, hasil);
                jumlah += hasil;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Jumlah seluruh angka pada tabel = " + jumlah);
        sc.close();
    }
}