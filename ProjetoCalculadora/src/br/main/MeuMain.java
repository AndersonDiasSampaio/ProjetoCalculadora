package br.main;

import java.util.Scanner;
import br.calculadora.*;
public class MeuMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n, k;
		n = "n";
		k = "sair";
		Scanner entrada = new Scanner(System.in);
		Double operando1, operando2, valor;
		RealizarOperacao operacao = new RealizarOperacao();
		while (!n.equals(k)) {
			System.out.println("Digite a operacao a ser realizada");
			System.out.println("* para  multiplicacao");
			System.out.println("/ para divisao");
			System.out.println("- para subtracao");
			System.out.println("+ para adicao");
			System.out.println("sair para sair");
			n = entrada.next();
			if (!n.equals(k)) {
				System.out.println("Digite o primeiro valor");
				operando1 = entrada.nextDouble();
				System.out.println("Digite o segundo valor");
				operando2 = entrada.nextDouble();
				valor = operacao.realizarOp(n, operando1, operando2);
				System.out.println(valor);
			} else {
				System.out.println("Tchau");
			}

		}

	}

}
