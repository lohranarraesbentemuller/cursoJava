package entidade;

public class Produto {

  public String Nome;
  public int quantidade;
  public double preco;
  public Produto(String Nome,  double preco,int quantidade)
  {
	this.Nome=Nome;
	this.quantidade=quantidade;
	this.preco=preco;
  }
  public Produto(String Nome,  double preco)
  {
	this.Nome=Nome;
	this.preco=preco;
  }  

  
  public int ValorEmEstoque()
  {
	return quantidade;  
  }
  public void AdicionarProduto()
  {
    quantidade++;
  }
  public void RemoverProduto()
  {
	quantidade--;
  }
  public String toString()
  {
	  return this.Nome + " estoque " + this.quantidade + " preço total $" + String.format("%.2f", this.preco*this.quantidade); 
  }
}