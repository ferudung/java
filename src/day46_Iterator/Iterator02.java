package day46_Iterator;
import java.util.*;
public class Iterator02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("t", "a", "r", "i", "k"));
        System.out.println("ilk hali: " + list);
        ListIterator lt1 = list.listIterator();//listıterator interfaceden lt1 veriable creat edildi. degerini listten assingn edildi
        while (lt1.hasNext()) {
            String depo = (String) lt1.next();
            lt1.set(depo + ":-)");//list elemnalrini update etti
        }
        System.out.println("update hali : " + list);
        List<String> list1 = new ArrayList<>(Arrays.asList("m", "e", "l", "i", "h", "a"));
        //son elemanina :-) ile update ediniz
        System.out.println("ilk hali: " + list1);
        ListIterator lt2 = list1.listIterator();//listıterator interfaceden lt1 veriable creat edildi. degerini listten assingn edildi
        int count = 0;
        while (lt2.hasNext()) {
            String depo = (String) lt2.next();
            if (count == list1.size() - 1) {
                lt2.set(depo + ":-)");
            }
            //2.yol
            if (!lt2.hasNext()) {
                lt2.set(depo + ":-)");
            }
            count++;
        }
        System.out.println(list1);//[m, e, l, i, h, a:-)]
    }
}
