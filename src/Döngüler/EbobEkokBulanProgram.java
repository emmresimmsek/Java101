package Döngüler;


import java.util.Scanner;

public class EbobEkokBulanProgram {
    public static void main(String[] args) {

        //EBOB (En Büyük Ortak Bölen) ve EKOK (En Küçük Ortak Kat) terimleri genellikle matematiksel problemlerde kullanılır
        //iki veya daha fazla sayının ilişkisini ifade eder.


        //Bu satır, Java'da Scanner sınıfından bir nesne oluşturur ve
        //kullanıcıdan girdi almak için bu nesneyi kullanır.
        Scanner scanner = new Scanner(System.in);

        //EBOB (En Büyük Ortak Bölen): İki veya daha fazla sayının en büyük ortak bölenidir. Yani, bu sayılar tarafından tam bölünebilen en büyük pozitif tam sayıdır.
        //Örneğin, 12 ve 18'in en büyük ortak böleni 6'dır, çünkü hem 12'yi hem de 18'i bölen en büyük pozitif tam sayıdır.

        int ebob = 0;


        System.out.print("Sayı1 Girilir: ");
        int sayi1 = scanner.nextInt();
        System.out.print("Sayı2 Girilir: ");
        int sayi2 = scanner.nextInt();

        if (sayi1 > sayi2) {

            for (int i = 1; i <= sayi1; i++) {
                if (sayi1 % i == 0 && sayi2 % i == 0 ){
                    ebob = i;
                }
            }
        } else {

            for (int i = 1; i <= sayi2 ; i++) {
              if (sayi1 % i == 0 && sayi2 % i == 0 ){
                  ebob = i;
              }
            }
        }

        // EBOB'u ekrana yazdırma
        System.out.println(ebob);






    }
}
