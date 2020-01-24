SubProceso resultado <- EsMayor ( n1,n2 )
	definir resultado Como logico;
	Si n1>n2 Entonces
		resultado<-verdadero;
	SiNo
		resultado<-falso;
	Fin Si
Fin SubProceso

Proceso sin_titulo
	definir n1,n2 Como Entero;
	Escribir "Introduce n1 y n2";
	leer n1,n2;
	Si EsMayor(n1,n2) Entonces
		Escribir "El primero es mayor";
	SiNo
		Escribir "El segundo es mayor";
	Fin Si
FinProceso
