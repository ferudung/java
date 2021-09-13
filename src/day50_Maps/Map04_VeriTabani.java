package day50_Maps;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
public class Map04_VeriTabani {
    public static void main(String[] args) {

        String dosyaYolu="C:\\Users\\acer\\Desktop\\veritabani.csv";
        Map<String,String> veriMap=veriTAbaniAl(dosyaYolu);
        System.out.printf("veri map:", veriMap);
    }

    public static Map<String, String> veriTAbaniAl(String dosyaYolu) {
        Map<String,String> eklenecekMap=new HashMap<>();

        try {
            BufferedReader br=new BufferedReader(new FileReader(dosyaYolu));
            String satir=br.readLine();

            while (satir != null) {

                String keyValue[] = satir.split(",");
                eklenecekMap.put(keyValue[0], keyValue[1]);
                satir = br.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return eklenecekMap;
    }
}
