package entities;

import java.time.LocalDate;


	public  class Evento {

	
	String name;
	LocalDate data;
	String local;
	public Evento(String name, LocalDate data, String local) {
		
		this.name = name;
		this.data = data;
		this.local = local;
	}
		public  String getName() {
		return name;
	}
		public LocalDate getData() {
		return data;
	}
		public String getLocal() {
		return local;
	}
	
	
			public String detalheEspecificos() {
				return "Taxa de entrada = R$ 30.00 " 
						+ "Entrada somente com RG Físico"
						+ "Maior De 18";
			};
	public String toString() {
		return "Nome" 
				+ name
				+ "Data" + data
				+ "Local : " 
				+ local
				+ "Detalhe Específicos: "
				+ detalheEspecificos();
	}
	protected static String name() {
		
		return null;
	}
	
}
