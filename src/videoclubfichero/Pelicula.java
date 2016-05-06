/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoclubfichero;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author usu21
 */
public class Pelicula implements Serializable{
    //Es necesario que sea serializable para trabajar con JavaBean
    private String codigo;
    private String titulo;
    private int duracion;
    private String genero;
    private int valoracion;
    private boolean visto;

    //como vamos a buscar por codigo, llamamos a la funcion equals y
    // marcamos solo el campo de Codigo
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.codigo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pelicula other = (Pelicula) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

    
    
    
    //constructor vacio es necesario para la construccion de un JavaBean
    public Pelicula(){
    }
    public Pelicula(String codigo, String titulo, int duracion, String genero, int valoracion, boolean visto) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
        this.valoracion = valoracion;
        this.visto = visto;
    }

    @Override
    public String toString() {
        String texto = "Codigo=" + codigo + ", titulo=" + titulo + ", duracion=" + duracion + ", genero=" + genero + ", valoracion=" + valoracion;
        if (visto) {
            texto += " vista";
        } else {
            texto += " pendiente de ver.";
        }
        return texto;
    }
    
    
    
    public boolean isVisto() {
        return visto;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }


    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }


    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    
}

