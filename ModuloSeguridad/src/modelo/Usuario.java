package modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario {
	
	@Id
	private int codigo;
	private String nombre_usuario;
	private String nombre;
	private String clave;
	private String email;
	private String telefono;
	private boolean activo;
	private boolean resetear_clave;
	private String imagen;
	
	public Usuario (){
		
	}
	
	public Usuario(int codigo, String nombre_usuario, String nombre,
			String clave, String email, String telefono, boolean activo,
			boolean resetear_clave, String imagen) {
		super();
		this.codigo = codigo;
		this.nombre_usuario = nombre_usuario;
		this.nombre = nombre;
		this.clave = clave;
		this.email = email;
		this.telefono = telefono;
		this.activo = activo;
		this.resetear_clave = resetear_clave;
		this.imagen = imagen;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre_usuario() {
		return nombre_usuario;
	}
	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	public boolean isResetear_clave() {
		return resetear_clave;
	}
	public void setResetear_clave(boolean resetear_clave) {
		this.resetear_clave = resetear_clave;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
	@Override
	public String toString() {
		return "Usuario [codigo=" + codigo + ", nombre_usuario="
				+ nombre_usuario + ", nombre=" + nombre + ", clave=" + clave
				+ ", email=" + email + ", telefono=" + telefono + ", activo="
				+ activo + ", resetear_clave=" + resetear_clave + ", imagen="
				+ imagen + "]";
	}

}
