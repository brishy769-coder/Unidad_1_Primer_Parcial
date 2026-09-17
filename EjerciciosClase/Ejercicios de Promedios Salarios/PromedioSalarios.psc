Algoritmo PromedioSalarios
		Definir salario, acumulador, promedio Como Real
		Definir contador Como Entero
		
		acumulador <- 0
		contador <- 0
		
		Escribir "Ingrese salarios de empleados (negativo para terminar):"
		
		Repetir
			Escribir "Salario: "
			Leer salario
			
			Si salario >= 0 Entonces
				acumulador <- acumulador + salario
				contador <- contador + 1
			FinSi
			
		Hasta Que salario < 0
		
		Si contador > 0 Entonces
			promedio <- acumulador / contador
			Escribir "Número de salarios ingresados: ", contador
			Escribir "Promedio de salarios: ", promedio
		SiNo
			Escribir "No se ingresaron salarios válidos."
		FinSi

FinAlgoritmo
