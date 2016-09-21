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
public interface IPersona {
	String nombres = "";
	String apellidos = "";
	long documento = 0;
	String fecha = "";
	String direccion = "";
	String telefono = "";
		
	 String getNombres();
	 void setNombres(String nombres);
	 String getApellidos();
	 void setApellidos(String apellidos);
	 long getDocumento();
	 void setDocumento(Integer documento);
	 String getFecha();
	 void setFecha(String fecha);
	 String getDireccion();
	 void setDireccion(String direccion);
	 String getTelefono();
	 void setTelefono(String telefono) ;	 
	
	
}
