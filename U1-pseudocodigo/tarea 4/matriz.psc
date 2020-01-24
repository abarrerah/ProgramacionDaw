Proceso sin_titulo
	definir ancho,suma como entero;
	definir i,n como entero;
	Escribir "Intruzca los numeros";
	Dimension ancho[4,3];
	ancho[0,0]=1;
	ancho[0,1]=2;
	ancho[0,2]=3;
	ancho[1,0]=4;
	ancho[1,1]=5;
	ancho[1,2]=6;
	ancho[2,0]=7;
	ancho[2,1]=8;
	ancho[2,2]=9;
	ancho[3,0]=10;
	ancho[3,1]=11;
	ancho[3,2]=12;
	Para i<-1 Hasta 4 Hacer
		suma<-0;
		 Para n<-1 Hasta 4  Hacer
			 suma <-suma+ancho(i,n);
		 Fin Para
		Escribir suma;
	Fin Para
	
	
FinProceso
