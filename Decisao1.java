package Familia28;

import java.util.Scanner;
	//entre com um n�mero e informe se este n�mero � positivo, negativo ou zero
public class Decisao1 {

	public static void main(String[] args) 
	{
		int num;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nENtre com um n�mero: ");
		num = leia.nextInt();
		
		if(num>0)
		{
			System.out.println("\n"+num+" � positivo!!!");
		}
		else if(num<0)
		{
			System.out.println("\n"+num+" � negativo!!!");
		}
		else
		{
			System.out.println("\n"+num+" � ZERO!!!");
		}
	}

}
