package Hora;

public class HoraExacta extends Hora {
	//atributos
		int segundo;

		//constructor
		HoraExacta (int hora, int minuto, int segundo){
			super (hora, minuto);	
			this.minuto=minuto;
		}
		
		//metodos
		public void setSegundo (int segundo){
			boolean superado=false;
			for (int i=0;i>segundo;i++){
				if ((this.segundo<60)&&(superado==false)){
					this.segundo++;
				}else{
					System.out.println("Supera los 60 segundos, no valido");
					superado=true;
				}
			}
		}
		
		public void inc(){
			this.segundo=this.segundo+1;
			if (this.segundo>59){
				this.minuto=minuto+1;
				this.segundo=segundo-60;
				if (this.minuto>59){
					this.minuto=minuto-60;
					this.hora=hora+1;
					if (this.hora>23){
						this.hora=0;
					}
				}
			}
		}
		
		public boolean Comparar (HoraExacta aComparar){
			return ((this.hora==aComparar.hora)&&(this.minuto==aComparar.minuto)&&(this.segundo==aComparar.segundo));
		}
}
