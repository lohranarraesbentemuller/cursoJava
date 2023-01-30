package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       System.out.println("Quantos números você vai digitar? \n");
       int n=sc.nextInt();
       int numeros[] = new int[n];
       int i;
       for (i=0;i<numeros.length;i++)
       {
    	   numeros[i]=sc.nextInt();
    	   System.out.print(numeros[i]);
       }
       int soma=0;
       System.out.println("Os números digitados\n");
       for (i=0;i<numeros.length;i++)
       {
    	   soma+=numeros[i];
    	   
       }
       System.out.print(numeros.toString());
       double media = soma/numeros.length;
       //System.out.println("Soma dos números digitados\n");
       System.out.println("Soma "+soma+" média "+media);
	}

}
