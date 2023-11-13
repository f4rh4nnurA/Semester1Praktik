package Minggu10.Pertanyaan2;

import java.util.Scanner;

public class BioskopWithScanner11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String menu[] = {"Input data penonton", "Tampilkan daftar penonton", "Exit"};
        String opsi = null;
        boolean valid = false;
        String [][] penonton = new String [4][2];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                penonton[i][j] = "***";
            }
        }
        String nama,next;
        int baris,kolom;
        while (!valid ) {
        System.out.println("\n\t\tMenu Opsi");
        for(int i = 0; i < menu.length;i++){
            System.out.println((i+1) + ". " + menu[i]);
        }
        System.out.print("Pilih Opsi Menu(1/2/3): ");
        opsi = sc.next();
        // proses apabila opsi telah dipilih
        if (opsi.equals("1")){
            System.out.println("\n\t\tInput Data Penonton");
            System.out.print("Masukkan nama : ");
            nama = sc.next();
            do {
                System.out.print("\nMasukkan baris : ");
                baris = sc.nextInt();
                System.out.print("\nMasukkan kolom : ");
                kolom = sc.nextInt();
                sc.nextLine();
                if (penonton[baris-1][kolom-1].equals("***")) {
                    penonton[baris-1][kolom-1] = nama;
                    break;
                } else {
                    System.out.println("Maaf, kursi sudah ditempati. Silakan pilih kursi lain.");
                }
            } while (true);

            System.out.print("\nInput penonton lainnya? (y/n): ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                valid = false;
            }
        } else if (opsi.equals("2")) {
            System.out.println("\n\t\tDaftar Penonton");
            for (int i = 0; i < penonton.length; i++) {
                for (int j = 0; j < penonton[i].length; j++) {
                    System.out.println("Baris: " + (i+1) + ", Kolom: " + (j+1) + ", Nama: " + penonton[i][j]);
                }
            }
        } else if (opsi.equals("3")) {
            break;
        } 
        else {
            System.out.println("Opsi  yang anda pilih tidak ditemukan");
            valid = false;
        }
    }
    sc.close();
}
}
