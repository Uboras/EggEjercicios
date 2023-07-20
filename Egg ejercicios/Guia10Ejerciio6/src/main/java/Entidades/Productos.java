
package Entidades;

import java.util.Objects;

/**
 *
 * @author Herna
 */
public class Productos {
    private String articulo ;
    private Double precio;

    public Productos() {
    }

    public Productos(String articulo, Double precio) {
        this.articulo = articulo;
        this.precio = precio;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.articulo);
        hash = 79 * hash + Objects.hashCode(this.precio);
        return hash;
    }

  

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Productos other = (Productos) obj;
        
        if (!Objects.equals(this.articulo, other.articulo)) {
            return false;
        }
        return Objects.equals(this.precio, other.precio);
    }

   

    @Override
    public String toString() {
        return " Articulo " + articulo + " $ "+  precio ;
    }
    
    
    
    
}
