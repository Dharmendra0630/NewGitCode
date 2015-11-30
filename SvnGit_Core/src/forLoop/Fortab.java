package forLoop;

import java.util.Scanner;

public class Fortab {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to tabworld");;
		
		int a;
		System.out.println("Enter the value tab start");
		int b=sc.nextInt();
		System.out.println("limit  of start tab");
		int c=sc.nextInt();
		int d;
		System.out.println("enter the value tab u want to start");
		int e=sc.nextInt();
		System.out.println("limit value tab u want to stop");

		int f=sc.nextInt();
	for(a=b;a<=c;a++){
		for(d=e;d<=f;d++){
			System.out.print("	"+(a*d));
		}
		System.out.println(" ");
		sc.close();
	  }	
	}

}
