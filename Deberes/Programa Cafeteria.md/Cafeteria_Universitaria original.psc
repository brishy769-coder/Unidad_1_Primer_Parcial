Algoritmo Cafeteria_Universitaria
	Definir nombre, universidad Como Cadena
	Definir edad, cantidad Como Entero
	Definir precio, dinero, subtotal, descuento, total, cambio Como Real
	Definir producto Como Cadena
	Escribir 'Ingrese su nombre:'
	Leer nombre
	Escribir 'Ingrese su edad:'
	Leer edad
	Escribir 'Ingrese su universidad:'
	Leer univerisdad 
	Escribir 'Ingrese el producto:'
	Leer producto
	Escribir 'Ingrese el precio unitario:'
	Leer precio
	Escribir 'Ingrese la cantidad de unidades:'
	Leer cantidad
	Escribir 'Ingrese el dinero entregado:'
	Leer dinero
	subtotal <- precio*cantidad
	descuento <- subtotal*0.10
	total <- subtotal-descuento
	Escribir 'Bienvenido/a ', nombre, ' Edad: ', edad, ' Universidad: ', universidad
	Escribir 'Producto: ', producto
	Escribir 'Subtotal: ', subtotal
	Escribir 'Descuento (10%): ', descuento
	Escribir 'Total a pagar: ', total
	Si dinero>=total Entonces
		cambio <- dinero-total
		Escribir 'Dinero entregado: ', dinero
		Escribir 'Cambio: ', cambio
	SiNo
		Escribir 'Dinero insuficiente para cubrir el pago.'
	FinSi
FinAlgoritmo
