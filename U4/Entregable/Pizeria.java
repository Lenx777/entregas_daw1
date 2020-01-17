package Entregable;


public class Pizeria {
	//atributos
	private Tamaño tam;
	private Ingredientes[] ingredientes;
	final int maxIngredientes =3;

	//constructor
	Pizeria(Tamaño tam) {
		this.tam=tam;
	}
	//metodos
	 public void añadirIngrediente(String nombre, int calorias) {
			for (int i = 0; i < maxIngredientes; i++) {
				if (ingredientes[i] == null) {
					ingredientes[i] = new Ingredientes(nombre,calorias);
					break;
				}
			}
	 }
	 public void mostrarInformacion() {
		 System.out.println("El tamaño de la pizza es: "+ tam);
	 }
	
	public Tamaño getTam() {
		return tam;
	}
	public void setTam(Tamaño tam) {
		this.tam = tam;
	}
}
