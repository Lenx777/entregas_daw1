
Proceso Ejercicio6_1
	Definir password Como Entero
	Escribir 'Escriba la contrase�a:'
	Leer password
	Mientras password<>1234 Hacer
		Escribir 'CONTRASE�A INCORRECTA. INT�NTELO DE NUEVO.'
		Leer password
	FinMientras
	Si password=1234 Entonces
		Escribir 'CONTRASE�A CORRECTA. HA INICIADO SESI�N.'
	FinSi
FinProceso
