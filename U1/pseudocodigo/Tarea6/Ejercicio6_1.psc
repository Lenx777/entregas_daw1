
Proceso Ejercicio6_1
	Definir password Como Entero
	Escribir 'Escriba la contraseña:'
	Leer password
	Mientras password<>1234 Hacer
		Escribir 'CONTRASEÑA INCORRECTA. INTÉNTELO DE NUEVO.'
		Leer password
	FinMientras
	Si password=1234 Entonces
		Escribir 'CONTRASEÑA CORRECTA. HA INICIADO SESIÓN.'
	FinSi
FinProceso
