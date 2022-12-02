
//Calculadora de Equa��es Diofantinas - MD2
//Alunos: Mayara Alves de Oliveira � 200025058 / Paulo Vinicius Pinheiro do Nascimento - 190129344
//Disciplina FGA0108 - MATEM�TICA DISCRETA 2
//Professor Matheus Bernardini


package Calculadora;

import java.util.Scanner;

public class EquacaoDiofantina {
	
	public static void main (String [] args) {
		
		System.out.println(" ------------------------- BEM VINDO A CALCULADORA DE EQUA��O DIOFANTINA --------------------\n");
		System.out.println("Na matem�tica, uma equa��o Diofantina � uma equa��o polinomial que permite a duas ou mais vari�veis\nassumirem apenas valores inteiros.\n"
				+ "Problemas Diofantinos possuem menos equa��es que vari�veis desconhecidas e se resumem a achar inteiros que dever�o \nfuncionar corretamente para todas as equa��es.\n"
				+ "Numa linguagem um pouco mais t�cnica, elas definem uma curva alg�brica, uma superf�cie alg�brica ou\num objeto mais gen�rico e ent�o � pedido para se achar os ret�culos.\n "
				+ "                                           ax + by = c\n"
				+ "-------------------------------------------------------------------------------------------------------------");
		
		int a; 
		int b;
		int c;
		int x;
		int y; 
		
		System.out.println("\n Digite o valor de A para express�o:");
		Scanner ler = new Scanner(System.in);   
		a = ler.nextInt();
		System.out.println("\n Digite o valor de B para express�o:");
		b = ler.nextInt();
		System.out.println("\n Digite o valor de C para express�o:");
		c = ler.nextInt();
		
		System.out.println("------------------------------------- SOLU��O ---------------------------------------------------------\n"
				+ "A solu��o para a express�o " + a +"x + " + b + "y = " + c + " e dada por: ");
		int ax = a;
		int bx = b;
		
		if (a == 0 && b == 0) {
				System.out.println("n�o foi possivel calcular a equa��o pois A e B s�o nulos!");
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
