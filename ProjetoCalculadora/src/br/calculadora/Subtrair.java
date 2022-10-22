package br.calculadora;

public class Subtrair extends Calcular {

	public Subtrair(Double operador1, Double operador2) {
		super(operador1, operador2);
		// TODO Auto-generated constructor stub
	}
	@Override
	public Double calcular() {
	Double subtrai= Math.abs((getOperando1() - getOperando2())) ; 
		return subtrai ;
	}

}
