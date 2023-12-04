package Minggu13.Percobaan4;
import java.util.Scanner;

public class Pertanyaan_4 {
    public static String PenerimaUcapan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan: ");
        String namaOrang = sc.nextLine();
        return namaOrang;
    }
    public static void UcapanTerimaKasih(){
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + " for being the best teacher in the world.\n" +
        "You inspired in me a love for learning and made me feel like i could ask you anything.");
    }
    public static String UcapanTambahan(String tambahan){
        return tambahan;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UcapanTerimaKasih();
        System.out.println("Tuliskan kata-kata yang ingin Anda beri ucapan: ");
        String kata = sc.nextLine();
        System.out.println(UcapanTambahan(kata));
        sc.close();
    }
}
