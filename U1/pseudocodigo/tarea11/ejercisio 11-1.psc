Proceso alazar
	Definir x,z,n Como Entero
	n <- AZAR[101]
	z=0
	Escribir n
	repetir
		z=z+1
		leer x 
		si z !=7
			si  n= x
				Escribir " Has acertado"
			SiNo
				si x<n 
					Escribir " te has quedado corto, vuelve a intentarlo " 7-z  " intentos "
				SiNo
					Escribir " te has pasado, vuelve a intentarlo " 7-z " intentos "
				FinSi
			FinSi
		FinSi
		
	Hasta Que z =7 o x=n
	si x != n
		Escribir " has fallado, el resultado es " ,n
	FinSi
	
	
FinProceso
