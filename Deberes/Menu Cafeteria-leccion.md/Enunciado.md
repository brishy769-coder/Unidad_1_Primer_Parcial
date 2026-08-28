1. Enunciado. 

El programa muestra un menú en forma de texto, permite seleccionar un producto, ingresar la cantidad y calcular el total. Si la compra es de al menos USD 10, aplica un descuento del 10 %. 

 

2. Análisis. 

Entradas: 

Opción de producto (int). 

Cantidad de unidades (int). 

Proceso: 

Mostrar menú de productos con sus precios. 

Leer la opción seleccionada. 

Asignar el precio según el producto elegido. 

Leer la cantidad de unidades. 

Calcular subtotal = precio × cantidad. 

Si subtotal ≥ 10 → aplicar descuento del 10 %. 

Calcular total = subtotal – descuento. 

Mostrar resultados. 

Salidas: 

Producto seleccionado. 

Cantidad. 

Precio unitario. 

Subtotal. 

Descuento aplicado (si corresponde). 

Total a pagar. 

 

3. Algoritmo. 

 

Inicio 

Mostrar menú de productos con precios. 

Leer opción seleccionada. 

Asignar precio según opción. 

Leer cantidad. 

Calcular subtotal = precio × cantidad. 

Si subtotal ≥ 10 entonces:    

a. descuento = subtotal × 0.10   

b. total = subtotal – descuento   

c. Mostrar subtotal, descuento y total 

Si no:    

a. total = subtotal    

b. Mostrar subtotal y total 

Fin 

  4. Prueba de escritorio
     
| Opción | Producto   | Precio | Cantidad | Subtotal | Descuento | Total  | Resultado      |
|--------|------------|--------|----------|----------|-----------|--------|----------------|
| 1      | Café       | 2.00   | 3        | 6.00     | 0.00      | 6.00   | Sin descuento  |
| 2      | Sándwich   | 3.50   | 4        | 14.00    | 1.40      | 12.60  | Con descuento  |
| 3      | Jugo       | 1.50   | 10       | 15.00    | 1.50      | 13.50  | Con descuento  |
| 4      | Pastel     | 4.00   | 2        | 8.00     | 0.00      | 8.00   | Sin descuento  |
