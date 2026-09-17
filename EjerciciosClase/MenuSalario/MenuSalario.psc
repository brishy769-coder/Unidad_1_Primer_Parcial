Algoritmo 	MenuSalario
	
    Definir opcion, contador Como Entero
    Definir acumulador, salario, salarioMayor, salarioMenor Como Real
    Definir promedio, salarioComparar Como Real
	
    contador <- 0
    acumulador <- 0
    salarioMayor <- 0
    salarioMenor <- 0
	
    Repetir
		
		Escribir "===== SISTEMA DE SALARIOS ====="
        Escribir "1. Registrar salarios"
        Escribir "2. Mostrar resumen"
        Escribir "3. Comparar un salario con el promedio"
        Escribir "4. Reiniciar información"
        Escribir "0. Salir"
        Escribir "Seleccione una opción: "
        Leer opcion
		
        Segun opcion Hacer
			
            1:
                Escribir "--- REGISTRO DE SALARIOS ---"
                Escribir "Ingrese salarios. Para terminar, ingrese un salario negativo."
                
                Escribir "Ingrese salario: "
                Leer salario
				
                Mientras salario >= 0 Hacer
					
                    contador <- contador + 1
                    acumulador <- acumulador + salario
					
                    Si contador = 1 Entonces
                        salarioMayor <- salario
                        salarioMenor <- salario
                    SiNo
						
                        Si salario > salarioMayor Entonces
                            salarioMayor <- salario
                        FinSi
						
                        Si salario < salarioMenor Entonces
                            salarioMenor <- salario
                        FinSi
						
                    FinSi
					
                    Escribir "Ingrese salario: "
                    Leer salario
					
                FinMientras
				
                Escribir "Registro terminado."
				
            2:
                Escribir "--- RESUMEN DE SALARIOS ---"
				
                Si contador = 0 Entonces
                    Escribir "No existen salarios registrados."
                SiNo
                    promedio <- acumulador / contador
					
                    Escribir "Cantidad de salarios: ", contador
                    Escribir "Total de salarios: ", acumulador
                    Escribir "Promedio: ", promedio
                    Escribir "Salario mayor: ", salarioMayor
                    Escribir "Salario menor: ", salarioMenor
                FinSi
				
            3:
                Escribir "--- COMPARAR SALARIO CON EL PROMEDIO ---"
				
                Si contador = 0 Entonces
                    Escribir "No existen salarios registrados."
                    Escribir "Primero debe registrar salarios."
                SiNo
					
                    promedio <- acumulador / contador
					
                    Escribir "Ingrese el salario que desea comparar: "
                    Leer salarioComparar
					
                    Si salarioComparar > promedio Entonces
                        Escribir "El salario está por encima del promedio."
                    SiNo
                        Si salarioComparar < promedio Entonces
                            Escribir "El salario está por debajo del promedio."
                        SiNo
                            Escribir "El salario es igual al promedio."
                        FinSi
                    FinSi
					
                FinSi
				
            4:
                contador <- 0
                acumulador <- 0
                salarioMayor <- 0
                salarioMenor <- 0
				
                Escribir "Información reiniciada correctamente."
				
            0:
                Escribir "Saliendo del sistema..."
				
            De Otro Modo:
                Escribir "Opción no válida."
				
        FinSegun
		
    Hasta Que opcion = 0
	
FinAlgoritmo