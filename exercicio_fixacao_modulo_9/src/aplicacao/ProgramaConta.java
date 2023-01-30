package aplicacao;

import java.util.Scanner;

import entidades.Conta;

public class ProgramaConta {

	public static void main(String[] args) {
   	   System.out.printf("Digite o número da conta\n");
   	   Scanner sc = new Scanner(System.in);
   	   int numeroDaConta=sc.nextInt();
   	   System.out.printf("Digite o nome do titular\n");
   	   String titular=sc.next();
   	   System.out.printf("Digite o saldo inicial\n");
   	   double saldoInicial=sc.nextDouble();
       Conta conta_lohran=new Conta(numeroDaConta,titular,saldoInicial);
       
       System.out.printf("Digite um valor para depósito\n");
       conta_lohran.deposito(sc.nextDouble());
       System.out.printf(conta_lohran.toString());
       System.out.printf("Digite um valor para saque\n");
       conta_lohran.saque(sc.nextDouble());
       System.out.printf(conta_lohran.toString());
       sc.close();
	}

}
