package Temel_kavramlar_ve_degiskenler;

import java.util.Scanner; //import ediyoruz.

public class NotOrtalamasiHesaplayanProgram {
    public static void main(String[] args) {
    /* SORU: Java ile Matematik, Fizik, Kimya, derslerinin sınav puanlarını kullanıcıdan
       alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
    */

        //Bu satır, Java'da Scanner sınıfından bir nesne oluşturur ve kullanıcıdan girdi almak için bu nesneyi kullanır.
         Scanner scanner = new Scanner(System.in);
        int mat, fiz, kim;

        System.out.print("Matematik Notunuz: ");
        mat = scanner.nextInt();
        System.out.print("Fizik Notunuz: ");
        fiz = scanner.nextInt();
        System.out.print("Kimya Notunuz: ");
        kim = scanner.nextInt();

        if ( mat < 0 || mat > 100 || fiz < 0 || fiz > 100 || kim < 0 || kim > 100 )  {
            System.out.println("Lütfen 0-100 arasında notlar giriniz.");
        } else {

            // Ortalama hesabı yapıyoruz.
            int average = (mat+fiz+kim)/3;
            System.out.println("Ortalamanız: " + average);
        }

    }
}
