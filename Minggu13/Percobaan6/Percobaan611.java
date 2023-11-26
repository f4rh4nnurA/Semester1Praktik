package Minggu13.Percobaan6;

import java.util.Scanner;

public class Percobaan611 {
    public static void main (String[] args) {
    Scanner input = new Scanner (System.in);

    int p,l,t,L,vol;

    System.out.println("Masukkan panjang");
    p = input.nextInt();
    System.out.println("Masukkan lebar");
    l = input.nextInt();
    System.out.println("Masukkan tinggi");
    t = input.nextInt();
    //Menghitung luas
    L = p*l;
    System.out.println("Luas Persegi panjang adalah " + L);
    // Menghitung volume
    vol = p*l*t;
    System.out.println("Volume balok adalah " + vol);

    input.close();
    }
    
}