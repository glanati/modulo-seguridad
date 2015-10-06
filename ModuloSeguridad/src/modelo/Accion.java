package modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Accion {
	
	@Id
	private int codigo;
	private String descripcion;
	private String control;
	private int formulario_codigo;
	
	public Accion() {
		
	}
	
	public Accion(int codigo, String descripcion, String control,
			int formulario_codigo) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.control = control;
		this.formulario_codigo = formulario_codigo;
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
	public String getControl() {
		return control;
	}
	public void setControl(String control) {
		this.control = control;
	}
	public int getFormulario_codigo() {
		return formulario_codigo;
	}
	public void setFormulario_codigo(int formulario_codigo) {
		this.formulario_codigo = formulario_codigo;
	}

	@Override
	public String toString() {
		return "Accion [codigo=" + codigo + ", descripcion=" + descripcion
				+ ", control=" + control + ", formulario_codigo="
				+ formulario_codigo + "]";
	}
	
}
