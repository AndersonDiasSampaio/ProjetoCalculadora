package br.calculadora;

public class Calcular implements Calculado {
	
	private Double operador1;
	private Double operador2;
	
	public Calcular(Double operador1, Double operador2) {
		this.operador1 = operador1;
		this.operador2 = operador2;
	}

	@Override
	public Double calcular() {
		// TODO Auto-generated method stub
		return 0.d;
	}

	@Override
	public void setOperando1(Double a) {
		this.operador1= a;

	}

	@Override
	public void setOperando2(Double a) {
		this.operador2= a;

	}
	
	@Override
	public Double getOperando1() {
		return this.operador1;

	}

	@Override
	public Double getOperando2() {
		return this.operador2;

	}

}
