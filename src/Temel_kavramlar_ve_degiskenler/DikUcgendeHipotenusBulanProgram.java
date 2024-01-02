package Temel_kavramlar_ve_degiskenler;
import java.util.Scanner;
public class DikUcgendeHipotenusBulanProgram {
    public static void main(String[] args) {

        //Bu satır, Java'da Scanner sınıfından bir nesne oluşturur ve kullanıcıdan girdi almak için bu nesneyi kullanır.
        Scanner scanner = new Scanner(System.in);

        //SORU: Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

        System.out.print("Birinci dik kenarın uzunluğunu girin: ");
        double kenar1 = scanner.nextDouble();

        System.out.print("İkinci dik kenarın uzunluğunu girin: ");
        double kenar2 = scanner.nextDouble();


        double result = (kenar1 * kenar1) + (kenar2 * kenar2);
        double hipotenus = Math.sqrt(result);

        System.out.println("Hipotenüs: " + hipotenus);

        //

    }
}
