
//Calculadora de Equações Diofantinas - MD2
//Alunos: Mayara Alves de Oliveira – 200025058 / Paulo Vinicius Pinheiro do Nascimento - 190129344
//Disciplina FGA0108 - MATEMÁTICA DISCRETA 2
//Professor Matheus Bernardini


package Calculadora;

import java.util.Scanner;

public class EquacaoDiofantina {
	
	public static void main (String [] args) {
		
		System.out.println(" ------------------------- BEM VINDO A CALCULADORA DE EQUAÇÃO DIOFANTINA --------------------\n");
		System.out.println("Na matemática, uma equação Diofantina é uma equação polinomial que permite a duas ou mais variáveis\nassumirem apenas valores inteiros.\n"
				+ "Problemas Diofantinos possuem menos equações que variáveis desconhecidas e se resumem a achar inteiros que deverão \nfuncionar corretamente para todas as equações.\n"
				+ "Numa linguagem um pouco mais técnica, elas definem uma curva algébrica, uma superfície algébrica ou\num objeto mais genérico e então é pedido para se achar os retículos.\n "
				+ "                                           ax + by = c\n"
				+ "-------------------------------------------------------------------------------------------------------------");
		
		int a; 
		int b;
		int c;
		int x;
		int y; 
		
		System.out.println("\n Digite o valor de A para expressão:");
		Scanner ler = new Scanner(System.in);   
		a = ler.nextInt();
		System.out.println("\n Digite o valor de B para expressão:");
		b = ler.nextInt();
		System.out.println("\n Digite o valor de C para expressão:");
		c = ler.nextInt();
		
		System.out.println("------------------------------------- SOLUÇÃO ---------------------------------------------------------\n"
				+ "A solução para a expressão " + a +"x + " + b + "y = " + c + " e dada por: ");
		int ax = a;
		int bx = b;
		
		if (a == 0 && b == 0) {
				System.out.println("não foi possivel calcular a equação pois A e B são nulos!");
			} else {	
				int resto = 0;
			    while (bx != 0) {
			        resto = ax % bx;
			        ax = bx;
			        bx = resto;
			        }	 
				System.out.println("MDC = ("+ a +"," + b +") = " + ax);
			    while (bx != 0) {
			        resto = ax % bx;
			        ax = bx;
			        bx = resto;
					System.out.println("MDC = ("+ a +"," + b +") = " + ax);
			        }	 
			   }	 
		}
	}
