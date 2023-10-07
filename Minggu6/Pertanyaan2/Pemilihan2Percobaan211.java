package Minggu6.Pertanyaan2;

import java.util.Scanner;

public class Pemilihan2Percobaan211 {
    public static void main (String[] args){
        Scanner input11 = new Scanner (System.in);
        
        System.out.println("Masukkan sudut1 : ");
        int sudut1 = input11.nextInt();
        System.out.println("Masukkan sudut2: ");
        int sudut2 = input11.nextInt();
        System.out.println("Masukkan sudut3 : ");
        int sudut3 = input11.nextInt();
        
        input11.close();
        int totalSudut;

        totalSudut = sudut1 + sudut2 + sudut3;
        

        if(totalSudut == 180){
            if (((sudut1 == 45 || sudut1 == 90) && (sudut2 == 45 || sudut2 == 90) && (sudut3 == 45 || sudut3 == 90))){
                System.out.println("Segitiga tersebut adalah segitiga sama kaki");
            }else if ((sudut1 == 90 || sudut2 == 90 || sudut3 == 90)){
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            }else if ((sudut1 == 60) && (sudut2 == 60) && (sudut3 == 60)){
                System.out.println("Segitiga tersebut adalah segitiga sama sisi ");
            }else if ((sudut1 < 90) && (sudut2 < 90) && (sudut3 < 90)){
                System.out.println("Segitiga tersebut adalah segitiga lancip");
            }else if ((((sudut1 > 90 && sudut1 < 180) || sudut1 < 90) || ((sudut2 > 90 && sudut2 < 180) || sudut2 < 90) ||((sudut3 > 90 && sudut3 < 180) || sudut3 < 90))){
                System.out.println("Segitiga tersebut adalah segitiga tumpul");
            }else if ((sudut1 > 0 && sudut1 < 180) && (sudut2 > 0 && sudut2 < 180) && (sudut3 > 0 && sudut3 < 180)){
                System.out.println("Segitiga tersebut adalah segitiga sembarang");
            }
        }
        else {
            System.out.println("Bukan segitiga");
        }
        }
    }
        
    

