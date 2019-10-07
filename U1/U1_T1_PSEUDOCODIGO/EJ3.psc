<<<<<<< HEAD
//Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos.
//El programa debe pedir la altura.
//Se debe comprobar que la altura sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de error.
//
//Ejemplo:
//Por favor, introduzca la altura del reloj de arena: 7 
//*******
// *****
//	***
//	
//	 *
//	
//	***
//	
// *****
//	
//*******
=======
//Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos.
//El programa debe pedir la altura.
//Se debe comprobar que la altura sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de error.
//
//Ejemplo:
//Por favor, introduzca la altura del reloj de arena: 7 
//*******
// *****
//	***
//	
//	 *
//	
//	***
//	
// *****
//	
//*******
>>>>>>> 49652907993483825fbfd1039a3c990e00c447c8
Algoritmo EJ3
	
	Escribir "Introduce una altura"
	Leer altura
	Si altura>=3 o altura%2=0 Entonces
		Para filas<-(altura-1) Hasta 1 Con Paso -2 Hacer
			Para columna<-(altura-1)-filas Hasta 0 Con paso -1 Hacer
				Escribir Sin Saltar " "
			FinPara
			Para l<-filas Hasta 0 Con Paso -1 Hacer
				Escribir Sin Saltar" *"
			FinPara
			Escribir ""
		FinPara
		Para i<-0 Hasta altura con paso 2 Hacer
			Para aux<-0 Hasta (altura-i) Hacer
				Escribir Sin Saltar " "
			FinPara
			Para j<-0 Hasta i Con Paso 1 Hacer
				Escribir Sin Saltar "* "
			FinPara
			Escribir ""
		FinPara
	SiNo
		Escribir "Error, introduce un número impar mayor o igual a 3"
	FinSi
	
FinAlgoritmo


