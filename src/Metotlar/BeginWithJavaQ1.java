package Metotlar;

public class BeginWithJavaQ1 {
    public static void main(String[] args) {

        // Q-1: Write a program with a method named getTotal that accepts two integers as an argument and return its sum.
        //this method from main( ) and print the results.

            // getTotal(8,50);
            System.out.println( "Sum: " + getTotal(8,50));

    }

        // getTotal isminde geriye değer döndüren  metodumuzu tanımladık..
        public static int getTotal (int number1, int number2 ){


        return number1 + number2;
        // Java'da return ifadesi sadece metotlar içinde kullanılır.
        // return kelimesi, bir metodun işlemi tamamladığını ve sonuç olarak bir değer döndürdüğünü belirtir.
        // Biz burda return ifadesini kısa bir şekilde kullandık..
        // Uzun hali:  int toplam = number1 + number2 ;  ----->  return toplam;


        }

        }


