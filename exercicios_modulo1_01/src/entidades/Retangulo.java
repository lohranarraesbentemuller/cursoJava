package entidades;

public class Retangulo {
   public double width;
   public double height;
   
   public double area() {
	   return (this).width*(this).height;
   }
   public double diagonal() {
	   return Math.sqrt(Math.pow(this.width,2) + Math.pow(height, 2));
   }
   public double perimetro() {
	   return  2*(this).width+2*this.height;
   }
   
   public String toString()
   {
	   return "AREA "+String.format("%.2f",this.area())+"\n"+
       "PERÍMETRO " + String.format( "%.2f",this.perimetro())+"\n"+
	   "DIAGONAL " + String.format("%.2f",this.diagonal())+"\n";		   
   }
}
