SubProceso resultado <- EsMultiplo ( n1,n2 )
	definir resultado Como Logico;
	Si n1%n2=0 Entonces
		resultado<- Verdadero;
	SiNo
		resultado<- Falso;
	Fin Si
	Si n2%n1=0 Entonces
		resultado<-Verdadero;
	SiNo
		resultado<-Falso;
	Fin Si
		
Fin SubProceso

Proceso sin_titulo
	Definir n1,n2 como entero;
	Escribir "Introduzca n1 y n2";
	leer n1,n2;
	Si EsMultiplo(n1,n2) Entonces
		Escribir "Es multiplo";
	SiNo
		Escribir "No es multiplo";
	Fin Si
	Si EsMultiplo(n2,n1) Entonces
		Escribir "Es multiplo";
	SiNo
		Escribir "No es multiplo";
	Fin Si

	
FinProceso
