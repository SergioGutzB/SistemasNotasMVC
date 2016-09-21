/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import modelo.usuarios.Profesor;

/**
 *
 * @author sergio
 */
public class Asignatura implements ICrud {

    private Integer codigo;
    private String nombre;
    private Profesor profesor;
    private Integer creditos;

    public Asignatura() {
    }

    public Asignatura(Integer codigo, String nombre, Profesor profesor, Integer creditos) {
        super();
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = profesor;
        this.creditos = creditos;
    }

    public Profesor getProfesor() {
        return null;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    @Override
    public String SelectAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String Insert() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String Select() {
        // TODO Auto-generated method stub
        return null;
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
