package Kosullu_ifadeler_ve_kod_bloklari;

import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {

        //Bu satır, Java'da Scanner sınıfından bir nesne oluşturur ve
        //kullanıcıdan girdi almak için bu nesneyi kullanır.
        Scanner scanner = new Scanner(System.in);

        // Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.
        // Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.

        int date;
        System.out.print("Çin Zodyağı uygulamasına hoşgeldiniz. Lütfen doğum yılınızı giriniz: ");
        date = scanner.nextInt();

        int result = (date % 12);
        switch (result){
            case 0:
                System.out.print("Çin Zodyağı Burcunuz: ");
                System.out.println("Maymun");
                break;
            case 1:
                System.out.println("Horoz");
                break;
            case 2:
                System.out.println("Köpek");
                break;
            case 3:
                System.out.println("Domuz");
                break;
            case 4:
                System.out.println("Fare");
                break;
            case 5:
                System.out.println("Öküz");
                break;
            case 6:
                System.out.println("Kaplan");
                break;
            case 7:
                System.out.println("Tavşan");
                break;
            case 8:
                System.out.println("Ejderha");
                break;
            case 9:
                System.out.println("Yılan");
                break;
            case 10:
                System.out.println("At");
                break;
            case 11:
                System.out.println("Koyun");
                break;





        }
    }
}
