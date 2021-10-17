package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import classes.Circulo;
import classes.Forma;
import classes.Retangulo;
import enuns.Cores;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Forma> list = new ArrayList<>();

		System.out.print("Digite a quantidades de formas: ");
		Integer n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Fomar #" + i);
			System.out.print("Retangulo ou Circulo?(c/r)");
			char resp = sc.next().charAt(0);
			System.out.println("Cor:  Preto/Azul/Vermelho");
			Cores cor = Cores.valueOf(sc.next().toUpperCase());

			if (resp == 'c' || resp == 'C') {
				System.out.print("Raio: ");
				Double raio = sc.nextDouble();
				list.add(new Circulo(cor, raio));
			} else if (resp == 'r' || resp == 'R') {
				System.out.print("Largura:");
				Double larg = sc.nextDouble();
				System.out.print("Altura:");
				Double alt = sc.nextDouble();
				list.add(new Retangulo(cor, larg, alt));
			} else {
				System.out.println("resposta inválida");
			}

		}

		System.out.println();
		System.out.println("Áreas: ");
		for (Forma f : list) {
			System.out.println(String.format("%.2f", f.area()));
		}

		sc.close();
	}

}
