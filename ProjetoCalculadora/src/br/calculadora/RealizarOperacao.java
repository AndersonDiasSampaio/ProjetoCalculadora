package br.calculadora;

public class RealizarOperacao {
	String Operador;

	public RealizarOperacao() {
		// TODO Auto-generated constructor stub

	}

	public Double realizarOp(String a, Double b, Double c) {
		Double operar;
		if (a.equalsIgnoreCase("*")) {

			Multiplicar multi = new Multiplicar(b, c);
			operar = multi.calcular();
		} else if (a.equalsIgnoreCase("/")) {
			Dividir divide = new Dividir(b, c);
			operar = divide.calcular();
		} else if (a.equalsIgnoreCase("+")) {
			Somar soma = new Somar(b, c);
			operar = soma.calcular();
		} else if (a.equalsIgnoreCase("-")) {
			Subtrair subtrai = new Subtrair(b, c);
			operar = subtrai.calcular();
		}else {
			operar = 0.d;
		}

		return operar;
	}
}
