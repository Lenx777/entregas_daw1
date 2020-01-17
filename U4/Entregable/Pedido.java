package Entregable;



public class Pedido {
	private Pizeria pizeria;
	private Ingredientes ingrediente;
	
	//metodo
	void mostrarInfomacion() {
		pizeria.mostrarInformacion();
		ingrediente.mostrarInformacion();
		
	}
	void pedidoEstandar() {
		System.out.println("Haz seleccionado nuestro pedido estrella");
		System.out.println("Recibiras una pizza familiar con jamón ibérico y queso");
	}

}
