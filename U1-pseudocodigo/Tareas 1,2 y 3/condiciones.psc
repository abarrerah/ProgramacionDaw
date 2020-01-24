Algoritmo p2
	Definir edad Como Entero;
	Escribir "introduzca su edad";
	Leer edad;
	Si edad<12 Entonces
		Escribir "Eres un niño";
	SiNo
		Si edad>12 y edad<=30 Entonces
			Escribir "Eres un adolescente";
		SiNo
			Si edad>30 y edad<=50 Entonces
				Escribir "eres un adulto";
			SiNo
				Escribir "eres un viejo";
			Fin Si
		Fin Si
	Fin Si
FinProceso
