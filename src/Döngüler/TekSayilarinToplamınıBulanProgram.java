package Döngüler;

import java.util.Scanner;

public class TekSayilarinToplamınıBulanProgram {
    public static void main(String[] args) {

        //Bu satır, Java'da Scanner sınıfından bir nesne oluşturur ve
        //kullanıcıdan girdi almak için bu nesneyi kullanır.
        Scanner scanner = new Scanner(System.in);

        //TASK: Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve
        //girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.
        int toplam = 0;
        int sayi;
        System.out.println("Negatif bir değer girilene kadar sayılar giriniz:");

        do {
            System.out.print("Sayı giriniz: ");
            sayi = scanner.nextInt();

            if (sayi % 2 != 0 && sayi > 0) {
                toplam += sayi; // Girilen tek sayıları toplam değişkenine ekle
            }
        } while (sayi >= 0);

        System.out.println("Girilen tek sayıların toplamı: " + toplam);
        scanner.close();


    }
}
