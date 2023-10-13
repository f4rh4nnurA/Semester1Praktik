package Minggu7.pertanyaan3;
import java.util.Scanner;

public class DoWhileCuti11 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int jatahCuti, jumlahHari=0;
        String konfirmasi;

        System.out.print("Jatah cuti: ");
        jatahCuti = sc.nextInt();
        do{
            System.out.print("Apakah Anda ingin mengambil cuti (y/t)? ");
            konfirmasi = sc.next();

            if(konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari: ");
                jumlahHari = sc.nextInt();
                
                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                }else if(jumlahHari > jatahCuti){
                System.out.println("Anda bisa mengisi jumlah hari kembali");
                }
                
            }
            else if (konfirmasi.equalsIgnoreCase("t")){
                break;
            }
        } while (jumlahHari > jatahCuti);
        sc.close();
        
    }
}


    

