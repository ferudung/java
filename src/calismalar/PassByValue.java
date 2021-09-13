package calismalar;

import java.util.ArrayList;
import java.util.List;

public class PassByValue {

    public static void main(String[] args) {

int fiyat =100;



        System.out.println("fiyaatımız :" +fiyat);
        System.out.println("idirimli hali :"+indirimyap(fiyat));
        System.out.println("fiyaatımız :" +fiyat);
    }

    private static int indirimyap(int indirim) {

        indirim*=0.90;
        return indirim ;
    }
}