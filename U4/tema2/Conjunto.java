package ampliacion;

import java.util.Arrays;

/*Un conjunto es una estructura dinamica de datos como la lista, con dos diferencias:
en primer lugar, en una lista puede haber elementos repetidos, mientras que en un
conjunto, no. Ademas, en una lista el orden de insertion de los elementos puede ser
relevante, mientras que en un conjunto solo interesa si un elemento pertenece o no al
conjunto y no el lugar que ocupa. Se pide implementar la clase Conjunto utilizando
una lista para almacenar numeros Integer. En particular, implementar los siguientes
metodos:
Dos constructores, uno por defecto que cree la tabla con capacidad para 10 nu-
meros, y otro al que se le paso como argumento el tamano inicial de la tabla.
Obtener el numero de elementos insertados en el conjunto.
Insertar un numero en el conjunto. Si ya estaba, no se inserta.
Añadir al conjunto los elementos de otro que se pica como parametro.
Eliminar un elemento que se pica como parametro. Si no estaba, no se hace nada.
Eliminar del conjunto los elementos de otro que se pica como parametro.
Decir si un elemento que se le paso como parametro pertenece o no al conjunto.
Representar el conjunto con una cadena de caracteres.

Actividad 4. - Añadir a la clase Conjunto los siguientes métodos estáticos:

static boolean incluido(Conjunto c1, Conjunto c2), que devuelve true si c1 
está incluido en c2, es decir, si todos los elementos de c1 están también en c2.

static Conjunto union(Conjunto C1, Conjunto c2), que vuelve un nuevo con-
junto con todos los elementos que están en C1 o en C2 (elementos communes y no
comunes).

static intersection (Conjunto C1, Conjunto c2), que vuelve un nuevo con-
junto con todos los elementos que están en C1 y en C2 a la vez (elements com-
nes).

static diferencia (Conjunto C1, Conjunto c2), que vuelve un nuevo conjunto
con todos los elementos que están en c1, pero no nc 2.
*/

public class Conjunto {

	//atributos
	Integer tabla[];
	
	//constructor
	Conjunto (){
		tabla = new Integer [10];
	}
	
	Conjunto (int num){
		tabla = new Integer [num];
	}
	
	//metodos
	int getNumElem(){
		int posicion=0;
		for (int i=0; i<tabla.length;i++){
			if (tabla[i]!=null){
				posicion++;
			}
		}
		return posicion;
		
	}
	
	boolean iguales(Integer elem){
		boolean igual=false;
		for (int i=0; i<tabla.length && igual==false;i++){
			if (tabla[i]==elem){
				igual=true;
			}
		}
		return igual;
	}
	
	void insertar (Integer elem){
		if (iguales(elem)==false){
			if (tabla[tabla.length-1]!=null){
				tabla = Arrays.copyOf(tabla, tabla.length+1);
			}
			tabla[tabla.length]=elem;
		}
	}
	
	void anadirConjunto (Conjunto conjunto){
		this.tabla= Arrays.copyOf(this.tabla,this.tabla.length+conjunto.tabla.length);//cambio el tamaño de la tabla sumando los tamaños de ambas
			for (int i=getNumElem()-1;i<this.tabla.length-1;i++){//recorro desde la longitud de la primera tabla, que ya esta llena, usando getNumElem hasta el final de la tabla ya ampliada
				for (int j=0;j<conjunto.tabla.length-1;i++){//recorro desde la primera tabla ya metida en la tabla sumada al final, que coincidira con el tamaño de la segunda tabla
					this.tabla[i]=conjunto.tabla[j];
				}
			}
	}
	
	void eliminarElemento (Integer elemento){
		boolean encontrado=false;
		for (int i=0;i<tabla.length-1 && encontrado==false;i++){//recorro la tabla para buscar coincidencias
			if (tabla[i]==elemento){
				for (int j=i;j<tabla.length-1;j++){//si encuentra una sigue recorriendo desde ella pisando el elemento a la izquierda
					tabla[j]=tabla[j+1];
				}
			encontrado=true;//devuelve boolean para parar la busqueda
			}
		}
		this.tabla=Arrays.copyOf(this.tabla,tabla.length-1);//acorto la tabla
	}
	
	void eliminarConjunto (Conjunto conjunto){
		for (int i=0;i<this.tabla.length-1;i++){//recorro la tabla para buscar coincidencias
			for (int j=0;j<conjunto.tabla.length-1;j++){//recorro la segunda tabla para comparar posicion por posicion
			if (this.tabla[i]==conjunto.tabla[j]){
				for (int k=i;k<tabla.length-1;k++){//si encuentra coincidencia sigue recorriendo desde ella pisando el elemento a la izquierda
					tabla[k]=tabla[k+1];
				}
			}
			}
		this.tabla=Arrays.copyOf(this.tabla,tabla.length-1);//acorto la tabla
		}
	}
	
	@Override
	public String toString(){
		return Arrays.deepToString(this.tabla);
	}
	
	static boolean incluido(Conjunto c1, Conjunto c2){
		int todos=0;
		for (int i=0; i<c1.tabla.length-1; i++){
			for (int j=0; j<c2.tabla.length-1; j++){
				if (c1.tabla[i]==c2.tabla[j]){
					todos++;
				}
			}
			
		}
		return (todos==c1.tabla.length);
	}
	
	static Conjunto union(Conjunto c1, Conjunto c2){
		Conjunto unida = new Conjunto();
		for (int i=0;i<c1.tabla.length-1;i++){
			if (unida[i])
		}
	}
}