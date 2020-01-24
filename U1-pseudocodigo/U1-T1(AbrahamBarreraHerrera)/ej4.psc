Proceso sin_titulo
	Definir i,arran,n como entero
	Escribir "Introduce el valor para sacar los multiplos";
	Leer i;
	Dimensión arran[20];
	arran[0]=Azar(401);
	arran[1]=Azar(401);
	arran[2]=Azar(401);
	arran[3]=Azar(401);
	arran[4]=Azar(401);
	arran[5]=Azar(401);
	arran[6]=Azar(401);
	arran[7]=Azar(401);
	arran[8]=Azar(401);
	arran[9]=Azar(401);
	arran[10]=Azar(401);
	arran[11]=Azar(401);
	arran[12]=Azar(401);
	arran[13]=Azar(401);
	arran[14]=Azar(401);
	arran[15]=Azar(401);
	arran[16]=Azar(401);
	arran[17]=Azar(401);
	arran[18]=Azar(401);
	arran[19]=Azar(401);
	
	Para n<-1 Hasta 19 Hacer
		Si arran[n]%i=0 Entonces
			Escribir "El numero es " arran[n];
		Fin Si
		
	Fin Para
FinProceso
