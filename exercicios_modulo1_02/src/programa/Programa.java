package programa;

import java.util.Scanner;

import entidades.Funcionario;


public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario funcionario_01=new Funcionario();
		Scanner sc=new Scanner(System.in);
		System.out.printf("Nome ");
		funcionario_01.Nome=sc.next();
		System.out.printf("Salario ");
		funcionario_01.SalarioBruto=sc.nextDouble();
		System.out.printf("Imposto ");
		funcionario_01.Imposto=sc.nextDouble();
		System.out.printf(""+ funcionario_01.toString());
    	System.out.printf("\nQual a taxa de aumento?");
    	funcionario_01.Aumento(sc.nextDouble());
    	System.out.printf("Update: "+ funcionario_01.toString());
	}

}
