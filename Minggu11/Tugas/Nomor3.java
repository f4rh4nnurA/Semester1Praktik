package Minggu11.Tugas;

import java.util.Scanner;

public class Nomor3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();
        for(int j = 0; j < angka;j++){
            for(int i = 0; i < angka; i++){
                if(j == 0 || j == angka -  1 || i == 0 || i == angka - 1){
                    System.out.print(angka);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        input.close();
    }
}
