import java.util.Scanner;

class jobsheet07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaPerCup = 18000, jumlahCup, uangBayar, totalHarga, totalBayar, kembalian, kurang, diskon = 0;

        System.out.print("Masukan jumlah cup : ");
        jumlahCup = sc.nextInt();

        System.out.print("Masukan Uang yang dibayar : ");
        uangBayar = sc.nextInt();

        totalHarga = jumlahCup * hargaPerCup;

        if (totalHarga > 100000) {
            diskon = totalHarga * (10 * 100);
        }

        totalBayar = totalHarga - diskon;

        System.out.println("Total harga : " + totalHarga);
        System.out.println("Diskon : " + diskon);
        System.out.println("Total bayar : " + totalBayar);


        if (uangBayar >= totalBayar) {
            kembalian = totalHarga - totalBayar;
            System.out.println("Kembalian : " + kembalian);
        }

        kurang = totalBayar - uangBayar;

        System.out.println("Uang tidak cukup, kurang " + kurang);
    }
}