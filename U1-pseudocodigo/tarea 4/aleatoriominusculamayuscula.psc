Proceso sin_titulo
	definir n,cont como entero;
	definir nombre como texto;
	Escribir "Introduce el nombre";
	leer nombre;
	n<-longitud(nombre);
	Para cont<-1 Hasta n Con Paso 1 Hacer
	
		Si cont%2=0  Entonces
			Escribir sin saltar en Minusculas(subcadena(nombre,1,cont));
		Fin Si
	
	Fin Para
	
FinProceso
