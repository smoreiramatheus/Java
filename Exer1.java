package Familia28;

import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) 
	{
		float idade,dias,meses,idadeDias,mesesDias,res;
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("\nQuantos anos voc� tem?: ");
		idade = leia.nextFloat();
		System.out.println("\nQuantos meses voc� tem?: ");
		meses = leia.nextFloat();
		System.out.println("\nQuantos dias voc� tem?: ");
		dias = leia.nextFloat();
		
		idadeDias = (idade * 365);
		mesesDias = (meses * 30);
		dias = dias;
		
		res = idadeDias + mesesDias + dias;
		System.out.println("\nVoc� possui no total "+res+ " dias");
		
		
	}

}
