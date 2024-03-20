package apicampeonatosfifa.core.dominio;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name= "pais")
public class Seleccion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO , generator="secuencia_seleccion")
    @GenericGenerator(name = "secuencia_seleccion", strategy="increment")

    @Column(name="id")
    private int id;

    @Column(name="pais", length = 100, unique = false)
    private String nombre;

    @Column(name="entidad", length = 100, nullable = false)
    private String entidad;

    

    public Seleccion() {
    }

    public Seleccion(int id, String nombre, String entidad) {
        this.id = id;
        this.nombre = nombre;
        this.entidad = entidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }
    
}
