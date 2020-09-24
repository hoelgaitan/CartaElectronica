package ar.com.level.restaurante.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;


@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Factura implements Serializable {
    private Integer id;
    private String items;
    private Date fecha;
    private Integer id_cliente;


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    @Basic
    @Column(name= "items")
    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    @Basic
    @Column(name ="fecha")
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    @Basic
    @Column(name ="id_cliente")
    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }
}



