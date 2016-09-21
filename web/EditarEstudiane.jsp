<%-- 
    Document   : EditarEstudiane
    Created on : 20/09/2016, 02:52:51 PM
    Author     : sergio
--%>

<%@page import="controlador.listas.ListaEstudiantes"%>
<%@page import="java.lang.String"%>
<%@page import="modelo.usuarios.Estudiante"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
int index= Integer.parseInt(request.getParameter("index"));
ListaEstudiantes estudiantes = ListaEstudiantes.getListaEstudiantes();
Estudiante es = new Estudiante();
es = estudiantes.getEstudiantes().get(index);


%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Estudiante</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/foundation/6.2.3/foundation.min.css">
  </head>
  <body>
    <div class="row header">
      <div class="medium-10 medium-center columns">
        <h3>Sistema de Notas - Editor de estudiante <%= es.getNombres() %></h3>
      </div>
    </div>
    <div class="row">
      <div class="small-10 small-center columns">        
        <div class="small-12 small-center columns">
          <form action="./SrvltEstudiante" method="post">
            <input type="hidden" name="accion" value="update">
            <input type="hidden" name="index" value="<%= index %>">                    
            <div class="row">
              <div class="medium-5 columns">
                <label>Nombres
                  <input type="text" value="<%= es.getNombres() %>" name="nombres">
                </label>
              </div>
              <div class="medium-5 columns">
                <label>Apellidos
                  <input type="text" value="<%= es.getApellidos() %>" name="apellidos">
                </label>
              </div>
            </div>
            <div class="row">
              
              <div class="medium-4 columns">
                <label>Teléfono
                  <input type="number" value="<%= es.getTelefono() %>" name="telefono">
                </label>
              </div>
              <div class="medium-4 columns">
                <label>Fecha
                  <input type="date" value="<%= es.getFecha() %>" name="fecha">
                </label>
              </div>
              <div class="medium-4 columns">
                <label>Dirección
                  <input type="text" value="<%= es.getDireccion() %>" name="direccion">
                </label>
              </div>

            </div>
            <button type="submit" class="success button">Registrar</button>
          </form>
        </div>
      </div>
    </div>
  </body>
</html>
