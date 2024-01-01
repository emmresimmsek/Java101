package Temel_kavramlar_ve_degiskenler;
import java.util.Scanner; // Scanner sınıfı import ediyoruz.
public class KDVTutariniHesaplayanProgram {
    public static void main(String[] args) {

        //Bu satır, Java'da Scanner sınıfından bir nesne oluşturur ve kullanıcıdan girdi almak için bu nesneyi kullanır.
        Scanner scanner = new Scanner(System.in);

        // Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve
        // KDV tutarını hesaplayıp ekrana bastıran programı yazın.

        System.out.print("Kestiğiniz fatura değerini giriniz: ");
        double moneyValue = scanner.nextDouble();

        //KDV'yi %20 Alıyoruz.

        double kdv = moneyValue * 0.20;
        System.out.println("Girilen miktarın KDV oranı: " + kdv);
        System.out.println("Toplam ödenecek tutar: " + (kdv + moneyValue));


    }
}
