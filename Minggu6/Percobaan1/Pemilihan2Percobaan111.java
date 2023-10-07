
package Minggu6.Percobaan1;

import java.util.Scanner;

public class Pemilihan2Percobaan111 {
    public static void main (String[] args){
        Scanner input11 = new Scanner (System.in);
        int tahun = 0;
        System.out.println("Masukkan tahun: ");
        tahun = input11.nextInt();
        if ((tahun % 4) == 0){
            if ((tahun % 100) != 0){
                System.out.println("Tahun Kabisat");
            }
        }else  {
            System.out.println("Bukan Tahun Kabisat");
         }

         input11.close();
    }
    
}