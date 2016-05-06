/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoclubfichero;

import utilidades.Fichero;

/**
 *
 * @author usu21
 */
public class VideoClubFichero {
    public static Fichero miFichero;
    public static ListaPeliculas misPeliculas;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Inicializamos el fichero y la lista de peliculas
        miFichero = new Fichero ("videoclub.xml");
        misPeliculas = (ListaPeliculas) miFichero.leer(); //casting de objeto q devuelve leer() a ListaPeliculas
        if(misPeliculas == null){
            misPeliculas = new ListaPeliculas();
        }
        //Creamos el Menu Principal y lo hacemos visible
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
    }
    
}
