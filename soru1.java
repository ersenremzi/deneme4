//soru1

import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) {


        int sayi;


        Scanner scan = new Scanner(System.in);
        System.out.println(" Sayıyı giriniz : ");
        sayi = scan.nextInt();


        if (sayi < 100 && sayi > 90) {
            System.out.println(" Harf Notunuz A ");
        } else if (sayi < 90 && sayi > 80) {
            System.out.println(" Harf Notunuz B ");
        } else if (sayi < 80 && sayi > 70) {
            System.out.println(" Harf Notunuz C ");
        } else if (sayi < 70 && sayi > 55) {
            System.out.println(" Harf Notunuz D ");
        } else if (sayi < 55) {
            System.out.println(" Harf Notunuz F ");
        } else {
            System.out.println("Yanlış bir değer girdiniz. Lütfen tekrar deneyiniz.");
        }


    }
}
