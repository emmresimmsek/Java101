package Döngüler;

import java.util.Scanner;

public class FaktoriyelHesaplayanProgram {
    public static void main(String[] args) {
        //Bu satır, Java'da Scanner sınıfından bir nesne oluşturur ve
        //kullanıcıdan girdi almak için bu nesneyi kullanır.
        Scanner scanner = new Scanner(System.in);


        //TASK: Java ile faktöriyel hesaplayan program yazıyoruz.
        System.out.print("Faktörüyel Hesabı için lütfen bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        int toplam = 1; // 0 değerini atamayı unutma!
       if (sayi <= 0) {
           System.out.println("0!:1");

       } else {
           for (int i = sayi; i > 0 ; i--) {

               toplam *= i;

           }
           System.out.println(sayi+"!: "+ toplam);

       }






    }
}
