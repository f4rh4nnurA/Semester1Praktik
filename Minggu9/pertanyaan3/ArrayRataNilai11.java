package Minggu9.pertanyaan3;

import java.util.Scanner;

public class ArrayRataNilai11 {
    public static void main(String[] args){
        int banyakMahasiswa,hitung = 0, counter = 0;
        double tdkLulus, lulus, sum = 0, total = 0;
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan jumlah mahasiswa : ");
        banyakMahasiswa = input.nextInt();
        int[] nilaiMhs = new int[banyakMahasiswa];
        
        for(int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = input.nextInt();
        }for (int i = 0; i < nilaiMhs.length; i++){
            if(nilaiMhs[i] > 70 ) {
                total += nilaiMhs[i]; 
                counter++;
            }else if ((nilaiMhs[i] <= 70) && (nilaiMhs[i] >= 0)){
                sum += nilaiMhs [i];
                hitung ++;
            }
            
        }
        lulus = total / counter;
        tdkLulus = sum / hitung;
        System.out.print("Rata-rata nilai lulus = " + lulus);
        System.out.print("\nRata-rata nilai tidak lulus = " + tdkLulus);

    input.close();
}
 
}
