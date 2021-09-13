package day50_Map;

import java.util.HashMap;
import java.util.Scanner;
public class Ornekler {
    public static void main(String[] args) {

/*
    1- Kullanıcıdan bir kişinin kimlik numarsını(4 haneli), tam ismini, adresini , telefonunu alın.
      2- Kimlik numarasını key olarak, diğer bilgileri value olarak bir mape depolayın
      3- Kimlik numarasını girerek kullanıcını bilgilerini ekrana yazdırın
      4- Tüm kullanicilarin isimlerini ekrana yazdıralım
 */
        String secim="";

        HashMap<   Integer,   HashMap<String, String>    > kisiListesi=new HashMap<>();

        Scanner scan=new Scanner(System.in);
        do {



            HashMap<String,String> kisiBilgileri =new HashMap<>();



            System.out.println("Lutfen adinizi ve soyadinizi girin: ");
            // String isim=scan.nextLine();
            kisiBilgileri.put("ad",scan.nextLine());

            System.out.println("Lutfen adresinizi girin: ");
            //String adres=scan.nextLine();
            kisiBilgileri.put("adres", scan.nextLine());


            System.out.println("Lutfen telefonunuzu girin: ");
            //String tel=scan.nextLine();
            kisiBilgileri.put("telefon", scan.nextLine());

            System.out.println("4 haneli kimlik no giriniz: ");
            //int kimlikNo=scan.nextInt();
            kisiListesi.put(scan.nextInt(), kisiBilgileri);

            scan.nextLine();
            System.out.println(kisiBilgileri);
            System.out.println(kisiListesi);
            System.out.println("DEvam etmek istiyor musnuz(E/H)");
            secim=scan.nextLine();
        }
        while (secim.equalsIgnoreCase("E"));

        System.out.println("görüntülemek istediğiniz kişinin kimlik numarasını girin ");
        System.out.println(kisiListesi.get(scan.nextInt()));


    }
}

