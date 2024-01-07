package Kosullu_ifadeler_ve_kod_bloklari;

import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        //Bu satır, Java'da Scanner sınıfından bir nesne oluşturur ve
        //kullanıcıdan girdi almak için bu nesneyi kullanır.
        Scanner scanner = new Scanner(System.in);


        //TASK: Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak
        // isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,
        // şifreler aynı ise ekrana "Şifre oluşturulamadı lütfen başka şifre giriniz." sorun yoksa
        // "Şifre oluşturuldu" yazan programı yazınız.
        int oldPass = 123456789;
        System.out.print("Lütfen şifrenizi giriniz: ");
        int password = scanner.nextInt();
        if (password == 123456789) {
            System.out.println("Başarılı bir şekilde giriş yapıldı.");
        } else {

            System.out.println("Şifrenizi yanlış girdiniz. Şifrenizi sıfırlamak istiyorusanız lütfen 1'e basınız:");
        }
        int button = scanner.nextInt();
        System.out.println("Lütfen yeni şifrenizi giriniz.");
        int newPass = scanner.nextInt();
        if (newPass == oldPass) {
            System.out.println("Lütfen yeni şifre giriniz. Unuttuğunuz şifre ile aynı olmaması gerekmektedir.");
        } else {
            oldPass = newPass;
            System.out.println("Şifreniz başarılı bir şekilde değiştirildi. İyi günler dileriz.  ");
        }


    }
}
