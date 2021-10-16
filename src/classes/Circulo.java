package classes;

import enuns.Cores;

public class Circulo extends Forma {
	private Double raio;
	
	public Circulo() {
		super();
	}

	public Circulo(Cores cor, Double raio) {
		super(cor);
		this.raio = raio;
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	public Double area() {
		return Math.PI * Math.pow(raio, 2);
	}
	
}
