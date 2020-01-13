package Hora;

public class Hora {
	//atributos
			int hora;
			int minuto;

			//constructor
			public Hora (int hora, int minuto){
				setHora(hora);	
				setMinutos(minuto);
			}
			
			//metodos
			
			
			void inc(int minuto){
				for (int i=0;i<minuto;i++){
					this.minuto++;
					if (this.minuto>59){
						this.minuto=this.minuto-60;
						this.hora=hora+1;
						if (this.hora>23){
							this.hora=0;
						}
					}
				}
			}
			
			
			void setMinutos(int minuto){
				if (minuto<60 && minuto >=0){
					this.minuto=minuto;
				}
			}
			
			void setHora(int hora){
				if (hora<24 && hora>=0){
					this.hora=hora;
				}
			}
			@Override
			public String toString(){
				return (Integer.toString(this.hora)+":"+Integer.toString(this.minuto));
			}
}
