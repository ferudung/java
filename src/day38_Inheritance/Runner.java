package day38_Inheritance;

public class Runner {
    public static void main(String[] args) {
        Cat c1 =new Cat(); //p'siz cons  ile obj  Data type Cat classından
        /*
         * aynı isimli veriable'ler obj. call edilirken once obj 
         * kendi classındaki veriable call edilir. 
         * sonra parentindeki veriable call edilir.
         */
        
        System.out.println(c1.a);//5 animal
        System.out.println(c1.c);//9 kendi class c mammal dan değil
        System.out.println(c1.d);//5 kendi class
        System.out.println(c1.m);//4 mammal
        
        c1.mM();//animalmammal  Animal class-->call
        c1.mC();//cat  Cat class-->call
        c1.mA();//mammal Mammal class-->call
        
        
        /* Method call edilirken aynı isimli methodların hangisinin alıncagına const karar verir.
         * childen  parente doğru hiyararsi yapilir.babadan dedeye once kimde bulursa onu alir.
         * Data Type ve Consctructor farkli classlar-->Parent obj =new Child();
         * parent class'dan baslanir child classdan değil
         * 
         *
         */
        
        
        Mammal c2=new Cat(); //c2 obj kendi class'ı mammal
        
        System.out.println(c2.a);//5 Animal class-->call
        System.out.println(c2.c);//7 Mammal class-->call
        System.out.println(c2.m);//4 Mammal class-->call
        
        c2.mA(); //mammal  mammal cons--> call
        c2.mC(); //cat  cat cons-->call
        c2.mM(); // animal mammal  animal cons-->call
        
    
        Mammal m1=new Mammal();
        Animal c3=new Cat();
//m1 ve c3 obj uzerinden veriable ve method call???
    }
}
