package Minggu14.Tugas;

public class Fibonacci {
    public static void main(String[] args) {
        int bulan = 12;
        System.out.println("Jumlah pasangan marmut pada akhir bulan ke-" + bulan + " adalah " + fibonacci(bulan));
    }

    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
