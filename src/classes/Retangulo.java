package classes;

import enuns.Cores;

public class Retangulo extends Forma{
	private Double largura;
	private Double altura;
	
	public Retangulo() {
		super();
	}

	public Retangulo(Cores cor, Double largura, Double altura) {
		super(cor);
		this.largura = largura;
		this.altura = altura;
	}

	public Double getLargura() {
		return largura;
	}

	public void setLargura(Double largura) {
		this.largura = largura;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double area() {
		return largura * altura;
	}
	
}
