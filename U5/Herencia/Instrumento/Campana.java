package Instrumento;

public class Campana extends Instrumento {
	@Override
	void interpretar(){
		for (int i=0;i<100;i++){
			if(super.musica[i]!=null){
				System.out.println(super.musica[i]+" tolon");
			}
		}
	}
}
