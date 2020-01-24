SubProceso resultado <- EsEntero (n)
	definir resultado como logico;
	Si n>0 Entonces
		resultado<-verdadero;
	SiNo
		resultado <- Falso;
	Fin Si
Fin SubProceso

Proceso sin_titulo
	definir n,n2, nument,i como entero;
	Escribir "Introce dos parámetros";
	leer n,n2;
	dimension nument[n2]
	nument[n2]<-azar(n2);
	
	Para i<-0 Hasta n2 Con Paso 1 Hacer
		Escribir nument[n2];
		i<-i+1;
	Fin Para
FinProceso
