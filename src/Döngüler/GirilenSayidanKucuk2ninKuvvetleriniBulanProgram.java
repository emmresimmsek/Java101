package Döngüler;


import java.util.Scanner;

public class GirilenSayidanKucuk2ninKuvvetleriniBulanProgram {
    public static void main(String[] args) {

        //Bu satır, Java'da Scanner sınıfından bir nesne oluşturur ve
        //kullanıcıdan girdi almak için bu nesneyi kullanır.
        Scanner scanner = new Scanner(System.in);

        //TASK: Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran programı yazıyoruz.
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        System.out.println("2'nin kuvvetleri:");

        int kuvvet = 1;
        for (int i = 0; kuvvet <= sayi; i++) {
            System.out.println("2^" + i + " = " + kuvvet);
            kuvvet *= 2; // Her adımda kuvveti 2 ile çarp
        }

        scanner.close();

    }
}
