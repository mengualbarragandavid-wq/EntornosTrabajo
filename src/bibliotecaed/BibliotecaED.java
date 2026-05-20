/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bibliotecaed;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Alejandro Ramirez Nieves
 */
public class BibliotecaED {
    
    public static void main(String[] args) {
        
        ArrayList<Publicacion> publicaciones = new ArrayList<>();
        ArrayList<Socio> socios = new ArrayList<>();
        boolean continuar = true;
        int opcion, opcion2, opcion3;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        CD c1 = new CD("VOYAGE", 2020, "20102", 60, "ABBA", 20);
        CD c2 = new CD("POWER UP", 2006, "49092", 45, "AC/DC", 15);
        
        Revista r1 = new Revista("Hola", 2026, "10210", 20, 12340);
        Revista r2 = new Revista("Marca", 2022, "30810", 15, 19083);
        
        Libro l1 = new Libro("Murdoku", 2026, "56789", 98, "Manuel Garand");
        Libro l2 = new Libro("Las 48 leyes del poder", 2012, "35629", 550, "Robert Greene");
        
        Pelicula p1 = new Pelicula("Interstellar", 2014, "10923", 102, "Christopher Nolan");
        Pelicula p2 = new Pelicula("Los intocables de Elliot Ness", 1987, "29943", 96, "Brian De Palma");
        
        Socio s1= new Socio("31783351H", "Roberto Margallo");
        Socio s2= new Socio("41393321L", "Alejandro Costas");

        publicaciones.add(l1);
        publicaciones.add(l2);
        publicaciones.add(r1);
        publicaciones.add(r2);
        publicaciones.add(p1);
        publicaciones.add(p2);
        publicaciones.add(c1);
        publicaciones.add(c2);
        
        socios.add(s1);
        socios.add(s2);
        
        System.out.println("<Bienvenido al programa de gestión de bibliotecas EDBiblio>\n");
        
        do {            
            
            System.out.println("Escoja una opción: ");
            System.out.println("1) Listar publicaciones");
            System.out.println("2) Listar socios");
            System.out.println("3) Consultar préstamos");
            System.out.println("4) Préstamos");
            System.out.println("5) Devoluciones");
            System.out.println("6) Salir");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1 -> {
                    for (Publicacion p : publicaciones) {
                        System.out.println(p.datos());
                        System.out.println("");
                    }
                }
                
                case 2 -> {
                    for (Socio s : socios) {
                        System.out.println(s.datos());
                        System.out.println("");
                    }
                }
                
                case 3 -> {
                    System.out.println("Listar préstamos para...");
                    System.out.println("1) Una publicación");
                    System.out.println("2) Un socio");
                    opcion2 = sc.nextInt();
                    
                    switch (opcion2) {
                        case 1 -> {
                            l1.listarPrestamos();
                            l2.listarPrestamos();
                            p1.listarPrestamos();
                            p2.listarPrestamos();
                        }
                        
                        case 2 -> {
                            s1.listarPrestamos();
                            s2.listarPrestamos();
                        }
                    }
                    
                }
                
                case 4 -> {
                    System.out.println("¿Qué publicación desea retirar?");
                    System.out.println("1) Murdoku");
                    System.out.println("2) Las 48 leyes del poder");
                    System.out.println("3) Interstellar");
                    System.out.println("4) Los intocables de Elliot Ness");
                    opcion2 = sc.nextInt();
                    
                    switch (opcion2) {
                        case 1 -> {
                            System.out.println("¿Quién lo retira?");
                            System.out.println("1) Roberto Margallo");
                            System.out.println("2) Alejandro Costas");
                            opcion3 = sc.nextInt();
                            
                            switch (opcion3) {
                                case 1 -> {
                                    l1.presta(s1);
                                }
                                
                                case 2 -> {
                                    l1.presta(s2);
                                }
                            }
                            
                        }
                        
                        case 2 -> {
                            System.out.println("¿Quién lo retira?");
                            System.out.println("1) Roberto Margallo");
                            System.out.println("2) Alejandro Costas");
                            opcion3 = sc.nextInt();
                            
                            switch (opcion3) {
                                case 1 -> {
                                    l2.presta(s1);
                                }
                                
                                case 2 -> {
                                    l2.presta(s2);
                                }
                            }
                            
                        }
                        
                        case 3 -> {
                            System.out.println("¿Quién lo retira?");
                            System.out.println("1) Roberto Margallo");
                            System.out.println("2) Alejandro Costas");
                            opcion3 = sc.nextInt();
                            
                            switch (opcion3) {
                                case 1 -> {
                                    p1.presta(s1);
                                }
                                
                                case 2 -> {
                                    p1.presta(s2);
                                }
                            }
                            
                        }
                        
                        case 4 -> {
                            System.out.println("¿Quién lo retira?");
                            System.out.println("1) Roberto Margallo");
                            System.out.println("2) Alejandro Costas");
                            opcion3 = sc.nextInt();
                            
                            switch (opcion3) {
                                case 1 -> {
                                    p2.presta(s1);
                                }
                                
                                case 2 -> {
                                    p2.presta(s2);
                                }
                            }
                            
                        }
                       
                    }
                    
                }
                
                case 5 -> {
                    System.out.println("¿Qué publicación desea devolver?");
                    System.out.println("1) Murdoku");
                    System.out.println("2) Las 48 leyes del poder");
                    System.out.println("3) Interstellar");
                    System.out.println("4) Los intocables de Elliot Ness");
                    opcion2 = sc.nextInt();
                    
                    switch (opcion2) {
                        case 1 -> {
                            System.out.println("¿Quién la devuelve?");
                            System.out.println("1) Roberto Margallo");
                            System.out.println("2) Alejandro Costas");
                            opcion3 = sc.nextInt();
                            
                            switch (opcion3) {
                                case 1 -> {
                                    l1.devuelve(s1);
                                }
                                
                                case 2 -> {
                                    l1.devuelve(s2);
                                }
                            }
                            
                        }
                        
                        case 2 -> {
                            System.out.println("¿Quién la devuelve?");
                            System.out.println("1) Roberto Margallo");
                            System.out.println("2) Alejandro Costas");
                            opcion3 = sc.nextInt();
                            
                            switch (opcion3) {
                                case 1 -> {
                                    l2.devuelve(s1);
                                }
                                
                                case 2 -> {
                                    l2.devuelve(s2);
                                }
                            }
                            
                        }
                        
                        case 3 -> {
                            System.out.println("¿Quién la devuelve?");
                            System.out.println("1) Roberto Margallo");
                            System.out.println("2) Alejandro Costas");
                            opcion3 = sc.nextInt();
                            
                            switch (opcion3) {
                                case 1 -> {
                                    p1.devuelve(s1);
                                }
                                
                                case 2 -> {
                                    p1.devuelve(s2);
                                }
                            }
                            
                        }
                        
                        case 4 -> {
                            System.out.println("¿Quién la devuelve?");
                            System.out.println("1) Roberto Margallo");
                            System.out.println("2) Alejandro Costas");
                            opcion3 = sc.nextInt();
                            
                            switch (opcion3) {
                                case 1 -> {
                                    p2.devuelve(s1);
                                }
                                
                                case 2 -> {
                                    p2.devuelve(s2);
                                }
                            }
                            
                        }
                       
                    }
                }
                
                case 6 -> {
                    continuar = false;
                }                
            }
            
        } while (continuar);

    }
    
}
