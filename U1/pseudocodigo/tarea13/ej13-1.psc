Proceso sin_titulo
	Definir text como caracter
	Escribir " Dime un texto"
	leer text
	EscribirCentrado(text)
FinProceso

SubProceso EscribirCentrado(text)
	Definir x,espacios Como Entero
	espacios <-redon(longitud(text)/2)
	
	para x <-0 Hasta 40-espacios
		Escribir Sin Saltar " " 
	FinPara
	Escribir text
FinSubProceso
//Crea un procedimiento EscribirCentrado, que reciba como parámetro un texto y lo escriba centrado en pantalla
//(suponiendo una anchura de 80 columnas; 
//pista: deberás escribir 40 - longitud/2 espacios antes del texto)fsa