<%-- 
    Document   : estudiante
    Created on : 20/09/2016, 01:43:41 PM
    Author     : sergio
--%>

<%@page import="modelo.usuarios.Estudiante"%>
<%@page import="controlador.listas.ListaEstudiantes"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
  ListaEstudiantes estudiantes = ListaEstudiantes.getListaEstudiantes();
%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Estudiantes</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/foundation/6.2.3/foundation.min.css">
  </head>
  <body>
    <div class="row header">
      <div class="medium-10 medium-center columns">
        <h3>Sistema de Notas - Lista de Estudiantes</h3>
      </div>
    </div>

    <div class="row">
      <div class="small-10 small-center columns">        
        <div class="small-12 small-center columns">
          <table>
            <thead>              
              <tr>
                <th width="200">Codigo</th>
                <th>Nombres</th>
                <th width="150">Apellidos</th>
                <th width="150">Documento</th>
                <th width="150">Acciones</th>
              </tr>
            </thead>
            <tbody>
              <%
                for (Estudiante estudiante : estudiantes.getEstudiantes()) {
              %>
              <tr>
                <td><%= estudiante.getCodigo() %></td>
                <td><%= estudiante.getNombres() %>.</td>
                <td><%= estudiante.getApellidos() %></td>
                <td><%= estudiante.getDocumento() %></td>
                <td>
                  <form action="./SrvltEstudiante" method="post">
                    <input type="hidden" name="accion" value="eliminar">
                    <input type="hidden" name="codigo" value="<%= estudiante.getCodigo() %>"> 
                    <button type="submit" class="tiny button">Eliminar</button>               
                  </form>
                    
                  <form  action="EditarEstudiane.jsp">
                    <input type="hidden" name="accion" value="editar">
                    <input type="hidden" name="index" value="<%= estudiantes.getEstudiantes().indexOf(estudiante) %>">                    
                    <button type="submit" class="alert tiny button ">Editar</button>               
                  </form>
                </td>
              </tr>
              <%
                }
              %>
            </tbody>
          </table>
        </div>

      </div>
    </div>

  </body>
</html>
