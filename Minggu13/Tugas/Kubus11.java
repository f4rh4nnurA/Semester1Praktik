package Minggu13.Tugas;

import java.util.Scanner;

public class Kubus11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sisi kubus: ");
        int s = sc.nextInt();
        int Luas = hitungLuasPermukaanKubus(s);
        System.out.print("\nLuas permukaan kubus adalah " + Luas);
        int Volume = hitungVolume(s);
        System.out.print("\nvolume kubus adalah " + Volume);
        sc.close();         
    }
    public static int hitungVolume(int sisi) {
        int volume = hitungLuasPermukaanKubus(sisi)*sisi*1/6*sisi;
        return volume;
    }
    public static int hitungLuasPermukaanKubus(int sisi) {
        int luas = 6*sisi*sisi;
        return luas;
    }
}
