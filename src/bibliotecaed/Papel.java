/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecaed;

/**
 *
 * @author usuario
 */
public class Papel extends Publicacion {
    private final String ISBN;
    private final int PAGINAS;

    public Papel(String TITULO, int FECHAPUB, String ISBN, int PAGINAS) {
        super(TITULO, FECHAPUB);
        this.ISBN = ISBN;
        this.PAGINAS = PAGINAS;
    }
    
    
    
}
