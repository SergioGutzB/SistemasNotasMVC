/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.usuarios;

/**
 *
 * @author sergio
 */
public class Profesor extends Persona{
	private Long codigo;


	public Profesor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Profesor(Long codigo, String nombres, String apellidos, Long documento, String fecha, String direccion, String telefono) {
		super(nombres, apellidos, documento, fecha, direccion, telefono);
		this.codigo = codigo;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String SelectAll() {
		// TODO Auto-generated method stub
		return null;
	}
	

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	@Override
	public String Insert() {
		return "INSERT INTO profesor(codigo, nombres, apellidos, telefono, direccion, documento, fecha) VALUES ("
				+ getCodigo() + ", '" + getNombres() + "', '" + getApellidos() + "', '" + getTelefono() + "', '"
				+ getDireccion() + "', " + getDocumento() + ", '" + getFecha() + "');";
		 
	}

	@Override
	public String Select() {
		// TODO Auto-generated method stub
		return "SELECT *	FROM Profesor WHERE codigo=" +  getCodigo();
	}

	@Override
	public String delete() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String update() {
		// TODO Auto-generated method stub
		return null;
	}	

}