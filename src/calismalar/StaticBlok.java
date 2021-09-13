package calismalar;

public class StaticBlok {
    public static int sayi;
    static {
        System.out.println("1 static block");
         sayi=12;
    }

    public  StaticBlok(){
        System.out.println("constractor çalıştı");
        sayi++;
    }

    public static void main(String[] args) {

        System.out.println("main methot");
        sayi++;
        StaticBlok obj1= new StaticBlok();
        sayi++;
        System.out.println(sayi);


    }
    static {
        System.out.println("2 static block");
         sayi=13;
    }
}
