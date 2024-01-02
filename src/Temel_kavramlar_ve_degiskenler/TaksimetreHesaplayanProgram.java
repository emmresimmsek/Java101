package Temel_kavramlar_ve_degiskenler;
import java.util.Scanner;
public class TaksimetreHesaplayanProgram {
    public static void main(String[] args) {
        //Bu satır, Java'da Scanner sınıfından bir nesne oluşturur ve kullanıcıdan girdi almak için bu nesneyi kullanır.
        Scanner scanner = new Scanner(System.in);


        // SORU: Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
        System.out.print("Gidilen mesafeyi (KM cinsinden) girin: ");
        double mesafe = scanner.nextDouble();

        //Taksimetre açılış ücreti: 20 TL
        int taksiAcilisUcreti = 20;

        //Taksi kilometre ücreti: 15 TL
        int kmUcret  = 15;

        //Tutarı hesaplayalım
        double tutar = taksiAcilisUcreti + (  mesafe * kmUcret     );

        System.out.println("Taksimetre tutarınız: " + tutar);
        scanner.close();


    }
}
