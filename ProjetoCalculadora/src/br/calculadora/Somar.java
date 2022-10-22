package br.calculadora;

public class Somar extends Calcular {

	public Somar(Double operador1, Double operador2) {
		super(operador1, operador2);
		// TODO Auto-generated constructor stub
	}
	@Override
	public Double calcular() {
	Double soma= getOperando1() + getOperando2(); 
		return soma;
	}
}
