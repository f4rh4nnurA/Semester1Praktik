package Minggu11.Tugas;

import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int N ;
        System.out.print("Masukkan nilai N: ");
        N = input.nextInt();
        for(int i = N; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}
