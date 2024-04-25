package Döngüler;

import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {
        //Bu satır, Java'da Scanner sınıfından bir nesne oluşturur ve
        //kullanıcıdan girdi almak için bu nesneyi kullanır.
        Scanner scanner = new Scanner(System.in);


        // TASK: Java döngüler ile kullanıcının banka hesabını yönetebildiği bir ATM projesi yapıyoruz.
        int bakiye = 1000;
        int kalanHak = 3; // Şifre 3 kere yanlış girilirse bloke olacak.
        String tcNo = "58585858588" ;
        String password= "5858";


        System.out.println("ATM'ye Hoşgeldiniz!");

        while (  kalanHak <=  3 && kalanHak > 0       ) {

            System.out.print("Lütfen 11 Haneli TC numaranızı giriniz: ");
            tcNo = scanner.nextLine(); // T.C. Kimlik Numarası 11 basamaktan oluşan bir numaradır.
            System.out.print(" 4 Haneni Şifrenizi Giriniz: ");
            password = scanner.nextLine(); // UNUTMA: String bir ifadeyi .nextLine ile alıyoruz.

            if ( password.equals("5858") && tcNo.equals("58585858588")) {
                    System.out.println("Sisteme giriş yaptınız.");
                    System.out.println("Para yatırmak için: 1");

                    System.out.println("Para çekmek için 2");
                    System.out.println("Bakiye sorgulamak için 3");
                    System.out.println("Çıkış yapmak için 4'e basınız.");
                    System.out.print("İşleminizi seçiniz:");
                    int islem = scanner.nextInt();
                    switch (islem) {

                        case 1:
                            System.out.println("Bakiyeniz: " + bakiye);
                            System.out.print("Yatırmak istediğiniz miktarı giriniz: ");
                            int yatirilanMiktar = scanner.nextInt();
                            bakiye  += yatirilanMiktar;
                            System.out.println("Yeni Bakiyeniz: " + bakiye);
                            break;
                        case 2:
                            System.out.println("Bakiyeniz: " + bakiye);
                            System.out.print("Çekmek istediğiniz miktarı giriniz: ");
                            int cekMiktar = scanner.nextInt();
                            bakiye -= cekMiktar;
                            System.out.println("Yeni Bakiyeniz: " + bakiye);
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + bakiye);
                            break;
                        case 4:
                            break;

                    } break;

            } else {
                System.out.println("Hatalı giriş yaptınız. Tekrar deneyiniz. ");
                kalanHak--; // Bu satır, kalanHak adlı bir değişkenin değerini bir azaltma işlemidir

                if ( kalanHak == 0 ) {
                    System.out.println("Hesabınız bloke olmuştur. Lütfen bankanızla iletişime geçiniz.");
                }
            }


        }










    }
}
