package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[][] mat=new int [n][n];
        for(int i=0;i<n;i++) {
        	for(int j=0;j<n;j++) {
        		mat[i][j]=sc.nextInt();
        	}
        }
        for(int i=0;i<n;i++) {
        	for(int j=0;j<n;j++) {
        		System.out.print(mat[i][j]+" ");
        	}
        	System.out.print("\n");
        }
        
        sc.close();
	}

}
