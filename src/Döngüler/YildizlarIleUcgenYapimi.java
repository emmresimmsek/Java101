package Döngüler;

import java.util.Scanner;

public class YildizlarIleUcgenYapimi {
    public static void main(String[] args) {
        //Bu satır, Java'da Scanner sınıfından bir nesne oluşturur ve
        //kullanıcıdan girdi almak için bu nesneyi kullanır.
        Scanner scanner = new Scanner(System.in);

        //Java'da döngüler kullanılarak yıldızlar ile üçgen yapıyoruz.


        System.out.print("Satır sayısını giriniz: ");
        int satirSayisi = scanner.nextInt();

        // Satır döngüsü
        for (int i = 1; i <= satirSayisi; i++) {
            // Yıldız döngüsü
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Bir satır bitiminde yeni satıra geçmek için



            }









    }
}
