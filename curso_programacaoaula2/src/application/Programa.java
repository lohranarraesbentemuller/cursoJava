package application;

import entidades.Produto;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto Televisao=new Produto();
        Televisao.Nome="televisão";
        Televisao.preco=3000.50;
        Televisao.quantidade=5;
        
        Televisao.AdicionarProduto();
        System.out.println( Televisao);
	}

}
