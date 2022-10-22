package br.calculadoraNvezes;

import java.util.ArrayList;
import java.util.Scanner;

public class MainCalculadoraNvezes {

	public MainCalculadoraNvezes() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		CalculadoraNvezes calc = new CalculadoraNvezes();
		System.out.println("Digite a quantidade de operandos terem operacoes realizadas minimo 2");

		int vezes = entrada.nextInt();
		for (int x = 0; x < vezes; x++) {
			calc.addArrayValores(entrada.nextDouble());
		}
		System.out.println("Digite a operacao a ser realizada");
		System.out.println("* para  multiplicacao");
		System.out.println("/ para divisao");
		System.out.println("- para subtracao");
		System.out.println("+ para adicao");
		calc.operacao(entrada.next());
		System.out.println(calc.getResultado());
		;
	}

}
