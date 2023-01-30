package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Empregado;

public class Programa {

	public static void main(String[] args) {
	 List<Empregado> empregados = new ArrayList<Empregado>();
	 Scanner sc = new Scanner(System.in);
	 int contador;
	 for(contador=0;contador<3;contador++)
	 {
     System.out.print("Digite o nome e o salário do empregado");
	 Empregado aux=new Empregado(sc.next(),contador,sc.nextDouble());
	 empregados.add(aux);
	 }
    for(Empregado saida:empregados)
    {
        System.out.print(saida.toString());	
    }
	sc.close();

}}
