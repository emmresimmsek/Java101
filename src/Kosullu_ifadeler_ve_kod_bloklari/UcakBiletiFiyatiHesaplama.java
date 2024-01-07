package Kosullu_ifadeler_ve_kod_bloklari;

import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {
    public static void main(String[] args) {
        //Bu satır, Java'da Scanner sınıfından bir nesne oluşturur ve
        //kullanıcıdan girdi almak için bu nesneyi kullanır.
        Scanner scanner = new Scanner(System.in);

       // TASK: Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.

        System.out.print("Seyahat mesafesi (km): ");
        int mesafe = scanner.nextInt();

        System.out.print("Yolculuk sınıfı (1: Ekonomi, 2: Business): ");
        int sinif = scanner.nextInt();

        System.out.print("Rezervasyon yapılma günü: ");
        int rezervasyonGun = scanner.nextInt();

        // Mesafeye göre fiyat hesaplama
        double fiyat = mesafe * 0.1;
        // Yolculuk sınıfına göre fiyat artışı
        if (sinif == 2) { // Business sınıfı
            fiyat *= 1.5; // Business sınıfı fiyatı yarı yarıya daha fazla
        }

        // Rezervasyon gününe göre indirim yapılması
        if (rezervasyonGun >= 30) {
            fiyat *= 0.8; // 30 gün önceden rezervasyon yapanlara %20 indirim
        } else if (rezervasyonGun >= 15) {
            fiyat *= 0.9; // 15-29 gün önceden rezervasyon yapanlara %10 indirim
        }

        System.out.println("Toplam fiyat: " + fiyat + " TL");

        scanner.close();
    }



    }

