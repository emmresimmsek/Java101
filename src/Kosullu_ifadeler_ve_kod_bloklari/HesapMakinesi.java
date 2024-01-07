package Kosullu_ifadeler_ve_kod_bloklari;
import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Bu satır, Java'da Scanner sınıfından bir nesne oluşturur ve
        //kullanıcıdan girdi almak için bu nesneyi kullanır.


        //TASK: Videodaki hesap makinesini switch-case kullanarak yapınız.
        System.out.println("İlk sayıyı giriniz: ");
        int ilkSayi = scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        int ikinciSayi = scanner.nextInt();

        System.out.println("Toplama için:1, Çıkarma için:2, Çarpma için:3, Bölme işlemi için: 4 yazınız.");
        System.out.print("İşlem tercihiniz: ");
        int islemTercihi = scanner.nextInt();

        switch (islemTercihi) {

            case 1:
                System.out.println(ilkSayi + ikinciSayi);
                break;
            case 2:
                System.out.println(ilkSayi - ikinciSayi);
                break;
            case 3:
                System.out.println(ilkSayi * ikinciSayi);
                break;
            case 4:
                System.out.println(ilkSayi / ikinciSayi);
                break;
        }

        /* Not: eğer koşulunuzda bir sürü sonuca bağlı işlem yapmak isterseniz
           if else sizi bayağı uğraştırır ve ayrıca kod karmaşasına sebep olur.
           switch case kullanmak daha mantıklıdır.
         */




    }
}
