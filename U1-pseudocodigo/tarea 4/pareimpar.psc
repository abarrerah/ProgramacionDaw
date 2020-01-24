Proceso sin_titulo
	Definir par,impar,contador Como Entero;
	par<-0;
	impar<-0;
	Para contador<-0 Hasta 1000 Con Paso 1 Hacer
		Si contador%2=0 Entonces
			par<-par+contador;
		SiNo
			impar<-impar+contador;
		Fin Si
	Fin Para
	Escribir "suma pares ",par;
	Escribir "suma impares ",impar;
FinProceso
