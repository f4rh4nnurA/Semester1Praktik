package Minggu14.Tugas;

import java.util.ArrayList;
import java.util.Scanner;

public class DeretDescendingIteratif {
    // Fungsi Rekursif
    public static String deretDescendingRekursif(int n) {
        if (n >= 0) {
            return n + "\n" + deretDescendingRekursif(n - 1);
        } else {
            return "";
        }
    }

    // Fungsi Iteratif
    public static String deretDescendingIteratif(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = n; i >= 0; i--) {
            sb.append(i).append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> angka = new ArrayList<Integer>();
        String lanjut = "Y";

        while (lanjut.equalsIgnoreCase("Y")) {
            System.out.println("Masukkan angka:");
            angka.add(sc.nextInt());
            System.out.println("Apakah Anda ingin memasukkan angka lagi? (Y/N)");
            lanjut = sc.next();
        }

        for (int n : angka) {
            System.out.println("Rekursif untuk angka " + n + ":");
            System.out.println(deretDescendingRekursif(n));

            System.out.println("\nIteratif untuk angka " + n + ":");
            System.out.println(deretDescendingIteratif(n));
        }
        sc.close();
    }
}
