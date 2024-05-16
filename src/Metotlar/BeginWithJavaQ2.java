package Metotlar;

public class BeginWithJavaQ2 {
    public static void main(String[] args) {
    // Q2: Write a method named isEven (Çift) that accepts an int argument.
    // The method should return true if the argument is even, or false otherwise. Also write a program to test your method.



        System.out.println(isEven(58));

    }

    public static boolean isEven (int number){

        //Java'da mod alma işlemi % operatörü kullanılarak yapılır.
        if ( number % 2 == 0 ) {  // Bir sayının çift olup olmadığını kontrol etmek için kullanılan bir koşuldur.

            return true ;
        } else {
            return false;
        }


    }



}
