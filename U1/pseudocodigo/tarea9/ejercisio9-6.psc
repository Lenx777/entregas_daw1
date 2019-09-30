Proceso dosbloques
	Definir x,i,j,a,b Como Entero
	Escribir "dame 10 numero"
	Dimension x[10,2]
	para i<-0 hasta 9 hacer
		para j<-0 hasta 1 hacer
			escribir "introduzca numero de la fila " ,i+1, "y la columna " ,j+1
			leer x[i,j]
		FinPara
	FinPara
	a=x[0,0]
	b=x[0,1]
	
	para i =0 hasta 9 hacer
		si x[i,0] >a
			a=x[i,0]
		FinSi
	FinPara
	
	para i=0 hasta 9 Hacer
		si x[i,1]>b
			
			b=x[i,1]
		FinSi
	FinPara
	
	Escribir "mayor numero de la columna 1 es ",a
	Escribir "mayor numero de la columna 2 es ",b
FinProceso 
