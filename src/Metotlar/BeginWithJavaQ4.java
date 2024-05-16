package Metotlar;

import java.util.Scanner;

public class BeginWithJavaQ4 {
    public static void main(String[] args) {


         /* Q4: A prime number is a number that is evenly divisible only by itself and
         1. For example, the number 5 is prime because it can be evenly divided only by 1 and 5. The number 6, however,
         is not prime because it can be divided evenly by 1, 2, 4, and 6.
         Write a method named isPrime, which takes an integer as an argument and returns true if the argument is a prime number,
         or false otherwise. Also write main method that displays prime numbers between 1 to 500. */




        for (int i = 2; i <= 500; i++) {

         if (isPrime(i)){

             System.out.println(i + "  Asal sayıdır. ");
         }


        }



















    }
    public  static boolean isPrime (int number){
        for (int i = 2; i < number; i++) {

            if (number % i == 0){

                return  false;
            }




        }


        return true;
    }

    // Bir sayının asal sayı olması için 1'e ve kendisine bölünmesi lazım.
    // Her sayı 1'e zaten bölünür!!!
    // Her sayı kendisine zaten bölünür!!! Kalan hep 0 sıfır olur.
    // 1 Asal sayı değildir.


}
