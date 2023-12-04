package Minggu13.Tugas;

import java.util.Scanner;

public class NilaiMahasiswa {
    private static int[][] nilaiMahasiswa = new int[5][7];
    private static String[] namaMahasiswa = {"Sari", "Rina", "Yani", "Dwi", "Lusi"};

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        inputData(input);
        tampilkanData();
        cariNilaiTertinggi();
        tampilkanMahasiswaNilaiTertinggi();
        input.close();
    }

    public static void inputData(Scanner input) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Masukkan nilai untuk " + namaMahasiswa[i] + ":");
            for (int j = 0; j < 7; j++) {
                System.out.print("Minggu ke-" + (j + 1) + ": ");
                nilaiMahasiswa[i][j] = input.nextInt();
            }
        }
    }

    public static void tampilkanData() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Nilai untuk " + namaMahasiswa[i] + ":");
            for (int j = 0; j < 7; j++) {
                System.out.println("Minggu ke-" + (j + 1) + ": " + nilaiMahasiswa[i][j]);
            }
        }
    }

    public static void cariNilaiTertinggi() {
        int mingguNilaiTertinggi = 0;
        int nilaiTertinggi = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                if (nilaiMahasiswa[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiMahasiswa[i][j];
                    mingguNilaiTertinggi = j + 1;
                }
            }
        }

        System.out.println("Nilai tertinggi terdapat pada minggu ke-" + mingguNilaiTertinggi);
    }

    public static void tampilkanMahasiswaNilaiTertinggi() {
        int nilaiTertinggi = 0;
        String mahasiswaNilaiTertinggi = "";
        int mingguNilaiTertinggi = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                if (nilaiMahasiswa[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiMahasiswa[i][j];
                    mahasiswaNilaiTertinggi = namaMahasiswa[i];
                    mingguNilaiTertinggi = j + 1;
                }
            }
        }

        System.out.println("Mahasiswa dengan nilai tertinggi adalah " + mahasiswaNilaiTertinggi + " pada minggu ke-" + mingguNilaiTertinggi);
    }
}
