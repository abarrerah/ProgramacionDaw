Proceso sin_titulo
	Definir a,b,elevara,elevarb como entero;
	Escribir "introduzca dos valores";
	leer a,b;
	Para elevara<-a Hasta a^b Con Paso 1 Hacer
		elevara <- a^b;
		Escribir "", elevara;
		Para elevarb<-b Hasta b^a Con Paso 1 Hacer
			elevarb<-b^a;
			Escribir "",elevarb;
		Fin Para
	Fin Para
FinProceso
