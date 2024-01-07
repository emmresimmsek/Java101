package Kosullu_ifadeler_ve_kod_bloklari;

import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {
        //Bu satır, Java'da Scanner sınıfından bir nesne oluşturur ve
        //kullanıcıdan girdi almak için bu nesneyi kullanır.
        Scanner scanner = new Scanner(System.in);

        // Değişkenlerimizi tanımladık.
        int ay, gun;

        System.out.print("Doğduğunuz ayı giriniz: ");
        ay = scanner.nextInt();
        System.out.print("Doğduğunuz günü giriniz: ");
        gun = scanner.nextInt();

        if ((ay == 3 && gun >= 21 && gun <= 31) || (ay == 4 && gun >= 1 && gun <= 19)) {
            System.out.println("Koç Burcusunuz.");
        } else if ((ay == 4 && gun >= 20 && gun <= 30) || (ay == 5 && gun >= 1 && gun <= 20)) {
            System.out.println("Boğa Burcusunuz.");
        } else if ((ay == 5 && gun >= 21 && gun <= 31) || (ay == 6 && gun >= 1 && gun <= 20)) {
            System.out.println("İkizler Burcusunuz.");


        }



    }
}
