package Döngüler;

public class AsalSayilariBulanProgram {
    public static void main(String[] args) {

        //Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.
        for (int sayi = 2; sayi <= 100; sayi++) {
            boolean asalMi = true;

            // Sayının 2 ile kendisi arasındaki tüm sayılara bölünüp bölünmediğini kontrol et.
            for (int i = 2; i <= Math.sqrt(sayi); i++) {
                if (sayi % i == 0) {
                    asalMi = false;
                    break;
                }
            }

            // Eğer sayı asalsa, ekrana yazdır.
            if (asalMi) {
                System.out.print(sayi + " ");
            }
        }
    }



    }
