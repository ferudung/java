package day34_Encapsulation;
public class C01_AdemOglu {
    
    String name;
    String surName;
    private int age;
    
    
    public static void main(String[] args) {
        
    }
    /*
    public void yasAta(int age) {//obj isterse yasi set eder
         if (age<0) {
             this.age=-age;
            
        }else this.age=age;
        
    }
    public int yasGoster() {//bu metod obj isterse yasini g�sterir
        
        return this.age;
        }*/


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		if (age>0) {
			this.age = age;
		}else this.age = -age;
		
	}
    
        
    
}