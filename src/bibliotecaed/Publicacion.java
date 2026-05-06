/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecaed;

/**
 *
 * @author usuario
 */
public abstract class Publicacion {
    private final String TITULO;
    private final int FECHAPUB;

    public Publicacion(String TITULO, int FECHAPUB) {
        this.TITULO = TITULO;
        this.FECHAPUB = FECHAPUB;
    }
    
    public String datos(){
        return TITULO+"\nAño de publicación: "+FECHAPUB;
    }
    
}