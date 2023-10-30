package Minggu9.pertanyaan3;

import java.util.Scanner;

public class AArrayRataNilai11 {
    public static void main(String[] args){
        int banyakMahasiswa, counter = 0;
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan jumlah mahasiswa : ");
        banyakMahasiswa = input.nextInt();
        int[] nilaiMhs = new int[banyakMahasiswa];
        
        for(int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = input.nextInt();
        }for (int i = 0; i < nilaiMhs.length; i++){
            if(nilaiMhs[i] > 70 ) { 
                counter++;
            }
            
        }
         System.out.println("Banyak mahasiswa yang lulus berjumlah " + counter);
        
    input.close();
}
 
}


