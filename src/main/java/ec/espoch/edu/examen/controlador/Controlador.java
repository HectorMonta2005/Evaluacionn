/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espoch.edu.examen.controlador;

import ec.espoch.edu.examen.modelo.GestionarPersona;
import ec.espoch.edu.examen.modelo.Persona;
import ec.espoch.edu.examen.vista.Listar;
import ec.espoch.edu.examen.vista.Vista;

/**
 *
 * @author KARLA
 */
public class Controlador {
    
    private Vista vista;
    private GestionarPersona gestionarPersona;
    private Listar listar;
    private Persona persona;

    public Controlador(Vista vista, Listar listar) {
        this.vista = vista;
        this.gestionarPersona = gestionarPersona;
        this.listar = listar;
        this.persona = persona;
    }

    

    public void almacenarPersona() {

        try {
            if (this.vista != null) {
                Persona objPersona = new Persona ();
                objPersona.setNombre(this.vista.getNombre());
                objPersona.setApellido(this.vista.getApellido());
                objPersona.setEdad(this.vista.getEdad());
                
                String msm = gestionarPersona.agregarPersona(objPersona);
                char[] data = new char[0];
                String result = String.copyValueOf(data);
                              
            }
        } catch (Exception e) {
          vista.respuesta("Error los datos son incorrectos");
        }
    }

    public void listarPersona() {
           try {
            String msm = "";
            Persona[] persona = new Persona[5];
     Persona[] Persona = gestionarPersona.listarPersona();
            if (Persona != null) {
                String lista = "";
                for (int i = 0; i < persona.length; i++) {
                    if (persona[i] != null) {
                        lista = lista + "Nombre:" + persona[i].getNombre() + "\n"
                                + "Apellido:" + persona[i].getApellido() + "\n"
                                + "Edad:" + persona[i].getEdad();
                                
                    }
                }
                msm = lista;
            } else {
                msm = "No hay datos que mostrar";
            }
            listar.mostrarDatos(msm);

        } catch (Exception e) {
            System.out.println("Error Controlador-listarTarea: " + e);
        }
    }
     public void almacenar() {
        // Código para almacenar los datos
        System.out.println("Datos almacenados correctamente.");
    }
}
       
    

