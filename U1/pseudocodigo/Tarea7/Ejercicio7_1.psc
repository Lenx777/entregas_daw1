
Proceso Ejercicio7_1
	Definir usuario Como Entero
	Definir password Como Entero
	Escribir Sin Saltar 'Usuario:'
	Leer usuario
	Escribir Sin Saltar 'Contraseņa:'
	Leer password
	
	Repetir
		Escribir 'Acceso denegado. Usuario y/o contraseņa incorrectos.'
		Escribir Sin Saltar 'Usuario:'
		Leer usuario
		Escribir Sin Saltar 'Contraseņa:'
		Leer password
	Hasta Que usuario=1 y password=1234
FinProceso
