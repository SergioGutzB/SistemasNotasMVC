/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.usuarios;

import modelo.ICrud;

/**
 *
 * @author sergio
 */
public abstract class Persona implements IPersona, ICrud{

	private String nombres;
	private String apellidos;
	private long documento;
	private String fecha;
	private String direccion;
	private String telefono;
	
	
	public Persona() {
		super();
	}

	public Persona(String nombres, String apellidos, long documento, String fecha, String direccion, String telefono) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.documento = documento;
		this.fecha = fecha;
		this.direccion = direccion;
          this.telefono = telefono;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public long getDocumento() {
		return documento;
	}

	public void setDocumento(Integer documento) {
		this.documento = documento;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	
	@Override
	public String SelectAll() {
		String query = "SELECT *	FROM "+ getClass().getSimpleName();
		return query;
	}
	
	
}