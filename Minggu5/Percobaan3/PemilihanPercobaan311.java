package Minggu5.Percobaan3;

import java.util.Scanner;

public class PemilihanPercobaan311 {
    public static void main (String[] args){
        Scanner input11 = new Scanner(System.in);
        double angka1, angka2, hasil;
        char operator;

        System.out.println("Masukkan angka pertama: ");
        angka1 = input11.nextDouble();
        System.out.println("Masukkan angka kedua: ");
        angka2 = input11.nextDouble();
        System.out.println("Masukkan operator (+ - * /): ");
        operator =input11.next().charAt(0);

        input11.close();
        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println(angka1 + " + " + angka2 + "=" + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println(angka1 + " - " + angka2 + "=" + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println(angka1 + " * " + angka2 + "="); 
                break;
            case '/':
                hasil = angka1/ angka2;
                System.out.println(angka1 + " / " + angka2 + "=" + hasil);
                break;
        
        
        }

    }
    
}
