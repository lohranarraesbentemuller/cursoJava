package aplicacao;

import java.util.Scanner;

import entidades.Retangulo;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite um lado do retangulo");
		Retangulo retangulo = new Retangulo();
		retangulo.width=sc.nextDouble();
		System.out.println("Digite o outro lado do retangulo");
		retangulo.height=sc.nextDouble();
		
		System.out.printf(retangulo.toString());
	}

}
