package ampliacion;

public class Lista {
	
	//atributos
	Integer [] tabla;
	
	//constructor
	Lista (int numElem){
		tabla=new Integer[numElem];
	}
	
	Lista (){
		tabla=new Integer[10];
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
}
