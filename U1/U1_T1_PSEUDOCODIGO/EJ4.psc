//Escribe un programa que rellene un array de 20 elementos con números enteros aleatorios comprendidos entre 0 y 400 (ambos incluidos).
//A continuación el programa mostrará el array y preguntará si el usuario quiere resaltar los múltiplos de 5 o los múltiplos de 7.
//Seguidamente se volverá a mostrar el array escribiendo los números que se quieren resaltar entre corchetes.
//
//Ejemplo:
//	159 204 20 250 178 90 353 32 229 357 224 54 260 310 140 249 335 326 223 13
//¿Qué números quiere resaltar? (1 – los múltiplos de 5, 2 – los múltiplos de 7): 1
//	159 204 [20] [250] 178 [90] 353 32 229 357 224 54 [260] [310] [140] 249 [335] 326 223 13
Algoritmo EJ4
	Definir array, i, respuesta Como Entero
	
	Dimension array[20]
	
	
	Para i<-1 Hasta 20 Con Paso 1 Hacer
		array[i]<-AZAR(401)
		escribir i,'º número: ', array[i]
		
	FinPara
	
	Escribir Sin Saltar '¿ Di 1 si quieres resaltar los múltiplos de 5 o di 2 si quieres los múltiplos de 7? '
	Leer respuesta //1 (los múltiplos de 5) - 2 (los múltiplos de 7)
	Si respuesta = 1 Entonces
		Para i<-1 hasta 20 con paso 1 hacer
			Si array[i]%5=0 Entonces
				Escribir '[' array[i] ']'
			Finsi
		FinPara
	SiNo
		Si respuesta = 2 Entonces
			Para i<-1 Hasta 20 Con Paso 1 Hacer
				si array[i]%7=0 entonces
					Escribir '[' array[i] ']'
				finsi
			FinPara
		FinSi
	FinSi
FinAlgoritmo

