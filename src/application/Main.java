package application;

import java.time.LocalDate;


import entities.Evento;
import entities.GerenciadorDeEventos;
import entities.Reunião;
import entities.Conferencia;
import entities.WorkShop;



public class Main {

	public static void main(String[] args) {
		
		GerenciadorDeEventos gerenciador = new GerenciadorDeEventos();
		
		Reunião reuniao = new Reunião( " Reunião Gerentes " ,LocalDate.of( 2025, 9, 25 ) , " Empresa ", " O assunto de hoje vai ser como a área de TI está cada vez maior com muitos concorrentes porem com pouca experiencia para as demandas exigidas "	);
		Evento evento = new Evento(" Evento de IA ", LocalDate.of(2025, 9, 20), " Shopping Morumbi " );
		Evento evento2 = new Evento(" Evento de TI ", LocalDate.of(2025, 9, 20), " Shopping Bourbon " );
		WorkShop workshop = new WorkShop(" Aprendendo Back-End ", LocalDate.of(2025, 10, 3), " Cafeteria Mooca ", 30);
		Conferencia conferencia = new Conferencia(" Conferencia de IA ", LocalDate.of(2025, 9, 19), " GFT BRASIL ");
	
		
		gerenciador.adicionarEvento(evento);
		gerenciador.adicionarEvento(reuniao);
		gerenciador.adicionarEvento(conferencia);
		gerenciador.adicionarEvento(workshop);
		gerenciador.adicionarEvento(evento2);
		
		gerenciador.listarEventos();
		
		
	
		
		
	}

	

}
