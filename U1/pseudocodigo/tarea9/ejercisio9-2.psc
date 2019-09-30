Proceso datos5
	definir datos,i,suma Como Entero
	suma =0
	Escribir "dame cinco numeros"
	Dimension datos[5]
	para i=0 hasta 4 hacer
		Leer datos[i]
	finpara 
	
	para i=0 hasta 4 hacer
		suma = datos[i] + suma
	FinPara
	Escribir "la media es" suma/5
	
FinProceso
