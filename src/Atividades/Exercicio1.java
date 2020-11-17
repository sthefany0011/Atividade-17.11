package Atividades;
//Escreva um programa para ler 2 valores (considere que não serão informados valores iguais) e escrever o maior deles.

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int num1, num2,D;
		
		System.out.printf("Digite o primeiro número: ");
        num1 =ler.nextInt();
        
        System.out.printf("\nDigite o segundo número: ");
        num2 = ler.nextInt();
        
        if (num1<num2){
       System.out.printf("o maior numero é %d",num2);
	}
        else {
        	 System.out.printf("o maior numero é %d",num1);
     	}

       
        	
        }
        }
