package programa;

import java.util.Scanner;

import entidade.Quarto;

public class Aplicacao {

	public static void main(String[] args) {
		Quarto[] quartos= new Quarto[10];
		
		System.out.print("Preenche seu nome, email e quarto deseja se hospedar?");
		Scanner sc = new Scanner(System.in);
		Quarto primeiro=new Quarto(sc.next(),sc.next(),sc.nextInt());
		quartos[primeiro.getQuarto()]=primeiro;
		sc.close();
		quartos[primeiro.getQuarto()].toString();

	}

}
