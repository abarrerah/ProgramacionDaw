Proceso sin_titulo
	Definir usuario Como Entero;
	Escribir "Introduzca un numero para especificar si es positivo, negativo o cero";
	Leer usuario;
	Si usuario>0 Entonces
		Escribir "Su numero es positivo";
	SiNo
		Si usuario=0 Entonces
			Escribir "Su numero es cero";
		SiNo
			Escribir "su numero es negativo";
		Fin Si
	Fin Si
FinProceso
