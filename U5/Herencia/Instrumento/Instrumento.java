package Instrumento;

public abstract class Instrumento {

	//atributos
	
	Notas musica [] = new Notas [100];
	
	//constructor
	
	//metodos
	
	public void add(Notas nota){
		for (int i=0;i<100;i++){
			if (musica[i]==null){
				musica[i]=nota;
			}else{
				System.out.println("No puede añadir mas de 100 notas.");
			}
		}
	}
	abstract void interpretar();
}
