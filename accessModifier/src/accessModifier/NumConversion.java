package accessModifier;

import java.util.Scanner;

public class NumConversion {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int n1=n,n2=n;
		int b=n1%10,a=n2/10;
		String[] single_digits=new String[] {"zero","one","two","three"};
		String[] two_digits=new String[] {"","ten","eleven","twelve","thirteen"};
		String[] tens_multiple=new String[] {"","","twenty","thirty","forty"};
		if(a==1)
		{
			System.out.println(two_digits[b+1]);
			
		}
		else if(b==0)
			System.out.println(tens_multiple[a]);
		else
			System.out.println(tens_multiple[a]+ "-" +single_digits[b]);
	
			
			

			
			
	
	}
	

}
