package Minggu13.Tugas;
import java.util.Scanner;

public class NilaiMahasiswa_1 {
    private static int jumlahMahasiswa, jumlahTugas;
    private static int[][] nilaiMahasiswa;
    private static String[] namaMahasiswa;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahMahasiswa = input.nextInt();

        System.out.print("Masukkan jumlah tugas: ");
        jumlahTugas = input.nextInt();

        nilaiMahasiswa = new int[jumlahMahasiswa][jumlahTugas];
        namaMahasiswa = new String[jumlahMahasiswa];

        inputData(input);
        tampilkanData();
        cariNilaiTertinggi();
        tampilkanMahasiswaNilaiTertinggi();

        input.close();
    }

    public static void inputData(Scanner input) {
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            namaMahasiswa[i] = input.next();

            System.out.println("Masukkan nilai untuk " + namaMahasiswa[i] + ":");
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print("Tugas ke-" + (j + 1) + ": ");
                nilaiMahasiswa[i][j] = input.nextInt();
            }
        }
    }

    public static void tampilkanData() {
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Nilai untuk " + namaMahasiswa[i] + ":");
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.println("Tugas ke-" + (j + 1) + ": " + nilaiMahasiswa[i][j]);
            }
        }
    }

    public static void cariNilaiTertinggi() {
        int tugasNilaiTertinggi = 0;
        int nilaiTertinggi = 0;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            for (int j = 0; j < jumlahTugas; j++) {
                if (nilaiMahasiswa[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiMahasiswa[i][j];
                    tugasNilaiTertinggi = j + 1;
                }
            }
        }

        System.out.println("Nilai tertinggi terdapat pada tugas ke-" + tugasNilaiTertinggi);
    }

    public static void tampilkanMahasiswaNilaiTertinggi() {
        int nilaiTertinggi = 0;
        String mahasiswaNilaiTertinggi = "";
        int tugasNilaiTertinggi = 0;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            for (int j = 0; j < jumlahTugas; j++) {
                if (nilaiMahasiswa[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiMahasiswa[i][j];
                    mahasiswaNilaiTertinggi = namaMahasiswa[i];
                    tugasNilaiTertinggi = j + 1;
                }
            }
        }

        System.out.println("Mahasiswa dengan nilai tertinggi adalah " + mahasiswaNilaiTertinggi + " pada tugas ke-" + tugasNilaiTertinggi);
    }
}

