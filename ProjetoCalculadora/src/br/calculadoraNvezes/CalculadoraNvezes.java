package br.calculadoraNvezes;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraNvezes {

	private Double operando1;
	private Double operando2;
	private Double resultado;
	private List<Double> arrayValores;
	String operacao;

	public CalculadoraNvezes() {
		// TODO Auto-generated constructor stub3
		this.resultado = 0.d;
		this.arrayValores = new ArrayList<>();
		this.operando1= 0.d;
		this.operando2=0.d;
		this.operacao="";
	}

	public Double getResultado() {
		return resultado;
	}

	public void setOperando1(Double operando1) {
		this.operando1 = operando1;
	}

	public void setOperando2(Double operando2) {
		this.operando2 = operando2;
	}

	private void somarNvezes() {

		for (int x = 0; x < arrayValores.size(); x++) {
			this.resultado = resultado + arrayValores.get(x);
		}
	}

	private void subtrairNvezes() {
		for (int x = 0; x < arrayValores.size(); x++) {
			this.resultado = Math.abs(resultado - arrayValores.get(x));
		}

	}

	private void dividirNvezes() {
		for (int x = 0; x < (arrayValores.size() - 1); x++) {
			if (arrayValores.get(x + 1) != 0) {
				if (x == 0) {
					this.resultado = (resultado + arrayValores.get(x)) / arrayValores.get(x + 1);
				} else {
					this.resultado = resultado / arrayValores.get(x + 1);
				}
			} else {
				System.out.println("impossivel dividir por 0, o valor até a operação anterior é");
			}
		}

	}

	public void addArrayValores(Double valor) {
		this.arrayValores.add(valor);
	}

	private void multiplicarNvezes() {
		resultado = 1d;
		for (int x = 0; x < arrayValores.size(); x++) {

			this.resultado = resultado * arrayValores.get(x);
		}

	}

	public void operacao(String a) {

		if (a.equalsIgnoreCase("+")) {
			somarNvezes();
		} else if (a.equalsIgnoreCase("-")) {
			subtrairNvezes();
		} else if (a.equalsIgnoreCase("/")) {
			dividirNvezes();
		} else if (a.equalsIgnoreCase("*")) {
			multiplicarNvezes();
		} else {
			System.out.printf("digite uma oepracao válida");
		}

	}

}
