Proceso nombre
	Definir i Como entero
	Definir n,alreves como caracter
	Escribir "dame un nombre"
	leer n
	alreves <- ""
	
	para i<-(longitud(n)-1) hasta 0 Con Paso -1
		alreves<- Concatenar(alreves,subcadena(n,i,i))
	FinPara
	Escribir " este es tu nombre al reves "  alreves
FinProceso
