
Proceso Ejercicio6_3
	Definir num1 Como Entero
	Definir num2 Como Entero
	num1 <- azar(101)
	num2 <- azar(101)
	Definir sumaUsuario Como Entero
	
	Escribir 'Número 1: ',num1
	Escribir 'Número 2: ',num2	
	
	Escribir '¿Cuál es la suma de ambos números?'
	Leer sumaUsuario
	Mientras sumaUsuario != num1+num2 Hacer
		Escribir 'NO ES CORRECTA LA SUMA.'
		Leer sumaUsuario
	FinMientras
	
	Si sumaUsuario = num1+num2 Entonces
		Escribir num1,' + ',num2,' = ',sumaUsuario
	FinSi
FinProceso
