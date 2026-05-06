/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecaed;

/**
 *
 * @author usuario
 */
public class Audiovisual extends Publicacion {
    
    private final String ISAN;
    private final int DURACION;

    public Audiovisual(String TITULO, int FECHAPUB, String ISAN, int DURACION) {
        super(TITULO, FECHAPUB);
        this.ISAN = ISAN;
        this.DURACION = DURACION;
    }
    
    
    
}
