Algoritmo Cafeteria_Universitaria

	LEER nombre, edad, producto, precio, cantidad, dinero_entregado
	subtotal <- precio * cantidad
	descuento <- subtotal * 0.10
	total <- subtotal - descuento
	SI dinero_entregado >= total ENTONCES
		cambio <- dinero_entregado - total
		IMPRIMIR "Nombre: ", nombre
		IMPRIMIR "Edad: ", edad
		IMPRIMIR "Compra exitosa"
		IMPRIMIR "Subtotal: ", subtotal
		IMPRIMIR "Total con descuento: ", total
		IMPRIMIR "Cambio: ", cambio
	SINO
		IMPRIMIR "Nombre: ", nombre
		IMPRIMIR "Edad: ", edad
		IMPRIMIR "Dinero insuficiente"
	FIN SI


FinAlgoritmo
