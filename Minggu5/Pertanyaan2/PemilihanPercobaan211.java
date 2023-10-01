package Minggu5.Pertanyaan2;

import java.util.Scanner;

public class PemilihanPercobaan211 {
    public static void main (String[] args){
        Scanner input11 = new Scanner (System.in);
        
        System.out.println("Nilai uas   : ");
        float uas = input11.nextFloat();
        System.out.println("Nilai uts   : ");
        float uts = input11.nextFloat();
        System.out.println("Nilai kuis  : ");
        float kuis = input11.nextFloat();
        System.out.println("Nilai tugas : ");
        float tugas = input11.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        String Nilai = null ;
        if (total > 80 && total < 100){
            Nilai = "A";
        }else if (total <= 80){
            Nilai = "B+";
        }else if (total <= 73){
            Nilai = "B";
        }else if (total <= 65){
            Nilai = "C+";
        }else if (total <= 60){
            Nilai = "C";
        }else if (total <= 50){
            Nilai = "D";
        }else if (total <= 39){
            Nilai = "E";
        }

        System.out.println("Predikat yang anda dapatkan adalah " + Nilai);

        input11.close();
        
    }

    
}
