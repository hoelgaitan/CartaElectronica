package ar.com.level.restaurante.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Producto implements Serializable {
    private Integer ID;
    private String descripcion;
    private String precio;
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {

        this.ID = ID;
    }
    @Basic
    @Column(name = "descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {

        this.descripcion = descripcion;
    }
    @Basic
    @Column(name = "precio")

    public String getPrecio() {

        return precio;
    }

    public void setPrecio(String precio) {

        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(ID, producto.ID) &&
                Objects.equals(descripcion, producto.descripcion) &&
                Objects.equals(precio, producto.precio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, descripcion, precio);
    }
}
