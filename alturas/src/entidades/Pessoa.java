package entidades;

public class Pessoa {
   private double altura;
   private int idade;
   private String nome;
   public Pessoa() {}
   public Pessoa(String nome, int idade,double altura) {
	this.altura = altura;
	this.idade = idade;
	this.nome = nome;
    }
   public int getIdade() {
	   return this.idade;
   }
   public double getAltura() {
	   return this.altura;
   }
   public String getNome() {
	   return this.nome;
   }   
   public String toString() {
	   return "Nome "+ this.nome
			   + "\nIdade " + this.idade
			   + "\nAltura "+ this.altura;
   }
   
}
