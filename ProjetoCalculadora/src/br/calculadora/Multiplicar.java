package br.calculadora;

public class Multiplicar extends Calcular {

	public Multiplicar(Double operador1, Double operador2) {
		super(operador1, operador2);
		// TODO Auto-generated constructor stub
	}
	@Override
	public Double calcular() {
	Double multiplica= getOperando1() * getOperando2(); 
		return multiplica;
	}
}
