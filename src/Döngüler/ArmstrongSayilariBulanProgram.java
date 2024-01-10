package Döngüler;

import java.util.Scanner;

public class ArmstrongSayilariBulanProgram {
    public static void main(String[] args) {

        //Bu satır, Java'da Scanner sınıfından bir nesne oluşturur ve
        //kullanıcıdan girdi almak için bu nesneyi kullanır.
        Scanner scanner = new Scanner(System.in);



        //TASK: Java döngüler ile sayının armstrong sayı olup olmadığını bulan programı yazıyoruz..
        //N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse,
        //böyle sayılara "Armstrong Sayı" denir.

        //Armstrong sayıları genellikle üç veya daha fazla basamağa sahip sayılar olarak tanımlanır

        // 153 bir Armstrong sayısıdır çünkü 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153'e eşittir.
        // (1*1*1)  + (5*5*5)  + (3*3*3) = 153

        System.out.println("Bir sayının Armstrong Sayı olup olmadığını öğrenelim.");
        System.out.print("Lütfen 3 haneli bir sayı giriniz: ");
        int girilenSayi = scanner.nextInt();  // Kullanıcının girdiği sayıyı int bir değişkene ***assign*** ediyoruz.
        //assign: atamak

        int birler = girilenSayi % 10;
        System.out.println(birler);

        int onlar =  (girilenSayi  % 100) / 10;
        System.out.println(onlar);

        int yüzler = (girilenSayi / 100) % 10;
        System.out.println(yüzler);

        int islem = (birler * birler * birler) + (onlar * onlar * onlar) + (yüzler * yüzler * yüzler);

        if (islem == girilenSayi) {

            System.out.println("Sayı Armstrong bir sayıdır.");
        } else {
            System.out.println("Sayı Armstrong bir sayı değildir.");
        }











    }

}
