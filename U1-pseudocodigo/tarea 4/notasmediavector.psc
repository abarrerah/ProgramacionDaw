Proceso sin_titulo
	definir media,mayor,menor como Entero;
	Definir i Como Entero;
	Definir notas Como Entero;
	Dimension notas[10];
	media<-0
	notas[0]<-5;
	notas[1]<-8;
	notas[2]<-7;
	notas[3]<-9;
	notas[4]<-10;
	notas[5]<-6;
	notas[6]<-7;
	notas[7]<-8;
	notas[8]<-8;
	notas[9]<-9;
	Para i<-0 Hasta 9  Hacer
		media<-media+notas[i];
	Fin Para
	Escribir media/10;
	mayor<-notas[0];
	menor<-notas[0];
	Para i<-1 Hasta 9  Hacer
		Si notas[i]>mayor Entonces
			mayor<-notas[i];
		Fin Si
		Si notas[i]<menor Entonces
			menor<-notas[i];
		Fin Si
	FinPara
	Escribir mayor;	
	Escribir menor;
FinProceso

