package Minggu14.Tugas;

public class CekPrimaRekursif {
    public static void main(String[] args) {
        int n = 29;
        if (isPrime(n, 2))
            System.out.println(n + " adalah bilangan prima");
        else
            System.out.println(n + " bukan bilangan prima");
    }

    public static boolean isPrime(int n, int i) {
        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;

        return isPrime(n, i + 1);
    }
}
