
Proceso Ejercicio7_2
	Definir num1 Como Entero
	Definir num2 Como Entero
	
	Escribir Sin Saltar'Primer n�mero:'
	Leer num1
	Escribir Sin Saltar'Segundo n�mero:'
	Leer num2
	
	Mientras num1<>0 o num2<>0 Hacer
		Escribir 'Suma = ',num1+num2
		Repetir
			Escribir 'Introduce nuevamente dos n�meros.'
			Leer num1
			Leer num2
		Hasta Que num1=0 y num2=0
	Fin Mientras
FinProceso
