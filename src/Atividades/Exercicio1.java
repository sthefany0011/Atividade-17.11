package Atividades;
//Escreva um programa para ler 2 valores (considere que n�o ser�o informados valores iguais) e escrever o maior deles.

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int num1, num2,D;
		
		System.out.printf("Digite o primeiro n�mero: ");
        num1 =ler.nextInt();
        
        System.out.printf("\nDigite o segundo n�mero: ");
        num2 = ler.nextInt();
        
        if (num1<num2){
       System.out.printf("o maior numero � %d",num2);
	}
        else {
        	 System.out.printf("o maior numero � %d",num1);
     	}

       
        	
        }
        }
