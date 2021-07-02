package Familia28;

import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) 
	{
		float idade,dias,meses,idadeDias,mesesDias,res;
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("\nQuantos anos você tem?: ");
		idade = leia.nextFloat();
		System.out.println("\nQuantos meses você tem?: ");
		meses = leia.nextFloat();
		System.out.println("\nQuantos dias você tem?: ");
		dias = leia.nextFloat();
		
		idadeDias = (idade * 365);
		mesesDias = (meses * 30);
		dias = dias;
		
		res = idadeDias + mesesDias + dias;
		System.out.println("\nVocê possui no total "+res+ " dias");
		
		
	}

}
