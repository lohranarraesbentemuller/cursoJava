package Application;

import java.util.Scanner;

import Entidades.Triangulo;

public class Program {

	public static void main(String[] args) {
      double Xa,Xb,Xc,Ya,Yb,Yc;
      Scanner sc=new Scanner(System.in);
      
     
      
      
    sc.close();
    
     Triangulo x,y;
     x=new Triangulo();
     y=new Triangulo();
     
     System.out.println("Digite as medidas do triângulo");
     x.a=sc.nextDouble();
     x.b=sc.nextDouble();
     x.c=sc.nextDouble();
     
     System.out.println("Digite as medidas do triângulo");
     y.a=sc.nextDouble();
     y.b=sc.nextDouble();
     y.c=sc.nextDouble();
     
     System.out.printf("Área do triângulo X = %.4f\n",x.area());
     System.out.printf("Área do triângulo X = %.4f\n",y.area());
     
	}

}
