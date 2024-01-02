package Temel_kavramlar_ve_degiskenler;

import java.util.Scanner;
public class VkiHesaplayanProgram {
    public static void main(String[] args) {
        //Bu satır, Java'da Scanner sınıfından bir nesne oluşturur ve kullanıcıdan girdi almak için bu nesneyi kullanır.
        Scanner scanner = new Scanner(System.in);
        // Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
        // Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

        //FORMÜL: Kilo (kg) / Boy(m) * Boy(m)

        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        double boy = scanner.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz: ");
        double kilo = scanner.nextDouble();

        double result = kilo / (boy * boy) ;
        System.out.println("Vücut Kitle İndeksiniz: " + result);


    }
}
