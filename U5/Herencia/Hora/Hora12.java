package Hora;

public class  Hora12 extends Hora{
	//atributos

		String horario;
		
		//constructor
		public Hora12 (int hora, int minuto){
			super (hora, minuto);
			if (this.hora <13){
				horario="AM";
			}else{
				this.hora=this.hora-12;
				horario="PM";
			}
		}
		
		//metodos
		@Override
		public String toString(){
		
			return (super.toString()+horario);
		}
}
