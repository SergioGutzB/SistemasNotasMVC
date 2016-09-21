/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.servlets;

import controlador.listas.ListaEstudiantes;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.conexion.Consulta;
import modelo.usuarios.Estudiante;

/**
 *
 * @author sergio
 */
public class SrvltEstudiante extends HttpServlet {

  /**
   * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
   * methods.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    if (request.getParameter("accion").equals("eliminar")) {
      Estudiante e = new Estudiante();
      e.setCodigo(Long.parseLong(request.getParameter("codigo")));
      Consulta co = new Consulta(e);
      co.Delet();
      e = null;
      co = null;
      System.out.println("imprimiendo resultado");
      response.sendRedirect("index.jsp");
    } else if (request.getParameter("accion").equals("editar")) {
      response.sendRedirect("EditarEstudiane.jsp");
    } else if (request.getParameter("accion").equals("update")) {
      ListaEstudiantes estudiantes = ListaEstudiantes.getListaEstudiantes();
      Estudiante es = new Estudiante();
      es = estudiantes.getEstudiantes().get(Integer.parseInt(request.getParameter("index")));
      es.setApellidos(request.getParameter("apellidos"));
      es.setNombres(request.getParameter("nombres"));
      es.setDireccion(request.getParameter("direccion"));
//     es.setDocumento(Long.parseLong((request.getParameter("documento")));
      es.setFecha(request.getParameter("fecha"));
      es.setTelefono(request.getParameter("telefono"));

      
      Consulta co = new Consulta(es);
      co.Update();
      es = null;
      co = null;
      response.sendRedirect("index.jsp");
    }
  }

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
  /**
   * Handles the HTTP <code>GET</code> method.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
//    processRequest(request, response);
    Estudiante e = new Estudiante();
    Consulta co = new Consulta(e);
    ResultSet resultado = null;
    resultado = co.selectAll();
    ListaEstudiantes estudiantes = ListaEstudiantes.getListaEstudiantes();
    estudiantes.getEstudiantes().clear();
//    System.out.println("imprimiendo resultado");
    e = null;
    co = null;
    try {
      while (resultado.next()) {
        Long codigo = Long.parseLong(resultado.getString("codigo"));
        String nombres = resultado.getString("nombres");
        String apellidos = resultado.getString("apellidos");
        Long documento = Long.parseLong(resultado.getString("documento"));
        String fecha = resultado.getString("fecha");
        String direccion = resultado.getString("direccion");
        String telefono = resultado.getString("telefono");
        Estudiante est = new Estudiante(codigo, nombres, apellidos, documento, fecha, direccion, telefono);
        estudiantes.adicionar(est);

      }
    } catch (SQLException ex) {
      Logger.getLogger(SrvltEstudiante.class
              .getName()).log(Level.SEVERE, null, ex);
    }

    System.out.println("imprimiendo resultado");
    response.sendRedirect("estudiantes.jsp");
  }

  /**
   * Handles the HTTP <code>POST</code> method.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {

    processRequest(request, response);
  }

  /**
   * Returns a short description of the servlet.
   *
   * @return a String containing servlet description
   */
  @Override
  public String getServletInfo() {
    return "Short description";
  }// </editor-fold>

}
