Proceso  ej12
	definir n,text como caracter
	definir x como entero
	Escribir "dame un nombre"
	leer text
	n<-""
	x=0
	para x<-0 hasta longitud(text)-1
		si x%2 =0
			n<-Concatenar(n, Mayusculas(Subcadena(text,x,x)))
		SiNo
			n<-Concatenar(n, Minusculas(Subcadena(text,x,x)))
		FinSi
	FinPara
	Escribir "tu nombre en mayusculas y minusculas es " n
FinProceso
//Crea un programa que pida su nombre al usuario y lo escriba alternando 
//letras mayúsculas y minúsculas (por ejemplo, "nAcho" se mostraría como "NaChO".