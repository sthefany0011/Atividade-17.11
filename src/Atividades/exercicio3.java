package Atividades;
//As ma��s custam R$ 0,30 cada se forem compradas menos do que uma d�zia, e R$ 0,25 se forem compradas pelo menos doze. 
//Escreva um programa que leia o n�mero de ma��s compradas, calcule e escreva o valor total da compra.

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float M, S, E=0;
		
		System.out.println("Quantidades de ma��: ");
	  M = ler.nextFloat();
		
		if(M<=12) {
			S= (float) (M * 0.3);
					System.out.printf("Valor � pagar R$ %f", S);
					
		}
		else {
			
		
		    E= (float) (M* 0.25);
		    
		    System.out.printf("Valor � pagar %f", E);
					

	
			
			
		}
	}

}
