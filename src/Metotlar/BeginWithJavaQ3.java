package Metotlar;

import java.util.Scanner;

public class BeginWithJavaQ3 {
    public static void main(String[] args) {
        //Q3: Write a value-returning method, isVowel that returns the value true if a given character is a vowel(sesli harf),
        // and otherwise returns false. In main() method accept a string from user and count number of vowels in that string.

        //Belirli bir karakter sesli harf ise true değerini, aksi halde false değerini
        //döndüren isVowel adlı değer döndüren bir yöntem yazın. Main() yönteminde kullanıcıdan bir dize kabul edin ve
        //bu dizedeki sesli harf sayısını sayın.


        int sesliHarfSayisi = 0; // Sesli harf sayısını saklamak için bir sayaç oluşturulur


        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir metin giriniz: ");
        String metin = scanner.nextLine();





        for (int i = 0; i < metin.length(); i++) {
            //  System.out.println(metin.charAt(i));  charAt(i) ifadesi, verilen indeksteki karakteri döndürür.
            // dönen ifadeyi teker teker sout ile yazdırdık.

            if ( isVovel(metin.charAt(i)) ) {
                sesliHarfSayisi++; // Eğer karakter bir sesli harfse sayaç artırılır
            }

        }
        System.out.println("Girilen metindeki sesli harf sayısı: " + sesliHarfSayisi);








    }

    public static boolean isVovel (char ch )
    {
        char[] vovels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        // Karakterin sesli harf olup olmadığını kontrol edilir
        for (char vowel : vovels) {
            if (ch == vowel) {
                return true; // Karakter sesli harfse true döner
            }
        }
        return false; // Karakter sesli harf değilse false döner
    }



    }








