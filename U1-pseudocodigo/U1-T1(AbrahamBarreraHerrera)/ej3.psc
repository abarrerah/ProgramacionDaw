Proceso sin_titulo
		definir alt,filas,columnas Como Entero;
		escribir "dime el tamaño del reloj de arena";
		leer alt
		Para filas<-alt/2 hasta 1 con paso -1 Hacer
			escribir sin saltar "*";
		Fin Para
		escribir "";
		para filas<-1 Hasta alt/2 con paso 1 Hacer
			Para columnas<-1 Hasta filas Con Paso 1 Hacer
				escribir sin saltar "*";
			Fin Para
			escribir"";
		FinPara
		FinProceso 