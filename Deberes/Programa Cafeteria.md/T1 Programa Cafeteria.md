TAREA PRÁCTICA

Objetivo:
Desarrollar en Java y C++ un programa que simule el proceso de compra en una cafetería universitaria.
Enunciados:
Una estudiante compra varias unidades de un producto. El programa solicita sus datos, calcula el subtotal, aplica un descuento didáctico del 10%, obtiene el total, el
cambio y comprueba si el dinero entregado cubre el pago.


Requerimientos:

Solicitar al usuario sus datos y el producto a comprar.

Ingresar precio y cantidad para calcular el subtotal.

Aplicar el descuento correspondiente.

Calcular el total a pagar y el cambio según el dinero entregado.

Mostrar el resultado final con mensaje de confirmación o advertencia.


1.	Análisis.
   
Entradas:
•	Nombre del estudiante
•	Edad del estudiante
•	Universidad del estudiante
•	Producto
•	Precio unitario
•	Cantidad
•	Dinero entregado


Proceso:
1.	Solicitar nombre, edad y universidad del estudiante.
2.	Solicitar producto, precio unitario, cantidad y dinero entregado.
3.	Calcular subtotal = precio × cantidad.
4.	Calcular descuento = 10% del subtotal.
5.	Calcular total = subtotal – descuento.
6.	Verificar si el dinero entregado cubre el total.
o	Si cubre: calcular cambio = dinero – total.
o	Si no cubre: mostrar mensaje de “Dinero insuficiente”.
7.	Mostrar un mensaje de bienvenida con los datos del estudiante y el resultado de la compra.


Salidas:
•	Mensaje de bienvenida con nombre, edad y universidad.
•	Subtotal, descuento y total a pagar.
•	Cambio (si el dinero es suficiente) o mensaje de “Dinero insuficiente”.

2.	Algoritmo.

  
Inicio
Solicitar nombre del estudiante
Solicitar edad del estudiante
Solicitar la universidad del estudiante
Solicitar producto
Solicitar precio unitario
Solicitar cantidad
Solicitar dinero entregado
Calcular subtotal = precio × cantidad
Calcular descuento = 10% del subtotal
Calcular total = subtotal – descuento
Verificar si el dinero entregado cubre el total
Si cubre, calcular cambio = dinero – total
Mostrar mensaje de bienvenida con nombre, edad, universidad y resultados de la compra
Si no cubre, mostrar mensaje de bienvenida con nombre, edad, universidad y “Dinero insuficiente”
Fin


   3.  Prueba de escritorio.
Caso 1 – Dinero suficiente

| Entrada                                                                 | Proceso                                                                                                      | Salida                                                                                                   |
|-------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------|
| Nombre: Lily<br>Edad: 21<br>Universidad: Uniandes<br>Producto: Leche<br>Precio: 0.92<br>Cantidad: 3<br>Dinero: 5 | Subtotal = 0.92 × 3 = 2.76<br>Descuento = 2.76 × 0.10 = 0.276<br>Total = 2.76 – 0.276 = 2.484<br>Verificar: 5 ≥ 2.484 → Sí<br>Cambio = 5 – 2.484 = 2.516 | Nombre: Lily<br>Edad: 21<br>Universidad: Uniandes<br>Producto: Leche<br>Subtotal: 2.76<br>Descuento: 0.276<br>Total: 2.484<br>Dinero entregado: 5<br>Cambio: 2.516<br>**Compra exitosa** |



Caso 2 – Dinero insuficiente

| Entrada                                                                 | Proceso                                                                                                      | Salida                                                                                                   |
|-------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------|
| Nombre: Luis<br>Edad: 22<br>Universidad: UTA<br>Producto: Sándwich<br>Precio: 4<br>Cantidad: 2<br>Dinero: 5 | Subtotal = 4 × 2 = 8<br>Descuento = 8 × 0.10 = 0.8<br>Total = 8 – 0.8 = 7.2<br>Verificar: 5 ≥ 7.2 → No | Nombre: Luis<br>Edad: 22<br>Universidad: UTA<br>Producto: Sándwich<br>Subtotal: 8<br>Descuento: 0.8<br>Total: 7.2<br>Dinero entregado: 5<br>**Dinero insuficiente** |




