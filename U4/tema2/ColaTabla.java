package ampliacion;

import java.util.Arrays;

/*Actividad 1.
Una cola es otra estructura dinamica como la pila, donde los elementos, en vez de apilarse 
y desapilarse, se encolan y desencolan.
La diferencia es que se desencola el primer elemento encolado y no el ultimo, como en las 
colas del autobus o del cine.
El primero que llega es el primero que sale de la cola (vamos a suponer que nade se cuela).
Por tanto, los elementos se encolan y desencolan en extremos opuestos de la estructura, 
llamados primero (el que esta primero y sera el proximo en abandonar la cola) y ultimo 
(el que llego ultimo).
Se pide implementar la clase ColaTabla en la que los elementos Integer encolados se guardan 
en una tabla.*/
public class ColaTabla implements Cola{

	//atributos
	Integer[] tabla;
	
	//constructor
	ColaTabla (){
		tabla = new Integer[10];
	}
	
	//metodos
	void encolar(Integer num){
		if (tabla[tabla.length-1]!=null){
			tabla = Arrays.copyOf(tabla,tabla.length+1);
		}
		for (int i=tabla.length-2; i>1; i--){
			tabla[i+1]=tabla[i];
		}
		tabla[0]=num;
	}
	
	void desencolar(Integer num){
		for (int i=1; i<tabla.length-2; i++){
			tabla[i-1]=tabla[i];
		}
		tabla = Arrays.copyOf(tabla,tabla.length-1);
	}

	@Override
	public void encolarRandom() {
		int i;
		Integer num;
		for (i=0;i<10;i++){
			num=(int) Math.random();
			encolar(num);
		}
		System.out.println("Esta es la tabla con los Integer encolados");
		System.out.println(Arrays.deepToString(this.tabla));
		System.out.println("Cuyas posiciones encoladas son:");
		for (i=this.tabla.length-11;i<this.tabla.length-1;i++){
			System.out.println(this.tabla[i]);
		}
		for (i=0;i<10;i++){
			for (int j=this.tabla.length-11;j<this.tabla.length-1;j++){
			desencolar(this.tabla[j]);
			}
		}
	}
		
}