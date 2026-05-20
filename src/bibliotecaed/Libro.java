/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecaed;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Libro extends Papel implements Prestable {
    private final String AUTOR;
    private boolean prestado;
    private ArrayList listaPrestamos = new ArrayList();

    public Libro(String TITULO, int FECHAPUB, String ISBN, int PAGINAS, String AUTOR) {
        super(TITULO, FECHAPUB, ISBN, PAGINAS);
        this.AUTOR = AUTOR;
        this.prestado = false;
    }
    
    @Override
    public void presta(Socio s) {
       this.prestado = true;
       LocalDate currentDate = LocalDate.now();
       listaPrestamos.add(currentDate+" "+s.getNOMBRE()+" SALIDA BIBLIOTECA");
       s.getListaPrestamos().add(currentDate+" "+this.getTITULO()+" SALIDA BIBLIOTECA");
    }

    @Override
    public void devuelve(Socio s) {
        this.prestado = false;
        LocalDate currentDate = LocalDate.now();
        listaPrestamos.add(currentDate+" "+s.getNOMBRE()+" RETORNO BIBLIOTECA");
        s.getListaPrestamos().add(currentDate+" "+this.getTITULO()+" RETORNO BIBLIOTECA");
    }

    @Override
    public boolean estaPrestado() {
        return prestado;
    }
    
    public void listarPrestamos(){
        System.out.println("Préstamos de "+this.getTITULO()+"\n");
        for (Object l : listaPrestamos) {
            System.out.println(l);
        }
        System.out.println("");
    }
    
    @Override
    public String datos() {
        return prestado ? super.datos()+"\nAutor: "+AUTOR+"\nEn la biblioteca: No":super.datos()+"\nAutor: "+AUTOR+"\nEn la biblioteca: Sí";
    }
    
}
