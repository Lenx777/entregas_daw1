package cuentaCorriente;

public class cuentaCorriente {
	//ejercicio3
	protected String dni;
	public String nombre;
	private int saldo;
	private int limiteDescubierto;
	//Ejerciio4
	static String nombreBanco;
	//constructor
	cuentaCorriente(String nombre, String dni){
		this.nombre= nombre;
		this.dni=dni;
		saldo=0;
		limiteDescubierto=-50;
	}
	//Ejerccio2
	cuentaCorriente(int saldo){
		this.saldo=saldo;
		limiteDescubierto=0;
	}
	cuentaCorriente(int saldo,int limitedescubierto, String dni){
		this.saldo=saldo;
		this.limiteDescubierto=limitedescubierto;
		this.dni=dni;
	}
	
	public void sacaDinero (int retirar) {
		if(this.saldo-retirar<limiteDescubierto){
			System.out.println("Haz sacado dinero");
			this.saldo -= retirar;
		}else {
			System.out.println("Error no  se apodido sacar dinero");
		}
	}
		public int ingresarSaldo (int ingreso) {
			int nuevoSaldo;
			nuevoSaldo=this.saldo + ingreso;
			return nuevoSaldo;
		}
		public void mostrarInformacion(String nombre,String dni) {
			System.out.println("Esta cuenta pertenece a "+this.nombre+" con el dni: "+this.dni);
			System.out.println("Su saldo es de: "+saldo);
			System.out.println("Su limite es de: "+limiteDescubierto);
		}
		//Ejercicio4
		public static String cambiarNombreBanco(String nuevoBanco) {
			nombreBanco=nuevoBanco;
			return "Este es el nuevo nombre del banco "+nuevoBanco;	
		}
		//Ejercio banco
		static void setNombreBanco(String nombreBanco) {
			cuentaCorriente.nombreBanco=nombreBanco;
		}
	
}
