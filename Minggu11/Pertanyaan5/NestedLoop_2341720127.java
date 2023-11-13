package Minggu11.Pertanyaan5;

import java.util.Scanner;

public class NestedLoop_2341720127 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner (System.in);
        Double temps [][] = new Double[5][7];
        int temp = 1;
        for (int[] i : temp) {
            System.out.println("Kota ke-" + (temp));
            int hari 
            for () {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = Scanner.nextDouble();
            }
            System.out.println();
        }
        for (int i : temps) {
            System.out.print("Kota ke-" + (i + 1) + ": ");
            for (int j : temps) {
                System.out.print(temps[i][j] + " ");
            }
            System.out.println();
        }
        Scanner.close();
    }
}
