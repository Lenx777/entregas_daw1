Proceso ej13
	Definir x como entero
	Escribir " dame un numero"
	leer x
	escribir EsPar(x)
FinProceso
SubProceso resultado <- Espar(x)
	Definir resultado como logico
	
	si x%2=0
		resultado <- verdadero
	SiNo
		resultado <- Falso
	FinSi
FinSubProceso
//Crea una funci�n EsPar que devuelva el valor l�gico 
//"verdadero" o "falso" seg�n si el n�mero que se indique como par�metro es par o no lo es.
