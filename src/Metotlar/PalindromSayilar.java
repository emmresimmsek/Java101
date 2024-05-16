package Metotlar;

import java.util.Scanner;

public class PalindromSayilar {
    public static void main(String[] args) {

        //Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan bir program yapıyoruz.
        // Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.

        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.print("Enter a number: ");
        num = scanner.nextInt();

        if(isPalindrom(num))
        {
            System.out.println("Number is palindrom");
        }
        else
        {
            System.out.println("Number is not palindrom");
        }
        

    }
    public static boolean isPalindrom(int number)
    {
        int temp = number;
        int remainder;
        int reverse = 0;

        while(temp > 0)
        {
            remainder = temp % 10;
            temp = temp / 10;
            reverse = reverse * 10 + remainder;
        }

        return reverse == number;
    }
}
