Proceso frase
	Definir text Como Caracter
	definir numpal,z,u como entero
	Escribir " Dime una frase "
	leer text
	numpal<-1
	z<- Longitud(text)-1
	para u<-0 hasta z
		si subcadena(text,u,u)= " "
			numpal<-numpal+1
		FinSi
	FinPara
	Escribir " hay estas palabras ",numpal
FinProceso
//Crea un programa que pida una frase al usuario y diga cu�ntas palabras contiene 
//(pista: puedes contar los espacios, prestando atenci�n en que no est�n repetidos)
