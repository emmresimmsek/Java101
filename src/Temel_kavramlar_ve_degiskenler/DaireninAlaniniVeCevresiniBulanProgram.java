package Temel_kavramlar_ve_degiskenler;
import java.util.Scanner;
public class DaireninAlaniniVeCevresiniBulanProgram {
    public static void main(String[] args) {
        //Bu satır, Java'da Scanner sınıfından bir nesne oluşturur ve kullanıcıdan girdi almak için bu nesneyi kullanır.
        Scanner scanner = new Scanner(System.in);

        // Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

        System.out.print("Dairenin yarıçapını girin: ");
        double yaricap = scanner.nextDouble();

        // Dairenin alanını hesaplama: π * r^2
        double alan = Math.PI * yaricap * yaricap;

        // Dairenin çevresini hesaplama: 2 * π * r
        double cevre = 2 * Math.PI * yaricap;

        System.out.println("Dairenin Alanı: " + alan);
        System.out.println("Dairenin Çevresi: " + cevre);

        scanner.close();


    }
}
