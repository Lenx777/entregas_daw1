
Proceso Ejercicio7_1
	Definir usuario Como Entero
	Definir password Como Entero
	Escribir Sin Saltar 'Usuario:'
	Leer usuario
	Escribir Sin Saltar 'Contrase�a:'
	Leer password
	
	Repetir
		Escribir 'Acceso denegado. Usuario y/o contrase�a incorrectos.'
		Escribir Sin Saltar 'Usuario:'
		Leer usuario
		Escribir Sin Saltar 'Contrase�a:'
		Leer password
	Hasta Que usuario=1 y password=1234
FinProceso
