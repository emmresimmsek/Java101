package Döngüler;

import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Java döngüler ile fibonacci serisi bulan program yazıyoruz.
        //9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34
        System.out.print("Sayı giriniz: ");
        int elemanSayisi = scanner.nextInt();

        int onceki = 0;
        int sonraki = 1;

        System.out.print(elemanSayisi + " Elemanlı Fibonacci Serisi: ");

        for (int i = 1; i <= elemanSayisi; ++i) {
            System.out.print(onceki + " ");

            int toplam = onceki + sonraki;
            onceki = sonraki;
            sonraki = toplam;
        }

        scanner.close();
    }




    }

