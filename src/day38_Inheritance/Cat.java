package day38_Inheritance;

public class Cat extends Mammal{
    public void mC() {
        System.out.println("cat" );
    }
    int c=9;//parenti ile aynı
     int d=5;
    
    Cat()   {
        System.out.println("p'siz cons Cat");
    }
    Cat(String s)   {
        this();
        System.out.println(super.c);
        System.out.println("String p'li cons Cat");
    }
}