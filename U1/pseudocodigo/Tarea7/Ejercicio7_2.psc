
Proceso Ejercicio7_2
	Definir num1 Como Entero
	Definir num2 Como Entero
	
	Escribir Sin Saltar'Primer número:'
	Leer num1
	Escribir Sin Saltar'Segundo número:'
	Leer num2
	
	Mientras num1<>0 o num2<>0 Hacer
		Escribir 'Suma = ',num1+num2
		Repetir
			Escribir 'Introduce nuevamente dos números.'
			Leer num1
			Leer num2
		Hasta Que num1=0 y num2=0
	Fin Mientras
FinProceso
