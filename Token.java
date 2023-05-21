import java.io.*;
import java.util.*;
public class Token {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of nodes:");
		int n=sc.nextInt();
		
		//creating token using nodes
		int token=0;int ch=0;int flag=0;
		for(int i=0;i<n;i++) {
			System.out.print(" "+i);
		}
		do {
			System.out.println("Enter Sender:");
			int s=sc.nextInt();
			System.out.println("Enter Receiver:");
			int r=sc.nextInt();
			System.out.println("Enter a data");
			int d=sc.nextInt();
			System.out.println("Token is passing");
			for(int i=token,j=token;(i%n)!=s;i++,j=(j+1)%n) {
				System.out.print(" "+j+"->");
			}
			System.out.println(" "+s);
			System.out.println("Sender"+s+"sending data"+d);
			for(int i=s+1;i!=r;i=(i+1)%n) {
				System.out.println("data"+d+"forwaed by"+i);
			}
			System.out.println("data"+d+"is received by"+r);
			token=s;
			do {
				if(flag==1) {
					System.out.println("Invalied input");
				}
				if(ch!=1 && ch!=0) {
					flag=1;
				}else {
					flag=0;
				}
				
			}while(ch!=1 && ch!=0);
		}while(ch==1);
		
	
	}

}
