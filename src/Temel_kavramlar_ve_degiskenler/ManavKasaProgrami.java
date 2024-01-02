package Temel_kavramlar_ve_degiskenler;
import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args) {
        //Bu satır, Java'da Scanner sınıfından bir nesne oluşturur ve kullanıcıdan girdi almak için bu nesneyi kullanır.
        Scanner scanner = new Scanner(System.in);

        //SORU: Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

        double toplamTutar = 0.0;

        //Meyveler ve Kilo Fiyatları: Elma: 12 TL ve Armut 15 TL

        double elma = 12;
        double armut = 15;

        System.out.print("Kaç kilo elma aldınız: ");
        int elmaKilo = scanner.nextInt();

        System.out.print("Kaç kilo armut aldınız: ");
        int  armutKilo = scanner.nextInt();

        double result = (elma*elmaKilo) + (armutKilo * armut);
        System.out.println("Ödemeniz gereken miktar: " + result);



    }
}
