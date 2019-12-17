package Reloj;

public class Reloj {
	//atributo
		private int hora;
		private int minuto;
		private int segundo;
		int n;
		//constructor
		Reloj(int hora,int minutos,int segundos){
			this.hora=hora;
			this.minuto=minutos;
			this.segundo=segundos;
		}
		//metodos
		void setSegundos(int n){
			if (this.segundo+n>59){
				this.minuto=minuto+1;
				this.segundo=segundo+n-60;
				if (this.minuto>59){
					this.minuto=minuto-60;
					this.hora=hora+1;
					if (this.hora>23){
						this.hora=0;
					}
				}
			}
			}
			
			int getHora(){
				return this.hora;
			}
			
			int getMinuto(){
				return this.minuto;
			}
			
			int getSegundo(){
				return this.segundo;
			}
}
