package Electrodomectico;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Electrodomectico e1 = new Electrodomectico();
		Electrodomectico e2 = new Electrodomectico();
		Electrodomectico e3 = new Television();
		Electrodomectico e4 = new Electrodomectico();
		Electrodomectico e5 = new Electrodomectico(20,130);
		Electrodomectico e6 = new Electrodomectico();
		Electrodomectico e7 = new Lavadora();
		Electrodomectico e8 = new Electrodomectico(6, Color.NEGRO, Consumo.F, 200);
		Electrodomectico e9 = new Electrodomectico();
		Electrodomectico e10 = new Electrodomectico();
		Electrodomectico tablae[]={e1,e2,e3,e4,e5,e6,e7,e8,e9,e10};
		
		for (int i=0; i<tablae.length;i++){
			System.out.println(tablae[i].toString());
		}
		
		Lavadora lava1 = new Lavadora();
		Lavadora lava2 = new Lavadora();
		Lavadora lava3 = new Lavadora();
		Lavadora lava4 = new Lavadora();
		Lavadora lava5 = new Lavadora(20);
		Lavadora lava6 = new Lavadora();
		Lavadora lava7 = new Lavadora();
		Lavadora lava8 = new Lavadora(300,50);
		Lavadora lava9 = new Lavadora();
		Lavadora lava10 = new Lavadora();
		Lavadora tablalava[]={lava1,lava2,lava3,lava4,lava5,lava6,lava7,lava8,lava9,lava10};
		
		Arrays.sort(tablalava);
		
		System.out.println(Arrays.deepToString(tablalava));

		
		//Arrays.sort(tablalava, new ComparadorPrecioFinal());
		
		System.out.println(Arrays.deepToString(tablalava));
		
	}
	}


