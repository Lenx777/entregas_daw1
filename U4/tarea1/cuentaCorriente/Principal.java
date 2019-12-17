package cuentaCorriente;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ejercicio1
		cuentaCorriente c1 = new cuentaCorriente("Diego","12541255P");
		c1.sacaDinero(20);
		c1.ingresarSaldo(40);
		c1.mostrarInformacion("Diego","216884354A");
		//EJERCIcIO2
		cuentaCorriente c2 =new cuentaCorriente(100);
		cuentaCorriente c3 =new cuentaCorriente(100,50,"2562498E");
		c2.ingresarSaldo(40);
		c3.sacaDinero(40);
		//Ejercio4
		cuentaCorriente.cambiarNombreBanco("Santander");
	}

}
