package Emisora;

public class Emisora {
	//metodos
	double frecuencia;
	int maxFrecuencia;
	int minFrecuencia;
	//constructor
	Emisora(double frecuencia){
		this.frecuencia=frecuencia;
		maxFrecuencia=108;
		minFrecuencia=80;
	}
	//metodos
	double pasarFrecuencia(double frecuencia) {
		double display=this.frecuencia;
		if(frecuencia>minFrecuencia ||frecuencia<maxFrecuencia) {
			display=frecuencia+0.5;
		}
		if(display>maxFrecuencia) {
			return display=minFrecuencia;
		}else
			if(display<minFrecuencia){
				return display=maxFrecuencia;
			}
		return display;
	}
}
