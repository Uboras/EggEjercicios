Algoritmo ej7
definir palabra Como Caracter
definir c Como Entero
Escribir "Introducir palabra o frase"
leer palabra
c=Longitud(palabra)
si SubCadena(palabra,0,0)=subcadena(palabra,c-1,c-1) Entonces
	escribir "correcto"
SiNo
	escribir "incorrecto"
FinSi

FinAlgoritmo
///Continuando el ejercicio anterior, ahora se pedir� una frase o palabra y se validara si la
///primera letra de la frase es igual a la �ltima letra de la frase. Se deber� de imprimir un
///mensaje por pantalla que diga "CORRECTO", en caso contrario, se deber� imprimir
///"INCORRECTO".