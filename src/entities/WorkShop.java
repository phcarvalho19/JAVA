package entities;

import java.time.LocalDate;

public class WorkShop extends Evento {

	int participantesMax;
	

	public WorkShop(String name, LocalDate data, String local, int participantesMax) {
		super(name, data, local);
		this.participantesMax = participantesMax;
	}

	

	public int getParticipantesMax() {
		return participantesMax;
	}
	
	@Override
	public String detalheEspecificos() {
	    System.out.println("O numero de participantes maximo é: " + participantesMax);
	    return "O numero de participantes maximo é: " + participantesMax;
	    

	}
	
}

	

		
	
	
	
	

