package Arrays;
import java.util.Scanner;
public class Chararray {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        char[] charArray={'H','e','l','l','o'};
        String str1="World";
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputStr=sc.nextLine();
        System.out.println("Character Array as String: "+new String(charArray));
        System.out.println("String Object: "+str1);
        System.out.println("Input String: "+inputStr);
        String converted=new String(charArray);
        System.out.println("Converted Character Array to String: "+converted);
    }
}
