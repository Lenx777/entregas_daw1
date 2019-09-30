Proceso ampliaciondelej2
	definir datos,i,suma Como Entero
	definir media como real
	suma =0
	Escribir "dame cinco numeros"
	Dimension datos[5]
	para i=0 hasta 4 hacer
		Leer datos[i]
	finpara 
	para i=0 hasta 4 hacer
		suma = datos[i] + suma
	FinPara
	
	media=suma/5
	Escribir "la media es" 
	para i=0 hasta 4 Hacer
		si datos[i] > media Entonces
			Escribir  " el numero " ,datos[i], " es mayor que la media"
		FinSi
	FinPara
FinProceso
