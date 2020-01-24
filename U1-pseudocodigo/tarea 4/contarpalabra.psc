Proceso sin_titulo
	Escribir "Introduce un texto";
	definir text,anterior como caracter;
	definir i, contpal como entero;
	leer text;
	anterior= " ";
	contpal=0;
	Para i<-1 Hasta longitud(text)  Hacer
		Si Subcadena(text,i,i)<>" " y anterior=" " Entonces
			contpal<-contpal+1;
		Fin Si
		anterior=Subcadena(text,i,i)
	Fin Para
	Escribir "numero de palabras ", contpal;
FinProceso
