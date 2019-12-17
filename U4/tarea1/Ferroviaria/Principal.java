package Ferroviaria;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maquinista maqui = new Maquinista("Roberto","256813",1000,"Principiante");
		Mecanicos  meca = new Mecanicos("Puyana",6935459,Especialidad.motor);
		JefeEstacion jefe= new JefeEstacion("Gato isidoro","2165928");
		Locomotora loco = new Locomotora(1484654,1000,1998,meca);
		Tren tren1 = new Tren(loco,maqui);
		tren1.añadirVagon(100,50,Carga.balas);
		tren1.añadirVagon(100,50,Carga.camas);
		tren1.añadirVagon(100,50,Carga.armas);
		tren1.añadirVagon(100,50,Carga.ordenadores);
		tren1.añadirVagon(100,50,Carga.balas);
		maqui.mostrarInformacionMaquinista();
		loco.mostrarInformacionLocomotora();
		tren1.mostrarInformacionTren();
		System.out.println(tren1);
		
	}

}
