package Metotlar;

import java.util.Scanner;

public class UsHesabıYapanProgram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        System.out.print("Lütfen bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        System.out.print("Lütfen bir üs giriniz: ");
        int us = scanner.nextInt();


        System.out.println(usHesapla(sayi,us));


    }

    //Metot isimleri küçük harfle başlamalı ve sonraki kelimelerin ilk harfleri büyük olmalıdır (camelCase).
    public static int usHesapla (int sayi, int us){
        int result = 1;
        for (int i = 0; i < us; i++) {
             result =+   result * sayi     ;
        }

        // NOT: return ifadesi bir metottan çıkış yapmak için kullanılır.
        // for döngüsünün içine yazılmaz!!!
        return result;
    }



}
