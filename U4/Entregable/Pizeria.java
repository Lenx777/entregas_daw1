package Entregable;


public class Pizeria {
	//atributos
	private Tama�o tam;
	private Ingredientes[] ingredientes;
	final int maxIngredientes =3;

	//constructor
	Pizeria(Tama�o tam) {
		this.tam=tam;
	}
	//metodos
	 public void a�adirIngrediente(String nombre, int calorias) {
			for (int i = 0; i < maxIngredientes; i++) {
				if (ingredientes[i] == null) {
					ingredientes[i] = new Ingredientes(nombre,calorias);
					break;
				}
			}
	 }
	 public void mostrarInformacion() {
		 System.out.println("El tama�o de la pizza es: "+ tam);
	 }
	
	public Tama�o getTam() {
		return tam;
	}
	public void setTam(Tama�o tam) {
		this.tam = tam;
	}
}
