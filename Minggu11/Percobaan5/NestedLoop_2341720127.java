package Minggu11.Percobaan5;

import java.util.Scanner;

public class NestedLoop_2341720127 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner (System.in);
        Double temps [][] = new Double[5][7];
        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + (i+1));
            for (int j = 0; j < temps.length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = Scanner.nextDouble();
            }
            System.out.println();
        }
        for (int i = 0; i < temps.length; i++) {
            System.out.print("Kota ke-" + (i + 1) + ": ");
            for (int j = 0; j < temps.length; j++) {
                System.out.print(temps[i][j] + " ");
            }
            System.out.println();
        }
        Scanner.close();
    }
}
