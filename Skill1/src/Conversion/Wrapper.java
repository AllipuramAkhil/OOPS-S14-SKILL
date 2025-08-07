package Conversion;
import java.util.Scanner;
public class Wrapper {
	public static void main(String[] args) {
        int a=25;
        Integer wrappedInt=Integer.valueOf(a); 
        int unwrappedInt=wrappedInt.intValue(); 
        double b=42.75;
        Double wrappedDouble=Double.valueOf(b); 
        double unwrappedDouble=wrappedDouble.doubleValue(); 
        char c='A';
        Character wrappedChar=Character.valueOf(c); 
        char unwrappedChar=wrappedChar.charValue();
        System.out.println("Integer: "+wrappedInt+",Unboxed:"+unwrappedInt);
        System.out.println("Double: "+wrappedDouble+",Unboxed:"+unwrappedDouble);
        System.out.println("Character: "+wrappedChar+",Unboxed:"+unwrappedChar);
	}

}
