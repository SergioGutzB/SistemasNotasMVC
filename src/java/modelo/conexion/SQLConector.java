/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.conexion;

import java.sql.*;  // for standard JDBC programs
import java.util.logging.Level;
import java.util.logging.Logger;

import modelo.ICrud;

/**
 *
 * @author sergio
 */
public class SQLConector {

  private static SQLConector conexion = null;
  // JDBC driver name and database URL  
  static final String DB_URL = "jdbc:postgresql://localhost/Estudiante";

  //  Database credentials
  private static final String USER = "postgres";
  private static final String PASS = "";
  private Connection conn = null;
  private Statement stmt = null;
  private static ICrud object;

  private SQLConector() {
//    	object = objectCRUD;
    try {

      Class.forName("org.postgresql.Driver");
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
    } catch (ClassNotFoundException ex) {
      Logger.getLogger(SQLConector.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
      Logger.getLogger(SQLConector.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  //METODOS
  public static SQLConector getInstance() {
    if (conexion == null) {
      conexion = new SQLConector();
    }
    return conexion;
  }

  public Connection getConn() {
    return conn;
  }

  public void setConn(Connection conn) {
    this.conn = conn;
  }

  public Statement getStmt() {
    return stmt;
  }

  public void setStmt(Statement stmt) {
    this.stmt = stmt;
  }

}
