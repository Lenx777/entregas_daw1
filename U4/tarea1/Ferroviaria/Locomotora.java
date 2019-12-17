package Ferroviaria;

public class Locomotora {
	//atributos
	private int matricula;
	private int potencia;
	private int anios;
	private Mecanicos mecanico;
	//cponstructor
	Locomotora(int matricula, int anios, int potencia,Mecanicos mecanico){
		this.anios=anios;
		this.matricula=matricula;
		this.potencia=potencia;
		this.mecanico=mecanico;
	}
	//gettters and setters
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public int getAnios() {
		return anios;
	}
	public void setAnios(int anios) {
		this.anios = anios;
	}
	public Mecanicos getMecanico() {
		return mecanico;
	}
	public void setMecanico(Mecanicos mecanico) {
		this.mecanico = mecanico;
	}
	//metodos
	public void mostrarInformacionLocomotora() {
		System.out.println("La matricula es: "+this.matricula+" con potencia: "+this.potencia);
		System.out.println("Con el año de fabricacion: "+this.anios);
		mecanico.mostrarInformacionMecanico();
	}
	
}
