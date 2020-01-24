Proceso sin_titulo
	Definir n1,n2 como entero;
	definir cont como entero;
	Definir nueva como entero;
	n2<-0
	Escribir "Introduce un numero hacerle raíz cuadrada";
	leer n1;
	Mientras n1<>0 hacer
		nueva<-Raiz(n1);
		Escribir nueva;
		Si nueva<0 Entonces
			Escribir "Es negativo!";
		SiNo
			Si nueva=0 Entonces
				Escribir "El numero es cero";
			Fin Si
		Fin Si
		
	Fin Mientras

FinProceso
