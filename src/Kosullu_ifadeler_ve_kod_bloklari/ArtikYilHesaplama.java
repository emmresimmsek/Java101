package Kosullu_ifadeler_ve_kod_bloklari;

import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        //Bu satır, Java'da Scanner sınıfından bir nesne oluşturur ve
        //kullanıcıdan girdi almak için bu nesneyi kullanır.
        Scanner scanner = new Scanner(System.in);

        //TASK: Java ile kullanıcının girdiği yılın artık olup olmadığını bulan programı yazınız.
        //Artık yıl, Miladî takvimde 365 yerine 366 günü olan yıl.
        //Bu fazladan gün (artık gün), normalde 28 gün olan şubat ayına 29 Şubat’ın eklenmesi ile elde edilir.

        System.out.print("Bir yıl gidiriniz: ");
        int year = scanner.nextInt();
        if ( year % 4 == 0  ){


            System.out.println("Artık Yıldır. Bu yılda 29 Şubat vardır.");
        } else {
            System.out.println("Artık Yıl Değildir.");
        }


    }
}
