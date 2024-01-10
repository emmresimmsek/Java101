package Döngüler;

import java.util.Scanner;

public class ÜslüSayiHesaplayanProgram {
    public static void main(String[] args) {
        //Bu satır, Java'da Scanner sınıfından bir nesne oluşturur ve
        //kullanıcıdan girdi almak için bu nesneyi kullanır.
        Scanner scanner = new Scanner(System.in);

        //TASK: Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı yazıyoruz.
        System.out.print("Üssü alınacak sayı: ");
        int sayi = scanner.nextInt();
        System.out.print("Üs olacak sayi: ");
        int üs = scanner.nextInt();
        int result = 1; // İlk değeri 1 olarak ayarlıyoruz, çünkü herhangi bir sayının 0. üssü 1'dir.


        for (int i = 0; i < üs ; i++) {
            result *= sayi  ; // Her adımda sayi'yi us kez çarpıyoruz.
        }
        System.out.println(result);








    }
}
