/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.demo.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
@Entity
@Table(name = "categoria")

public class categoria implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Long idcategoria;
    private String descripcion;
    private String rutaImagen;
    private boolean activo;
    @OneToMany
    @JoinColumn(name = "id_Categoria")
    List<Producto> productos;

    public categoria() {
    }

    public categoria(String categoria, boolean activo) {
        this.descripcion = categoria;
        this.activo = activo;
    }

}
