Proceso sin_titulo
	definir num,posicion,nuevo_num,contador como entero;
	definir num_texto como caracter;
	Escribir "Introduzca una serie de numeros";
	leer num;
	Escribir "Introduzca la posición a modificar";
	leer posicion;
	Escribir "Introduzca el numero que quieras introducir";
	leer nuevo_num;
	num_texto<-convertiratexto(num);	
	Para contador<-0 Hasta Longitud(num_texto) Hacer
		Si contador=posicion-1 Entonces
			Escribir sin saltar nuevo_num;
		SiNo
			Escribir sin saltar subcadena(num_texto,contador,contador);
		Fin Si
	Fin Para
	
FinProceso