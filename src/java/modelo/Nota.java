/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import modelo.usuarios.Estudiante;

/**
 *
 * @author sergio
 */

public class Nota implements ICrud {

	private float puntaje;
	private Integer año;
	private Integer periodo;
	private Integer corte = 0;
	private float porcentaje = 0;
	private Estudiante estudiante;
	private Asignatura asignatura;
	
	public Nota() {
		super();
	}

	public Nota(Integer puntaje, Integer año, Integer periodo, Integer corte, float porcentaje, Estudiante estudiante,
			Asignatura asignatura) {
		super();
		this.puntaje = puntaje;
		this.año = año;
		this.periodo = periodo;
		this.corte = corte;
		this.porcentaje = porcentaje;
		this.estudiante = estudiante;
		this.asignatura = asignatura;
	}

	public float getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(Integer puntaje) {
		this.puntaje = puntaje;
	}

	public Integer getAño() {
		return año;
	}

	public void setAño(Integer año) {
		this.año = año;
	}

	public Integer getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Integer periodo) {
		this.periodo = periodo;
	}

	public Integer getCorte() {
		return corte;
	}

	public void setCorte(Integer corte) {
		this.corte = corte;
	}

	public float getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(float porcentaje) {
		this.porcentaje = porcentaje;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public Asignatura getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
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