package Instrumento;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Campana c=new Campana();
		c.add(Notas.Do);
		c.add(Notas.Re);
		c.add(Notas.Fa);
		c.add(Notas.Do);
		c.interpretar();
		Piano p= new Piano();
		p.add(Notas.Do);
		p.add(Notas.Sol);
		p.add(Notas.La);
		p.add(Notas.Do);
		p.interpretar();
		
	}

}
