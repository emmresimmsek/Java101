package Siniflar.w3resource.Question03;

public class Main {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(7,12);

        // Write a Java program to create a class called "Rectangle"
        // with width and height attributes. Calculate the area and perimeter of the rectangle.

        System.out.println("Dairenin Alanı: " + rec1.getArea());
        System.out.println("Dairenin Çevresi: " + rec1.getPerimeter());

        // Girdiğimiz değerleri değiştirelim.
        rec1.setWidth(6);
        rec1.setHeight(12);

        //Ekrana yazdıralım.
        System.out.println("Dairenin yeni alanı: " + rec1.getArea());
        System.out.println("Dairenin yeni çevresi: " + rec1.getPerimeter());






    }





}
