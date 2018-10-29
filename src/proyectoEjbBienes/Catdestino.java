package proyectoEjbBienes;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the catdestinos database table.
 * 
 */
@Entity
@Table(name="catdestinos")
@NamedQuery(name="Catdestino.findAll", query="SELECT c FROM Catdestino c")
public class Catdestino implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idDestino;
    
	private String descripcion;
    
	private long estatus;
	
	
	private String nombre;

	public Catdestino() {
	}

	public int getIdDestino() {
		return this.idDestino;
	}

	public void setIdDestino(int idDestino) {
		this.idDestino = idDestino;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public long getEstatus() {
		return this.estatus;
	}

	public void setEstatus(long estatus) {
		this.estatus = estatus;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}