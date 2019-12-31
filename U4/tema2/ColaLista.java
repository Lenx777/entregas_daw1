package ampliacion;

import java.util.Arrays;

public class ColaLista extends Lista implements Cola {

	//atributos
		Lista lista;
		
		//constructor
		ColaLista (){
			lista = new Lista();
		}
		
		ColaLista(int num){
			lista = new Lista(num);
		}
		
		//metodos
		void encolar(Integer num){
			if (lista.tabla[lista.tabla.length-1]!=null){
				lista.tabla = Arrays.copyOf(lista.tabla,lista.tabla.length+1);
			}
			for (int i=lista.tabla.length-2; i>1; i--){
				lista.tabla[i+1]=lista.tabla[i];
			}
			lista.tabla[0]=num;
		}
		
		void desencolar(Integer num){
			for (int i=1; i<lista.tabla.length-2; i++){
				lista.tabla[i-1]=lista.tabla[i];
			}
			lista.tabla = Arrays.copyOf(lista.tabla,lista.tabla.length-1);
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
			System.out.println(Arrays.deepToString(lista.tabla));
			System.out.println("Cuyas posiciones encoladas son:");
			for (i=lista.tabla.length-11;i<lista.tabla.length-1;i++){
				System.out.println(lista.tabla[i]);
			}
			for (i=0;i<10;i++){
				for (int j=lista.tabla.length-11;j<lista.tabla.length-1;j++){
				desencolar(lista.tabla[j]);
				}
			}
		}
		
}
