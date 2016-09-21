/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.conexion;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.ICrud;

/**
 *
 * @author sergio
 */
public class Consulta {

  private SQLConector peticion;
  private ICrud objectCRUD;

  public Consulta() {
    super();
  }

  public Consulta(ICrud objectCRUD) {
    super();
    peticion = SQLConector.getInstance();
    this.objectCRUD = objectCRUD;

  }

  public ResultSet querySet(String query) {
    String consultaSQL = query;
    ResultSet resultado = null;
    try {
      peticion.setStmt(peticion.getConn().createStatement());
      resultado = peticion.getStmt().executeQuery(consultaSQL);
      System.out.println("Se ejecutó el query satisfactoriamente!");
      System.out.println("Query: " + query);
      System.out.println("Respuesta: " + resultado);
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return resultado;
  }

  public boolean query(String query) {
    try {
      peticion.setStmt(peticion.getConn().createStatement());

    } catch (SQLException ex) {
      Logger.getLogger(SQLConector.class.getName()).log(Level.SEVERE, null, ex);
      return false;
    }
    String sql = query;

    try {
      peticion.getStmt().executeUpdate(sql);
      System.out.println("Consulta de " + objectCRUD.getClass().getSimpleName() + " realizada Satisfactoriamente");
      return true;
    } catch (SQLException ex) {
      Logger.getLogger(SQLConector.class.getName()).log(Level.SEVERE, null, ex);
      return false;
    }
  }

  public boolean insertar() {
    return query(objectCRUD.Insert());
  }

  public ResultSet selectAll() {
    return querySet(objectCRUD.SelectAll());
  }
  
  public ResultSet select() {
    return querySet(objectCRUD.Select());
  }

  public boolean Delet() {
    return query(objectCRUD.delete());
  }

  public boolean Update() {
    return query(objectCRUD.update());
  }

  public ICrud getObjectCRUD() {
    return objectCRUD;
  }

  public void setObjectCRUD(ICrud objectCRUD) {
    this.objectCRUD = objectCRUD;
  }
}
