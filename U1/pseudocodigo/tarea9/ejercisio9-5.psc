Proceso numero7
	Definir x,i,mayo Como Real
	Escribir "dame 7 numeros"
	Dimension x[7]
	para i<-0 hasta 6 hacer
		Leer x[i]
	FinPara
	
	mayo=x[0]
	para i=1 hasta 6 hacer
		si x[i] > mayo Entonces
		  mayo=x[i] 
		FinSi
	FinPara

Escribir " el numero mayor es " mayo
FinProceso
