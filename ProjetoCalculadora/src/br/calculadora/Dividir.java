package br.calculadora;

public class Dividir extends Calcular {

	public Dividir(Double operador1, Double operador2) {
		super(operador1, operador2);
		// TODO Auto-generated constructor stub
	}
	@Override
	public Double calcular() {
	Double divide= getOperando1() / getOperando2(); 
		return divide;
	}
}
