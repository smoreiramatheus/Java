package Familia28;

import java.util.Scanner;

/* 2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias. */

public class Exer2 {

	public static void main(String[] args) 
	{
		int totaldias,anos,meses,dias;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o tital de dias vividos: ");
		totaldias = leia.nextInt();
		
		anos = (totaldias / 365);
		meses = (totaldias % 365) / 30;
		dias = (totaldias % 365) % 30;
		
		System.out.println("\nEu vivi: "+anos+" anos(s), "+meses+" mes(es), "+dias+" dia(s) de vida...");
		
	}

}
