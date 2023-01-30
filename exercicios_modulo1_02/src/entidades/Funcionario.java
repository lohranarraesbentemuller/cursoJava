package entidades;

public class Funcionario {
    public double SalarioBruto;
    public double Imposto;
    public String Nome;
    
    public double SalarioLiquido() {
    	return SalarioBruto-Imposto;
    }
    public void Aumento(double percentual) {
    	this.SalarioBruto=this.SalarioBruto*(percentual/100)+this.SalarioBruto;
    }
    public String toString() {
    	return "Funcionario "+this.Nome+", "+ String.format("%.2f", -this.Imposto+this.SalarioBruto);
    }

    
}
