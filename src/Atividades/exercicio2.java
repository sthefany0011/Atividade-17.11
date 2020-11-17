package Atividades;
//Escreva um programa que verifique a validade de uma senha fornecida pelo usuário.
//A senha válida é o número 1234. Devem ser impressas as seguintes mensagens: ACESSO PERMITIDO caso a senha seja válida.
//ACESSO NEGADO caso a senha seja inválida.

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		int senha;
		
		System.out.println("Informe a senha: ");
		senha = ler.nextInt();
		
		if(senha == 1234) {
		System.out.println("Acesso permitido");
		}
		else {
			System.out.println("Acesso Negado");
		}
	}

}
