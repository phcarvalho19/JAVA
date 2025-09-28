package entities;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;




public class GerenciadorDeEventos  {



	
	private List<Evento> eventos = new ArrayList<>(); 
	
		
	
	public  void adicionarEvento(Evento eventos) {
		this.eventos.add(eventos);
	
   

		
	}
public void listarEventos() {
	 for (Evento eventos : eventos) {
		System.out.println(eventos);
	}
}
	   public void listarEventosPorData(LocalDate data) {
	        System.out.println("--- Eventos na data " + data.toString() + " ---");
	        
	        
	        for (Evento evento : this.eventos) {
	            
	            
	            if (evento.getData().isEqual(data)) {
	                
	               
	                System.out.println(evento.toString());
	                System.out.println("--------------------------");
	            

	            }
	        }
	   }
	  
}



	
		
