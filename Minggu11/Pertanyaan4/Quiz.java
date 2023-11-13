package Minggu11.Pertanyaan4;

import java.util.Random;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner (System.in);
        char menu = 'y';
        do{
            int number = random.nextInt(10) + 1;
            boolean success = false;
            do{
                System.out.print("Tebak angka (1-10): ");
                int answer = input.nextInt();
                input.nextLine();
                success = (answer == number);
                if (success) {
                    System.out.println("Nilai tebakan anda benar");
                }else if (answer < number){
                    System.out.println("Nilai tebakan anda lebih kecil dari number random");
                } else{
                    System.out.println("Nilai tebakan anda lebih besar dari nomor random");
                }
            } while(!success);
            System.out.print("Apakah Anda ingin mengulang permainan (y/y)? ");
            menu = input.nextLine().charAt(0);
        } while(menu == 'y' || menu == 'Y');
        input.close();
    }
}
