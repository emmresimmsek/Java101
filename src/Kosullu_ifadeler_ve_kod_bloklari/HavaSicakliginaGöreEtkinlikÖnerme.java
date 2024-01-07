package Kosullu_ifadeler_ve_kod_bloklari;

import java.util.Scanner;

public class HavaSicakliginaGöreEtkinlikÖnerme {
    public static void main(String[] args) {
        //Bu satır, Java'da Scanner sınıfından bir nesne oluşturur ve
        //kullanıcıdan girdi almak için bu nesneyi kullanır.
        Scanner scanner = new Scanner(System.in);

        // Değişken Tanımlıyorum.
        int heat;
        System.out.println("Sıcaklığa Göre Etkinlik Önerme Uygulamamıza Hoşgeldiniz!");
        System.out.print("Sıcaklığı giriniz: ");
        // Scanner ile kullanıcıdan değer girmesini sağlıyorum.
        heat = scanner.nextInt();

        if (  heat < 0 ) {
            System.out.println(" Kayak yapabilirsiniz. ");
        } else if (  heat  >= 5   &&  heat <= 15   ) {
            if( heat == 15){
                System.out.println("Sinemaya ve pikniğe gidebilirsiniz: ");
            } else { System.out.println("Sinema'ya gidebilirsiniz. ");}


        } else if ( heat  >= 15   &&  heat <= 25 ) {
            if (heat == 25){
                System.out.println("Pikniğe ve yüzmeye gidebilirsiniz. ");


            } else {System.out.println("Pikniğe gidebilirsiniz: "); }




        } else if (heat > 25 ) {
            System.out.println("Yüzme etkinliği yapabilirsiniz. ");

        }



    }
}
