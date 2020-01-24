Proceso sin_titulo
	Definir i,n,suma como entero;
	Escribir "introduzca el numero de horas trabajas esta semana"
	leer i;
	n<-0;
	suma<-0
	Para n<-1 Hasta i Hacer
		suma<-suma+10;
		i<-n+1;
	Escribir suma;
	Si suma>410 Entonces
			suma<-suma+15;
	Fin Si
		Escribir suma;
	FinPara
	
FinProceso
