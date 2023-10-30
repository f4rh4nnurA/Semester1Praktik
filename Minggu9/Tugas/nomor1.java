package Minggu9.Tugas;

import java.util.Scanner;

public class nomor1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyaknya elemen: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Masukkan nilai elemen ke-%d: ", i + 1);
            arr[i] = input.nextInt();
        }

        int max = arr[0], min = arr[0], sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            sum += arr[i];
        }
        int avg = sum / n;

        System.out.printf("Nilai tertinggi: %d\n", max);
        System.out.printf("Nilai terendah: %d\n", min);
        System.out.printf("Nilai rata-rata: %d\n", avg);
    input.close();
    }
}
