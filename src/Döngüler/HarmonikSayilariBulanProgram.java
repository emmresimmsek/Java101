package Döngüler;

import java.util.Scanner;

public class HarmonikSayilariBulanProgram {
    public static void main(String[] args) {

        //Bu satır, Java'da Scanner sınıfından bir nesne oluşturur ve
        //kullanıcıdan girdi almak için bu nesneyi kullanır.
        Scanner scanner = new Scanner(System.in);

        //TASK: Java ile girilen sayının harmonik serisini bulan program yazacağız.
        double harmonic = 0;

        System.out.println("n sayısını giriniz: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            harmonic += 1.0 / i;
        }

        System.out.println(num + " sayısının harmonik serisi: " + harmonic);
    }





    }

