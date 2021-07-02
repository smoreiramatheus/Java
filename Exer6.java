package Familia28;
/*6. Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, P(x1, y1) e
P(x2, y2), escreva a distância entre eles. A fórmula que efetua tal cálculo é:  */

import java.util.Scanner;

public class Exer6 {

	public static void main(String[] args) 
	{
		double x1,x2,y1,y2,d;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite a coordenada X do P1: ");
		x1 = leia.nextDouble();
		System.out.println("\nDigite a coordenada Y do P2: ");
		y1 = leia.nextDouble();
		System.out.println("\nDigite a coordenada X do P1: ");
		x2 = leia.nextDouble();
		System.out.println("\nDigite a coordenada Y do P2: ");
		y2 = leia.nextDouble();
		
		d = Math.sqrt(((Math.pow(x2-x1,2))+(Math.pow(y2-y1,2)))+2);
		
		System.out.printf("\nDistancia entre os pontos é de: %2.2f",d," cm");
		

	}

}
