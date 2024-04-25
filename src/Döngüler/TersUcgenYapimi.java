package Döngüler;

import java.util.Scanner;

public class TersUcgenYapimi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.

        System.out.print("Basamak sayısı giriniz: ");
        int basamakSayisi = scanner.nextInt();

        for (int i = 0; i < basamakSayisi; i++) {
            System.out.print("*");
            for (int j = 0; j <i ; j++) {
                System.out.print("*");

            }
            System.out.println(" ");
        }





    }
}
