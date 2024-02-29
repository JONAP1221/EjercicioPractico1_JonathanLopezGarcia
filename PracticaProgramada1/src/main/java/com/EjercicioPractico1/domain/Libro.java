package com.EjercicioPractico1.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;
/**
 *
 * @author Jonathan
 */
@Data
@Entity
@Table(name="libros")
public class Libro implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    private String titulo;
    private String autor;
    private int precio;
    private String categoria;
    private boolean activo;

    public Libro() {
    }

    public Libro(String libro,String autor,int precio,String categoria, boolean activo) {
        this.titulo = libro;
        this.activo = activo;
    }
}
