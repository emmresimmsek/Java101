package Döngüler;

import java.util.Scanner;

public class MükemmelSayiBulanProgram {
    public static void main(String[] args) {


        // Mükemmel sayi bulan program yazınız.
        // Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.


        Scanner scanner = new Scanner(System.in);
        int toplam = 0;

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        for (int i = 1; i < sayi; i++) {

            if (sayi % i == 0) {
               toplam += i; // Doğru olan: toplam += i;
            } else {

            }

        }
        if (toplam == sayi){
            System.out.println("Mükemmel sayıdır");
        }else{
            System.out.println("Mükemmel sayı değildir. ");
        }




    }
}
