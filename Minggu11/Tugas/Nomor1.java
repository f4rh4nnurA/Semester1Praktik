package Minggu11.Tugas;

import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int N ;
        System.out.print("Masukkan nilai N: ");
        N = input.nextInt();
        for (int a = 0; a < N; a++) {
            for (int i = 0; i <= a; i++) {
                System.out.print(i+1);
            }
            System.out.println();
        }
        input.close();
    }
}
