Proceso sin_titulo
	Definir a,b,contador,potencia Como Entero;
	Escribir "Introduzca dos valores";
	Leer a,b;
	potencia<-1;
	Para contador<-1 Hasta b Con Paso 1 Hacer
		potencia<-potencia*a;
		Escribir "el primer valor elevado al segundo",potencia;
	Fin Para
	potencia<-1;
	Para contador<-b Hasta a Con Paso 1 Hacer
		potencia<-potencia*b;
		Escribir "el segundo valor elevado al primero",potencia;
	Fin Para
FinProceso
