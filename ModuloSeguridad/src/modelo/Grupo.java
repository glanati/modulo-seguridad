package modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Grupo {
	
	@Id
	private int codigo;
	private String descripcion;
	private boolean activo;
	
	public Grupo() {
		
	}
	
	public Grupo(int codigo, String descripcion, boolean activo){
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.activo = activo;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "Grupo [codigo=" + codigo + ", descripcion=" + descripcion
				+ ", activo=" + activo + "]";
	}

}
