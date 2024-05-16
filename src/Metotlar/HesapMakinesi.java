package Metotlar;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int toplam = topla(50,50);
        System.out.println(toplam);



    }
    public static int topla (int number1, int number2){

            return number1 + number2 ;

    }
}
