package doWhileLoop;

import java.util.Scanner;
public class DtabScn {


public static void main(String[] args) {
	
	System.out.println("enter the Value of i:");
	Scanner sc=new Scanner(System.in);
	
		int i=sc.nextInt();
		System.out.println("Enter the limit of value u:");
		int u=sc.nextInt();
		
		do{
			
			System.out.print(" "+i);
			i++;
			}
		while(i<=u);
		
	}

}
