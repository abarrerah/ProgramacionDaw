Proceso sd
	Definir sec, n1 como entero;
	Definir enc Como logico;
	definir cont como entero;
	sec<- Azar(100)+1;
	enc<-Falso;
	cont<-0;
	Mientras cont<7 y NO(enc) Hacer
		Escribir "Introduzca";
		leer n1;
		Si n1=sec Entonces
			Escribir "correcto";
		SiNo
			Si n1<sec Entonces
				Escribir "El numero es menor";
			SiNo
				Escribir "El numero es mayor";
			Fin Si
		Fin Si
		cont<-cont+1
		Escribir "le queda " 7-cont " intentos";
	Fin Mientras

FinProceso
