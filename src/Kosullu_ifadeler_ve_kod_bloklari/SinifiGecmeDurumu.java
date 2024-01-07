package Kosullu_ifadeler_ve_kod_bloklari;


import java.util.Scanner;
public class SinifiGecmeDurumu {
    public static void main(String[] args) {
        //Bu satır, Java'da Scanner sınıfından bir nesne oluşturur ve
        //kullanıcıdan girdi almak için bu nesneyi kullanır.
        Scanner scanner = new Scanner(System.in);

        // Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
        // 5 dersin ortalamasını alalım. 55 üzeri olursa sınıfı geçsin...
        // Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.


        int mat = 0;
        int fiz= 0;
        int turkce= 0;
        int kim= 0;
        int muzik= 0;

        System.out.println("Lütfen aldığınız notları giriniz: ");
        //----------------MATEMATİK
        System.out.println("Matematik: ");
        mat = scanner.nextInt();
        if (mat >= 0 & mat <= 100) {
        } else {
            System.out.println("Lütfen 0 ile 100 arasında bir sayı giriniz!");
        }
        //----------------FİZİK
        System.out.println("Fizik: ");
        fiz= scanner.nextInt();
        if (fiz >= 0 & fiz <= 100) {
        } else {
            System.out.println("Lütfen 0 ile 100 arasında bir sayı giriniz!");
        }
        //----------------TÜRKÇE
        System.out.println("Türkçe: ");
        turkce= scanner.nextInt();
        if (turkce >= 0 & turkce <= 100) {
        } else {
            System.out.println("Lütfen 0 ile 100 arasında bir sayı giriniz!");
        }
        //----------------KİMYA
        System.out.println("Kimya: ");
        kim= scanner.nextInt();
        if (kim >= 0 & kim <= 100) {
        } else {
            System.out.println("Lütfen 0 ile 100 arasında bir sayı giriniz!");
        }
        //----------------MÜZİK
        System.out.println("Müzik: ");
        muzik= scanner.nextInt();
        if (muzik >= 0 & muzik <= 100) {
        } else {
            System.out.println("Lütfen 0 ile 100 arasında bir sayı giriniz!");
        }
        // Beş dersin ortalamasını alalım.
        int ortalama = (mat + fiz + turkce + kim + muzik) /5;
        if (ortalama >= 55) {

            System.out.println(" Tebrikler! Sınıfı geçtiniz.");
        } else {
            System.out.println("Sınıfı geçemediniz. Bütünleme sınavlarına kaldınız.");
        }























    }
}
