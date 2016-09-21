/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.listas;

import java.util.ArrayList;
import modelo.usuarios.Estudiante;

/**
 *
 * @author sergio
 */

public class ListaEstudiantes {
	private static ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
    private static ListaEstudiantes ListaEstudiantes = null;
    
    //CONSTRUCTOR
    private ListaEstudiantes(){        
    }
    
    //METODOS
    public static ListaEstudiantes getListaEstudiantes(){
        if (ListaEstudiantes==null){
        	ListaEstudiantes = new ListaEstudiantes();
        }
        return ListaEstudiantes;
    }
    
    public ArrayList<Estudiante> getEstudiantes(){
        return estudiantes;        
    }

    public void adicionar(Estudiante estudiante) {
    	estudiantes.add(estudiante);
    }
}