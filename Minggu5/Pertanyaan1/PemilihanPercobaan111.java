package Minggu5.Pertanyaan1;

import java.util.Scanner;

public class PemilihanPercobaan111 {
    public static void main (String[] args){
        Scanner input11 = new Scanner (System.in);
        
        System.out.println("Masukkan angka: ");
        int angka = input11.nextInt();
        
        input11.close();
        
        String hasil = (angka % 2 == 0) ? "bilangan genap" : "Bilangan ganjil";
        System.out.println("Angka " + hasil); 
    }
    
}
