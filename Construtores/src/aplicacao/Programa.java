package aplicacao;

import entidade.Produto;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto Televisao=new Produto("televisao",300.50,5);
        
        
        Televisao.AdicionarProduto();
        System.out.println( Televisao);
	}

}
