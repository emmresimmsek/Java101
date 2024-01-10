package Döngüler;

import java.util.Scanner;

public class GirilenSayiyaKadarOlanCiftSayilariBulanProgram {
    public static void main(String[] args) {

        //Bu satır, Java'da Scanner sınıfından bir nesne oluşturur ve
        //kullanıcıdan girdi almak için bu nesneyi kullanır.
        Scanner scanner = new Scanner(System.in);

        //TASK: Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazıyoruz.
        System.out.print("Lütfen bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        System.out.println("Girdiğiniz sayıya kadar olan çift sayılar aşağıdadır.: ");
        for (int i = 1; i <= sayi ; i++) {

            if (i % 2 == 0) {

                System.out.println(i);
        } else { }

        }
    }
}
