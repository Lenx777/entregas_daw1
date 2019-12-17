package Ferroviaria;

public class Tren {
	//atributo
	private Locomotora locomotora;
	private Vagon[] vagones;
	private Maquinista maquinista;
	final int maxVagon = 5;
	//Constructor
	Tren(Locomotora locomotora, Maquinista maquinista){
		this.locomotora=locomotora;
		this.maquinista= maquinista;

	}
	//gettins and setters
	public Locomotora getLocomotora() {
		return locomotora;
	}
	public void setLocomotora(Locomotora locomotora) {
		this.locomotora = locomotora;
	}
	
	public Maquinista getMaquinista() {
		return maquinista;
	}
	public void setMaquinista(Maquinista maquinista) {
		this.maquinista = maquinista;
	}
	//metodos
	public void añadirVagon(int capMax,int capActual, Carga tipoCarga) {
		for (int i = 0; i < maxVagon; i++) {
			if (vagones[i] == null) {
				vagones[i] = new Vagon(capMax, capActual, tipoCarga);
				break;
			}
		}

	}
	public void mostrarInformacionTren() {
		System.out.println("Esta es la informacion de la locomotora");
		locomotora.mostrarInformacionLocomotora();
		System.out.println("Esta es la informacion del maquinista");
		maquinista.mostrarInformacionMaquinista();
	}
	
	
}
