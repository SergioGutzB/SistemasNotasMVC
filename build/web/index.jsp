F<%--
Document   : index
Created on : 20/09/2016, 12:41:44 PM
Author     : sergio
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Sistemas de Notas</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/foundation/6.2.3/foundation.min.css">
  </head>
  <body>

    <div class="row header">
      <div class="medium-10 medium-center columns">
        <h1>Sistema de Notas</h1>
        <a href="./SrvltEstudiante">Estudiantes</a>
      </div>
    </div>
    <div class="row collapse">
      <div class="medium-3 columns">
        <ul class="tabs vertical" id="example-vert-tabs" data-tabs>
          <li class="tabs-title is-active"><a href="#panel1v"
                                              aria-selected="true">Registrar Estudiante</a></li>
          <li class="tabs-title"><a href="#panel2v">Registrar
              Profesor</a></li>
          <li class="tabs-title"><a href="#panel3v">Registrar Materia</a></li>
        </ul>
      </div>
      
      <div class="medium-9 columns">
        <div class="tabs-content vertical"data-tabs-content="example-vert-tabs">
          <!--######################## REGISTRAS ESTUDIANTE ############################-->
          <div class="tabs-panel is-active" id="panel1v">
            <h3>Registrar Estudiante</h3>
            <form action="./Registrador" method="get">
              <input type="hidden" name="accion" value="r-estudiante">
              <div class="row">
                <div class="medium-4 columns">
                  <label>Código
                    <input type="number" placeholder="codigo" name="codigo">
                  </label>
                </div>
                <div class="medium-4 columns">
                  <label>Nombres
                    <input type="text" placeholder="Nombres" name="nombres">
                  </label>
                </div>
                <div class="medium-4 columns">
                  <label>Apellidos
                    <input type="text" placeholder="Apellidos" name="apellidos">
                  </label>
                </div>
              </div>
              <div class="row">
                <div class="medium-3 columns">
                  <label>Documento
                    <input type="number" placeholder="Documento" name="documento">
                  </label>
                </div>
                <div class="medium-3 columns">
                  <label>Teléfono
                    <input type="number" placeholder="Telefono" name="telefono">
                  </label>
                </div>
                <div class="medium-3 columns">
                  <label>Fecha
                    <input type="date" placeholder="Fecha" name="fecha">
                  </label>
                </div>
                <div class="medium-3 columns">
                  <label>Dirección
                    <input type="text" placeholder="Dirección" name="direccion">
                  </label>
                </div>

              </div>
              <button type="submit" class="success button">Registrar</button>
            </form>
          </div>
          <!--######################## REGISTRAR ESTUDIANTE ############################-->
          <div class="tabs-panel" id="panel2v">
            <h3>Registrar Profesor</h3>
            <form action="./Registrador" method="get">
              <input type="hidden" name="accion" value="r-profesor">
              <div class="row">
                <div class="medium-4 columns">
                  <label>Código
                    <input type="number" placeholder="codigo" name="codigo">
                  </label>
                </div>
                <div class="medium-4 columns">
                  <label>Nombres
                    <input type="text" placeholder="Nombres" name="nombres">
                  </label>
                </div>
                <div class="medium-4 columns">
                  <label>Apellidos
                    <input type="text" placeholder="Apellidos" name="apellidos">
                  </label>
                </div>
              </div>
              <div class="row">
                <div class="medium-3 columns">
                  <label>Documento
                    <input type="number" placeholder="Documento" name="documento">
                  </label>
                </div>
                <div class="medium-3 columns">
                  <label>Teléfono
                    <input type="number" placeholder="Telefono" name="telefono">
                  </label>
                </div>
                <div class="medium-3 columns">
                  <label>Fecha
                    <input type="date" placeholder="Fecha" name="fecha">
                  </label>
                </div>
                <div class="medium-3 columns">
                  <label>Dirección
                    <input type="text" placeholder="Dirección" name="direccion">
                  </label>
                </div>

              </div>
              <button type="submit" class="success button">Registrar</button>
            </form>
          </div>
          <div class="tabs-panel" id="panel3v">
            <h3>Registrar Materia</h3>
          </div>


        </div>
      </div>
    </div>
  </div>


  <script src="https://code.jquery.com/jquery-1.12.4.min.js"
          integrity="sha256-ZosEbRLbNQzLpnKIkEdrPv7lOy9C27hHQ+Xp8a4MxAQ="
  crossorigin="anonymous"></script>
  <script
  src="https://cdn.jsdelivr.net/foundation/6.2.3/foundation.min.js"></script>
  <script src="js/app.js"></script>
</body>
</html>