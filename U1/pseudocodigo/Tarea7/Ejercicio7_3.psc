
	Definir num1 Como Entero
	Definir num2 Como Entero
	
	Escribir 'Primer n�mero:'
	Leer num1
	Escribir 'Segundo n�mero:'
	Leer num2
	
	Si num2=0 entonces
		Escribir 'El segundo n�mero es un cero.'
		Repetir
			Escribir 'Escribe otra vez el segundo n�mero:'
			Leer num2
		Hasta Que num2<>0 
	FinSi
	
	Escribir 'Suma = ',num1+num2
FinProceso
