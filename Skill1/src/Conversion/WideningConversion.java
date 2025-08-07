package Conversion;

import java.util.Scanner;

public class WideningConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Value as Integer: ");
		int a=sc.nextInt();
		long b=a;
		float c=b;
		System.out.println("Int value: "+a);
        System.out.println("Long value: "+b);
        System.out.println("Float value: "+c);
	}

}
