Algoritmo Menu_Cafeteria
		
		Definir opcion, cantidad Como Entero 
		
		Definir precio, subtotal, descuento, total Como Real 
		
		Definir producto Como Cadena 
		
		Escribir "===== MENÚ DE PRODUCTOS =====" 
		
		Escribir "1. Café - $2.00" 
		
		Escribir "2. Sándwich - $3.50" 
		
		Escribir "3. Jugo - $1.50" 
		
		Escribir "4. Pastel - $4.00" 
		
		Escribir "==============================" 
		
		Escribir "Seleccione una opción:" 
		
		Leer opcion 
		
		Segun opcion Hacer 
			
			1: producto <- "Café" ; precio <- 2.00 
				
			2: producto <- "Sándwich" ; precio <- 3.50 
				
			3: producto <- "Jugo" ; precio <- 1.50 
				
			4: producto <- "Pastel" ; precio <- 4.00 
				
			De Otro Modo: 
				
				Escribir "Opción inválida" 
				
		FinSegun 
		
		
		
		Escribir "Ingrese la cantidad:" 
		
		Leer cantidad 
		
		
		
		subtotal <- precio * cantidad 
		
		
		
		Si subtotal >= 10 Entonces 
			
			descuento <- subtotal * 0.10 
			
		SiNo 
			
			descuento <- 0 
			
		FinSi 
		
		
		
		total <- subtotal - descuento 
		
		
		
		Escribir "=== RESUMEN DE LA COMPRA ===" 
		
		Escribir "Producto: ", producto 
		
		Escribir "Cantidad: ", cantidad 
		
		Escribir "Precio unitario: $", precio 
		
		Escribir "Subtotal: $", subtotal 
		
		Escribir "Descuento: $", descuento 
		
		Escribir "Total a pagar: $", total 
		
FinAlgoritmo 

 
	