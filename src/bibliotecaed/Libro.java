/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecaed;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Libro extends Papel implements Prestable {
    private final String AUTOR;
    private boolean prestado;
    private ArrayList ListaPrestamos = new ArrayList();

    public Libro(String TITULO, int FECHAPUB, String ISBN, int PAGINAS, String AUTOR) {
        super(TITULO, FECHAPUB, ISBN, PAGINAS);
        this.AUTOR = AUTOR;
        this.prestado = false;
    }
    
    
    
}
