package entidades;

public class Conta {
   int numero;
   double saldo;
   String nome;

public String toString() {
	return "Conta "+ this.getNumero() 
	+ " Titular " + this.getNome()
	+ " Saldo " + this.getSaldo() + "\n";
}
   
public Conta(int numero, String nome, double saldo) {
	this.numero = numero;
	this.saldo = saldo;
	this.nome = nome;
}
public Conta(int numero, String nome) {
	this.numero = numero;
	this.nome = nome;
}


public int getNumero() {
	return numero;
}

public double getSaldo() {
	return saldo;
}

public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
   
public void deposito(double valor) {
	this.saldo+=valor;
}
public void saque(double valor) {
   float taxa=5;
   this.saldo=this.saldo - valor-taxa;
}
}