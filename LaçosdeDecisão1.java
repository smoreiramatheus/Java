package Familia28;

import java.util.Scanner;

public class LaçosdeDecisão1 {
//
	public static void main(String[] args) 
	{
		int a,b,c;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre como o primeiro valor: ");
		a = leia.nextInt();
		
		System.out.println("\nEntre como o segundo valor: ");
		b = leia.nextInt();
		
		System.out.println("\nEntre como o terceiro valor: ");
		c = leia.nextInt();
		
		
		
		
		if(a>b && a>c)
		{
			System.out.println("\n"+a+" será seu maior valor\"");
		}
		
		else if(b>a && b>c)
		{
			System.out.println("\n"+b+" será seu maior valor ");
		}
		
		else
		{
			System.out.println("\n"+c+" será seu maior valor");
		}

	}

}
