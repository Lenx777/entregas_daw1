package Caja;

public class Caja {
	//atributos
		protected final int ancho;
		protected final int alto;
		protected final int fondo;
		Unidad u;
		Etiqueta etiqueta;
		
		//constructor
		Caja (int ancho, int alto, int fondo, Unidad u, Etiqueta etiqueta){
			this.ancho=ancho;
			this.alto=alto;
			this.fondo=fondo;
			this.u=u;
			this.etiqueta=etiqueta;
		}
		
		//metodos
		double getVolumen(){
			double volumen = ((this.alto*this.alto)*this.fondo);
			if (u.equals(Unidad.CM)){
				volumen=(volumen/1000000);
			}
			return volumen;
		}
		
		
		@Override
		public String toString(){
			return (Integer.toString(this.ancho)+"x"+Integer.toString(this.alto)+"x"+Integer.toString(this.fondo)+this.u+" con la etiqueta: "+etiqueta.toString());
		}
}
