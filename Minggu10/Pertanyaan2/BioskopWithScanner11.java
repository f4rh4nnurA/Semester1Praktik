package Minggu10.Pertanyaan2;

import java.util.Scanner;

public class BioskopWithScanner11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String [][] penonton = new String [4][2];
        String nama,next;
        int baris,kolom;
        while (true) {
            System.out.println("Masukkan nama: ");
            nama = sc.nextLine();
            System.out.println("Masukkan baris: ");
            baris = sc.nextInt();
            System.out.println("Masukkan kolom: ");
            kolom = sc.nextInt();
            sc.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
        sc.close();
    }
}
