Algoritmo Clasificar_cliente
	
	LEER edad 
	
	SI edad < 18 ENTONCES 
		
		IMPRIMIR "Cliente Joven" 
		
	SINO 
		
		SI edad <= 64 ENTONCES 
			
			IMPRIMIR "Cliente Adulto" 
			
		SINO 
			
			IMPRIMIR "Cliente de la Tercera Edad" 
			
		FIN SI 
		
	FIN SI 

FinAlgoritmo
