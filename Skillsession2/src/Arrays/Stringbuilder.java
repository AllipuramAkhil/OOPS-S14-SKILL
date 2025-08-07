package Arrays;
import java.util.Scanner;
public class Stringbuilder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc=new Scanner(System.in);
		        StringBuilder a=new StringBuilder();
		        StringBuilder b=new StringBuilder();
		        System.out.print("Enter first string: ");
		        a.append(sc.nextLine());
		        System.out.print("Enter second string: ");
		         b.append(sc.nextLine());
		        System.out.println("First StringBuilder: "+a);
		        System.out.println("Second StringBuilder: "+b);
		        b.append(a);
		        System.out.println("After joining first to second: "+b);
		        System.out.println("First remains unchanged: "+a);
		        sc.close();
		
	}

}
