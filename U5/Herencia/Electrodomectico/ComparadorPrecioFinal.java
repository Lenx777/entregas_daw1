package Electrodomectico;

public class ComparadorPrecioFinal implements  Comparable<Lavadora> {
	public int compare (Lavadora lav, Lavadora lava){
		return (lav.getPrecioFinal()-lava.getPrecioFinal());
	}

	@Override
	public int compareTo(Lavadora arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}
