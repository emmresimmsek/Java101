package Döngüler;

import java.util.Scanner;

public class MinMaxDegerBulma {
    public static void main(String[] args) {
        //TASK: Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.

        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;


        System.out.print("Kaç tane sayı gireceksiniz: ");
        int kacSayi = scanner.nextInt();
        for (int i = 1; i <= kacSayi; i++) {

            System.out.print(i+".sayıyı giriniz: ");
            int sayi = scanner.nextInt();

                    if (sayi < min) {
                        min = sayi;
                    }

                    if (sayi > max) {
                        max = sayi;
                    }


        }
        System.out.println("En küçük sayı: " + min);
        System.out.println("En büyük sayı: " + max);

        scanner.close();









    }
}
