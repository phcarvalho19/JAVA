package entities;

import java.time.LocalDate;

public  class Reunião extends Evento {

	String assunto;
	
	public Reunião(String name, LocalDate data, String local, String assunto) {
		super(name, data, local);
	}

	public  String detalheEspecificos(){
	  return assunto = "O assunto de hoje vai ser como a área de TI está cada vez maior com muitos concorrentes porem com pouca experiencia para as demandas exigidas";	
	
	}
	
}
