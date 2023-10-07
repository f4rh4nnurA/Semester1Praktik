package Minggu6.Pertanyaan1;

import java.util.Scanner;

public class Pemilihan2Percobaan111 {
    
    public static void main (String[] args){
        Scanner input11 = new Scanner (System.in);
        int tahun = 0;
        System.out.println("Masukkan tahun: ");
        tahun = input11.nextInt();
        if ((tahun % 4) == 0){
            if ((tahun % 100) != 0){
                System.out.println("Tahun kabisat");
                    }else if ((tahun % 100) == 0){
                        System.out.println("Bukan tahun kabisat");
                            }else if ((tahun % 400 ) == 0){
                                System.out.println("Tahun kabisat");
        }}else {
            System.out.println("Bukan tahun kabisat");
        }           
             input11.close();      
        }
    }
    
        
    

