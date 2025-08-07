package Arrays;
import java.util.Scanner;
public class Reverse {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        StringBuilder s=new StringBuilder();
        System.out.print("Enter a string: ");
        s.append(sc.nextLine());
        System.out.println("Original String: "+s);
        s.reverse();
        System.out.println("Reversed String: "+s);
        sc.close();
	}

}
