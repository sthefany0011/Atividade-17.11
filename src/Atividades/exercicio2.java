package Atividades;
//Escreva um programa que verifique a validade de uma senha fornecida pelo usu�rio.
//A senha v�lida � o n�mero 1234. Devem ser impressas as seguintes mensagens: ACESSO PERMITIDO caso a senha seja v�lida.
//ACESSO NEGADO caso a senha seja inv�lida.

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
