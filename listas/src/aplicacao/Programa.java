package aplicacao;

import java.util.ArrayList;
import java.util.List;

public class Programa {

	public static void main(String[] args) {

     List <String> teste= new ArrayList<>();
     teste.add("Lohran");
     teste.add("Alex");
     teste.add("BOB");
     teste.add("Ana");
     teste.add(2,"Nayane");
     for(String a:teste)
     {
       System.out.print(a+"\n");
     }
     teste.remove("Lohran");
     for(String a:teste)
     {
       System.out.print(a+"\n");
     }
     
	}

}
