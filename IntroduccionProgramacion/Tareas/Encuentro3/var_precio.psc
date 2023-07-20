/// precio anterior, precio postarior y calcular % de aumento en el año
// ingresar precios

Algoritmo var_precio
	Definir precioANt, precioPost,Varprecio Como Real
	
	Escribir " escaribe el precio inicial de año"
	leer precioANt
	Escribir " Escribe el precio al final de año"
	leer precioPost
	
	Varprecio = ((precioPost / precioANt) -1)* 100
	
	Escribir "el producto tuvo una variacion del :", Varprecio, " porciento"
FinAlgoritmo
