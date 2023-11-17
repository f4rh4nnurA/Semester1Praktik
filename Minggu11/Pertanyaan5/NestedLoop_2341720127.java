package Minggu11.Pertanyaan5;

import java.util.Scanner;

public class NestedLoop_2341720127 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner (System.in);
        int temps [][] = new int[5][7];
        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + (i+1));
            for (int j = 0; j < temps[i].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = Scanner.nextInt();
            }
            System.out.println();
        }
        int i = 0;
        for(int[] temp : temps) {
            System.out.print("Kota ke-" + ( i + 1) + ": ");
            int sum = 0;
            for (int t : temp) {
                System.out.print(t + " ");
                sum += t;
            }
            System.out.println("\nRata-rata: " + (double)sum/temp.length);
        }
        Scanner.close();
    }
}
