/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espoch.edu.examen.modelo;

/**
 *
 * @author KARLA
 */
public class GestionarPersona {
    
    int tamanoVector = 5;
    Persona[] objpersona = new Persona[tamanoVector];
    int cont = 0;
 

    public String agregarPersona(Persona persona) {
        String msg = "Ingreso exitoso";
        if (persona.length != cont) {
            for (int i = 0; i < persona.length; i++) {
                Persona[] personas = null;
                if (personas[i] == null) {
           
                    personas[i] = new Persona();
            
                    personas[i].setNombre(persona.getNombre());
                    personas[i].setApellido(persona.getApellido());
                    personas[i].setEdad(persona.getEdad());
                    cont++;
           
                    return msg;
                }
            }
        } else {
                msg = "Ingreso no permitido, el vector esta lleno";
        }
        return msg;
    }

    public Persona[] listarPersona() {

        Persona [] auxPersonas = new Persona[tamanoVector];
        for (int i = 0; i < cont; i++) {

            auxPersonas[i] = new Persona();
            auxPersonas[i].setNombre(objpersona[i].getNombre());
            auxPersonas[i].setApellido(objpersona[i].getApellido());
            auxPersonas[i].setEdad(objpersona[i].getEdad());
            System.out.println("Modelo-listarTarea" + auxPersonas[i].getEdad());
            
             }
        
        return auxPersonas;
        
    }
}


    

