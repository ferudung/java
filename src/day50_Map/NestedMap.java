package day50_Map;

import java.util.HashMap;
import java.util.Map;

public class NestedMap {

    public static void main(String[] args) {


		/*

		 KimlikNo	: ad: Nilüfer
		 1213  		  soyad: Demir
		 			  Adres: Ankara
		 			  bolum: dev

		 KimlikNo	:  ad: ayşe
		 9856		   soyad: Can
		 			   Adres: Ankara
		 			   bolum: qa


		 */

        HashMap<Integer,HashMap<String,String>> kisiListesi=new HashMap<>();

        HashMap<String,String> kisi1=new HashMap<>();
        kisi1.put("ad", "Nilufer");
        kisi1.put("soyad", "demir");
        kisi1.put("adres", "Ankara");
        kisi1.put("bolum", "dev");


        HashMap<String,String> kisi2=new HashMap<>();
        kisi2.put("ad", "ayse");
        kisi2.put("soyad", "can");
        kisi2.put("adres", "Ankara");
        kisi2.put("bolum", "qa");


        kisiListesi.put(1548, kisi1);
        kisiListesi.put(9856, kisi2);

        System.out.println(kisiListesi);

        // maplarden data getirme

        System.out.println(kisiListesi.get(1548).get("ad") );//mapte get methodu ile value ya karşılık gelen mapi getirdi

        System.out.println(kisiListesi);
        System.out.println("----------------------------------------");


        for (Map.Entry<Integer, HashMap<String, String>> entry : kisiListesi.entrySet())
        {
            System.out.println(entry.getValue().get("ad")+" "+entry.getValue().get("soyad")+" "+
                    entry.getValue().get("bolum"));

        }


    }

}
