	SubProceso EscribirCentrado ( mensaje )
	Definir tam, contador Como Entero;
	tam= longitud (mensaje)
	
	Para contador<-1 hasta (longitud-tam/2) Con paso 1 Hacer
		EScribir Sin Saltar "*";

	Fin Para
	Escribir mensaje;
Fin SubProceso


Proceso centrar
	EscribirCentrado("Hola");
	EscribirCentrado("Buenos Días");
	
	
FinProceso
