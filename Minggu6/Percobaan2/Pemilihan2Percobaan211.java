package Minggu6.Percobaan2;

import java.util.Scanner;

public class Pemilihan2Percobaan211 {
    public static void main (String[] args){
        Scanner input11 = new Scanner (System.in);
        int sudut1, sudut2, sudut3;
        System.out.println("Masukkan sudut1 : ");
        sudut1 = input11.nextInt();
        System.out.println("Masukkan sudut2: ");
        sudut2 = input11.nextInt();
        System.out.println("Masukkan sudut3 : ");
        sudut3 = input11.nextInt();
        
        input11.close();
        int totalSudut;

        totalSudut = sudut1 + sudut2 + sudut3;

        if(totalSudut == 180){
            if((sudut1 == 90) || (sudut2 == 90) ||(sudut3 == 90)){
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            }else{
                System.out.println("Segitiga tersebut adalah bukan segitiga siku-siku ");
            }
        }else{
                System.out.println("Bukan Segitiga");
            }
    } 
    
}
