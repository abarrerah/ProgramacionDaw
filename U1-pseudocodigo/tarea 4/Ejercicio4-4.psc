Proceso sin_titulo
	Definir uno,dos Como Entero;
	Escribir "Introduzca dos valores para saber si ambos son positivos";
	leer uno, dos;
	Si uno>=0 y dos >=0 Entonces
		Escribir "Ambos son positivos;"
	SiNo
		Si uno<0 y dos>=0 Entonces
			Escribir "uno de los dos valores es positivo";	
		SiNo
			Si uno>=0 y dos<0 Entonces
				Escribir "uno de los valores es positivo";
			SiNo
				Escribir "ninguno es positivo";
			Fin Si
		Fin Si
	Fin Si
FinProceso
