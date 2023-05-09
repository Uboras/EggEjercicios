/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Herna
 */
public class G7Ejercicio1Libros {
    public String isbn;
    public String titulo;
    public String autor;
    public int numPaginas ;

    public G7Ejercicio1Libros() {
    }

    public G7Ejercicio1Libros(String isbn, String titulo, String autor, int numPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    
    
    @Override
    public String toString() {
        return " Libro: " + "\n Isbn=" + isbn + "\n titulo=" + titulo + "\n autor=" + autor + "\n numPaginas=" + numPaginas;
    }
 



}
