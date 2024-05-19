package Siniflar.w3resource.Question01;

public class Main {
    public static void main(String[] args) {
        // Java'da, bir sınıftan yeni bir nesne oluştururken, o nesnenin özelliklerini belirtmek için kurucu metodu çağırmanız gerekir.

        Person person1 = new Person("Emre", 30);
        Person person2 = new Person("Yunus", 58);
        System.out.println(person1.getName() + " " + person1.getAge() + " yaşındadır.");
        System.out.println(person2.getName() + " " + person2.getAge() + " yaşındadır.");







    }
}
