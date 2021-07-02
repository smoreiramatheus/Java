package Familia28;

import java.util.Scanner;

public class Laçodecisão3 {

	public static void main(String[] args) {
		
		int idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com a sua idade: ");
		idade = leia.nextInt();
		
		if(idade >=10 && idade<=14)
		{
			System.out.println("\nCategoria infatil");
		}
		else if(idade>=15 && idade<=17)
		{
			System.out.println("\nCategoria juvenil");
		}
		else if(idade>=18 && idade<=25)
		{
			System.out.println("\nCategoria adulta");
		}
		else
		{
			System.out.println("\nSem categoria");
		}

	}

}
