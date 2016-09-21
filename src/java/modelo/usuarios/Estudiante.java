/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.usuarios;

import modelo.conexion.SQLConector;

/**
 *
 * @author sergio
 */
public class Estudiante extends Persona {

  private long codigo;

  public Estudiante() {
    super();
  }

  public Estudiante(long codigo, String nombres, String apellidos, long documento, String fecha, String direccion, String telefono) {
    super(nombres, apellidos, documento, fecha, direccion, telefono);
    this.codigo = codigo;
  }

  public long getCodigo() {
    return codigo;
  }

  public void setCodigo(Long codigo) {
    this.codigo = codigo;
  }

  @Override
  public String Insert() {
    return "INSERT INTO estudiante(codigo, nombres, apellidos, telefono, direccion, documento, fecha) VALUES ("
            + getCodigo() + ", '" + getNombres() + "', '" + getApellidos() + "', '" + getTelefono() + "', '"
            + getDireccion() + "', " + getDocumento() + ", '" + getFecha() + "');";
  }

  @Override
  public String Select() {
    // TODO Auto-generated method stub
    return "SELECT *	FROM Estudiante WHERE codigo=" + getCodigo();
  }

  public String SelectAll() {
    // TODO Auto-generated method stub
    return "SELECT *	FROM Estudiante";
  }

  @Override
  public String delete() {
    // TODO Auto-generated method stub
    return "DELETE FROM estudiante WHERE codigo=" + getCodigo();
  }

  @Override
  public String update() {
    // TODO Auto-generated method stub
    String up = "UPDATE estudiante "
            + "SET codigo=" + getCodigo() + ", nombres='" + getNombres() + "', apellidos='" + getApellidos() + "', "
            + "telefono='" + getTelefono() + "', direccion='" + getDireccion() + "', "
            + "documento=" + getDocumento() + ", fecha='" + getFecha() + "' WHERE codigo=" + getCodigo();
    System.out.println(up);
    return up;
  }

}
