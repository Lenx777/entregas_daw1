//Escribe un programa que cambie un dígito dentro de un número dando la posición y el valor nuevo.
//Las posiciones se cuentan de izquierda a derecha empezando por el 1.
//
//Ejemplo:
//	
//Por favor, introduzca un número entero positivo: 123456
//Introduzca la posición dentro del número: 5
//Introduzca el nuevo dígito: 7
//El número resultante es 123476
//	
//NOTA: Una pista, utilizar las funciones para texto que nos proporciona pseint
Algoritmo EJ2
	Definir num Como Real
	Definir posicion, nuevoDigito Como Entero
	

	Dimension Datos[6]
	para i=0 hasta 5 hacer
		Escribir 'Dígame un número positivo:'
		Leer i
	finpara 
	
	Dimension longitudNum[longitud(ConvertirATexto(num))]
	
	Para posicion<-1 hasta Longitud(convertirAtexto(num))
		Escribir 'Introdúzcame la posición dentro del número:'
		Leer posicion
	FinPara
	
FinAlgoritmo
