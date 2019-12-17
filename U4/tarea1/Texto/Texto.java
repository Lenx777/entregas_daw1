package Texto;

public class Texto {
	//Atributos
	 private int longMax;
	 private String pal;
	//Constructor
	Texto(int longMax, String pal){
		this.longMax=longMax;
		this.pal=pal;
	}
	public int getLongMax() {
		return longMax;
	}
	public void setLongMax(int longMax) {
		this.longMax = longMax;
	}
	public String getPal() {
		return pal;
	}
	public void setPal(String pal) {
		this.pal = pal;
	}
	//metodo añadir al principio
	 String añadirPalabraAlPrincipio(String caracter) {
		if(pal.length()<longMax) {
			this.pal=caracter.concat(this.pal);
		}
		return pal;
	}
	
	//metodo añadir al final
	String añadirPalabraAlFinal(String caracter) {
		if(pal.length()<longMax) {
			this.pal=this.pal.concat(caracter);
		}
		return pal;
	}
	//metodo de añadir caracter al principio
	 String añadirCaracterAlPrincipio(String caracter) {
		if(pal.length()<longMax) {
			this.pal=caracter.concat(this.pal);
		}
		return pal;
	}
	//metodo para añadir caracter al final
	 String añadirCaracterAlFinal(String caracter) {
			if(pal.length()<longMax) {
				this.pal=this.pal.concat(caracter);
			}
			return pal;
		} 
	void totalVocales() {
		int contMayusculas=0;
		int contMinusculas =0;
		
		for(int i=0; i<pal.length();i++) {
			if(pal.charAt(i)=='a'||pal.charAt(i)=='e'||pal.charAt(i)=='i'||pal.charAt(i)=='o'||pal.charAt(i)=='u') {
				contMayusculas++;
			}
			if(pal.charAt(i)=='A'||pal.charAt(i)=='E'||pal.charAt(i)=='I'||pal.charAt(i)=='O'||pal.charAt(i)=='U') {
				contMinusculas++;
			}
		}
		System.out.println("El total de mayuscula es de: "+contMayusculas+" y el total de minusculas es de: "+contMinusculas);
	}
}
