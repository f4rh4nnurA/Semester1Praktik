package Minggu4.pertanyaan3;

import java.util.Scanner;

public class HargaBayar11 {
     public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        int harga , jumlah, jmlHlmBuku;
        double dis, total, bayar, jmlDis;
        String merkbuku;

        System.out.println("Masukkan merk buku yang dibeli ");
        merkbuku = input.nextLine();
        System.out.println("Masukkan jumlah halaman buku yang dibeli ");
        jmlHlmBuku = input.nextInt();
        System.out.println("Masukkan Jumlah jumlah barang yang dibeli ");
        jumlah = input.nextInt();
        System.out.println("Masukkan harga buku yang dibeli ");
        harga = input.nextInt();
        System.out.println("Masukkan diskon buku yang dibeli ");
        dis = input.nextInt();
        total = harga*jumlah;
        jmlDis = total * dis;
        bayar = total - jmlDis;

        System.out.println("Merk buku yang anda beli adalah " + merkbuku);
        System.out.println("Jumlah halaman buku yang anda beli adalah " + jmlHlmBuku);
        System.out.println("Diskon yang anda dapatkan adalah " + jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " + bayar);

        input.close();
    }
}
