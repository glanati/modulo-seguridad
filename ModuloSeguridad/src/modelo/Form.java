package modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Form {
	
	@Id
	private int codigo;
	private String descripcion;
	private String clase;
	private boolean activo;
	private boolean menu;
	private int submodulo_codigo;
	
	public Form(){
		
	}
	
	public Form(int codigo, String descripcion, String clase, boolean activo,
			boolean menu, int submodulo_codigo) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.clase = clase;
		this.activo = activo;
		this.menu = menu;
		this.submodulo_codigo = submodulo_codigo;
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
	public String getClase() {
		return clase;
	}
	public void setClase(String clase) {
		this.clase = clase;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	public boolean isMenu() {
		return menu;
	}
	public void setMenu(boolean menu) {
		this.menu = menu;
	}
	public int getSubmodulo_codigo() {
		return submodulo_codigo;
	}
	public void setSubmodulo_codigo(int submodulo_codigo) {
		this.submodulo_codigo = submodulo_codigo;
	}
	@Override
	public String toString() {
		return "Form [codigo=" + codigo + ", descripcion=" + descripcion
				+ ", clase=" + clase + ", activo=" + activo + ", menu=" + menu
				+ ", submodulo_codigo=" + submodulo_codigo + "]";
	}

}
