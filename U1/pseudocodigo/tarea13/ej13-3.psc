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
//Crea una función EsPar que devuelva el valor lógico 
//"verdadero" o "falso" según si el número que se indique como parámetro es par o no lo es.
