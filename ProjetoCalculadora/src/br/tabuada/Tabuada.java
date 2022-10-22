package br.tabuada;

import br.calculadora.RealizarOperacao;

public class Tabuada {

	public Tabuada() {
		// TODO Auto-generated constructor stub
	}

	public String Tabuada(String a, Double c) {

		if (a.equalsIgnoreCase("-")) {
			int j = (int) (c + 10);

			for (int x = (j - 10); x <= j; x++) {
				double k = x;
				RealizarOperacao operacao = new RealizarOperacao();
				System.out.println(k + "" + a + c + "=" + operacao.realizarOp(a, k, c));
			}

		} else if (a.equalsIgnoreCase("/")) {
			
			int j = (int) (c*10);
			int contador=1;
			int valorDeEntradafixo= j/10;
			
			for (int x = valorDeEntradafixo; x <= j; x=valorDeEntradafixo*contador) {
				contador++;
				double k = x;
				RealizarOperacao operacao = new RealizarOperacao();
				System.out.println(k+ "" + a + c + "=" + operacao.realizarOp(a, k, c));
			}
		}

		else {
			for (int x = 1; x <= 10; x++) {
				double k = x;
				RealizarOperacao operacao = new RealizarOperacao();
				System.out.println(c + "" + a + k + "=" + operacao.realizarOp(a, k, c));
			}

		}
		return "Digite outro número e operador para calcular essa tabuada";

	}
}
