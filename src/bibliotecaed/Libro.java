/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecaed;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Esta clase maneja los métodos para prestar, devolver o listar préstamos de los
 * libros de nuestra biblioteca.
 * @author Alejandro Ramírez Nieves
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
    
    /**
     * El método presta marca un libro como prestado y crea una entrada en el
     * ArrayList listaPrestamos tanto de la clase Libro como de la clase Socio.
     * @param s El socio que está retirando el libro.
     * @version 1.1
     */
    
    @Override
    public void presta(Socio s) {
       this.prestado = true;
       LocalDate currentDate = LocalDate.now();
       listaPrestamos.add(currentDate+" "+s.getNOMBRE()+" SALIDA BIBLIOTECA");
       s.getListaPrestamos().add(currentDate+" "+this.getTITULO()+" SALIDA BIBLIOTECA");
    }
    
    /**
     * El método devuelve funciona de forma inversa al método presta, añadiendo las
     * correspondientes entradas en listaPrestamos pero con el texto Retorno en lugar
     * de Salida.
     * @param s El socio que está retirando el libro.
     * @version 1.1
     */

    @Override
    public void devuelve(Socio s) {
        this.prestado = false;
        LocalDate currentDate = LocalDate.now();
        listaPrestamos.add(currentDate+" "+s.getNOMBRE()+" RETORNO BIBLIOTECA");
        s.getListaPrestamos().add(currentDate+" "+this.getTITULO()+" RETORNO BIBLIOTECA");
    }
    
    /**
     * El método estaPrestado nos devuelve un valor boolean correspondiente al estado
     * del libro.
     * @return prestado, valor booleano que marca true si el libro se encuentra prestado
     * o false si el libro se encuentra en la biblioteca.
     * @version 1.0
     */

    @Override
    public boolean estaPrestado() {
        return prestado;
    }
    
    /**
     * El método listarPrestamos nos devuelve una lista de los préstamos de un libro.
     * @version 1.0
     */
    
    public void listarPrestamos(){
        System.out.println("Préstamos de "+this.getTITULO()+"\n");
        for (Object l : listaPrestamos) {
            System.out.println(l);
        }
        System.out.println("");
    }
    
    /**
     * Método para imprimir los datos de una instancia de la clase Libro.
     * @return Un string con los datos del libro y con todos los datos heredados de las
     * clases padre.
     * @version 1.0
     */
    
    @Override
    public String datos() {
        return prestado ? super.datos()+"\nAutor: "+AUTOR+"\nEn la biblioteca: No":super.datos()+"\nAutor: "+AUTOR+"\nEn la biblioteca: Sí";
    }
    
}
