package entities;

import java.time.LocalDate;

public class Conferencia extends Evento{

	String palestrantePrincipal;
	
	public Conferencia(String name, LocalDate data, String local) {
		super(name, data, local);
		 
	

	
	   detalheEspecificos(); {
		palestrantePrincipal = "Pedro";
	};
	
	
	}
}
