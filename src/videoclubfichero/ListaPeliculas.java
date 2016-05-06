/*
 * JavaBean que implementa el ArrayList<Pelicula>
 */
package videoclubfichero;
/**
 *
 * @author usu21
 */
import java.io.Serializable; 
import java.util.ArrayList;
import java.util.Collections;
public class ListaPeliculas {
    
    private ArrayList<Pelicula> lista;

    public ListaPeliculas() {
        lista = new ArrayList<>();
    }
    
    //Metodo para borrar una Pelicula a la lista
    public void borrarPelicula(Pelicula p){
        lista.remove(p);
    }
    
    //metodo que devuelve los minutos totales de las peliculas
    public int duracionTotal(){
        int total = 0;
        //recorremos la lista de peliculas
        for(Pelicula p: lista){
            //sumamos la duracion de la pelicula actual al total
            total+=p.getDuracion();
        }
        return total;
    }
    
    //metodo que devuelve cuantas peliculas tiene por ver el usuario
    public int peliculasPorVer(){
    int total = 0;
    for (Pelicula p : lista){
        if(p.isVisto() == false){ // (!p.isVisto())
            total++;
        }
    }
        return total;
    }
    
    //Metodo que a partir de un codigo devuelve la pelicula de la lista
    //si no existe, devolvemos un null
    public Pelicula peliculaPorCodigo(String codigo){
        for(Pelicula p:lista){
            if(p.getCodigo().equalsIgnoreCase(codigo)){
                return p;
            }
        }
        return null;
    }
    //Metodo que me devuelve la pelicula mejor valorada
    //devuelve null si no hay pelicula
    public Pelicula favorita(){
        if(lista.isEmpty()){
            return null;
        } else {
            //Como la primera como favorita
            Pelicula fav = lista.get(0);
            for (Pelicula p : lista){
                //si encontramos una con mejor valoracion
                if(p.getValoracion()>fav.getValoracion()){
                    //ahora la actual es la favorita
                    fav = p;
                }
            }
            return fav;
        }
    }
    
    //Opcion B del metodo de peliculaPorCodigo
    public Pelicula PeliculaPorCodigoOpcionB(String codigo){
        //Creo una pelicula auxiliar con el codigo
        Pelicula aux = new Pelicula();
        aux.setCodigo(codigo);
        //para saber en que posicion se encuentra esta pelicula
        //creo una pelicula auxiliar
        int posicion = lista.indexOf(aux);
        if(posicion == -1){ // Significa q la pelicula no existe
            return null;
        } else {
            return lista.get(posicion); //devuelve la pelicula encontrada
        }
    }
    
    //Metodo que devuelve un ArrayList<Pelicula> de un genero pasado
    //como parametro
    public ArrayList <Pelicula> peliculaPorGenero(String genero){
        ArrayList<Pelicula> pelisPorGenero = new ArrayList<>();
        for (Pelicula p : lista){
            if(p.getGenero().equalsIgnoreCase(genero)){
                pelisPorGenero.add(p);
            }
        }
        return pelisPorGenero;
    }
    
    
    //Metodo que devuelve la pelicula que hay en una posicion pasada
    // como parametro
    public Pelicula obtenerPelicula(int posicion){
        return lista.get(posicion);
    }
    
   //Metodo que devuelve la cantidad de elementos que tiene el arraylist
    public int cantidad(){
        return lista.size();
    }
    
        
    //Metodo para añadir una Pelicula a la lista
    public void altaPelicula(Pelicula p){
        lista.add(p);
    }
    
    //Funcion que comprueba si existe una pelicula con el mismo codigo
    // que p (parametro) en el ArrayList
    public boolean existe(Pelicula p){
//        for (Pelicula aux : lista){
//            if(p.getCodigo().equalsIgnoreCase(aux.getCodigo())){
//                return true;
//            }
//        }
//        return false;
        return lista.contains(p);
    }
    public ArrayList<Pelicula> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Pelicula> lista) {
        this.lista = lista;
    }

}
