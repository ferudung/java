package day45_Interface;

public interface DisDonamim {
	public void ayna();
    public void kapi();
    public void kaporta();
    
    String RENK="metalik";
    public default String sisLamp() {//bu method bildiğin bodyli concrete dir.
    return"sisli hava dikkat";	
    }
	
  static String boya() {//bu method bildiğin bodyli concrete dir.
        return"koyu renk boya gunes yanıgı yapar";	
        }
}
