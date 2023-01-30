package aplicativo;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
       int numeros[] = new int[10];
       int i;
       Scanner sc = new Scanner(System.in);
       System.out.println("Digite 10 números\n");
       for (i=0;i<numeros.length;i++)
       {
    	   numeros[i]=sc.nextInt();
       }
       System.out.println("Números negativos digitados\n");
       for (i=0;i<numeros.length;i++)
       {
    	   if(numeros[i]<0)
    		   System.out.printf("%d\n", numeros[i]);
       }
       
	}

}
