package practica;

import menu.UsuariosRegistrados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Stream {
    private String nombre;
    private int opcion;
    private String letra;
    private boolean bandera = true;
    private boolean bandera1 = true;
    Scanner teclado = new Scanner(System.in);
    Scanner teclado1 = new Scanner(System.in);
    Scanner teclado2 = new Scanner(System.in);
    private List<String> usuariosRegistrados = new ArrayList<>();
    private List<String> usuariosSeleccionados = new ArrayList<>();

    public void setUsuariosRegistrados(String nombre) {
       usuariosRegistrados.add(nombre);
    }

    public void setUsuariosSelccionados(String nombre) {
        usuariosSeleccionados.add(nombre);
    }

    public void menu(){
        while (bandera){

            System.out.println("""
                1 Agregar nombres
                2 Filtrar nombre por primera letra (filter)
                3 Mostrar nombres agregados
                4 Cambiar elementos con letra ? a Mayusculas
                5 Mostrar seleccionados
                7Agregar elementos que Empiecen con la letra "" a la lista seleccionados
                9 Salir
                Ingrese la opcion deseada
                """);
            opcion = teclado.nextInt();
            switch (opcion){
                case 1:{
                    while (bandera1){
                        System.out.println("Ingrese un nombre para agregar ");
                        nombre = teclado1.nextLine();
                        if (nombre.equalsIgnoreCase("salir")){
                            bandera1= false;
                        }else {
                            setUsuariosRegistrados(nombre);
                            System.out.println("Se Agrego: " + nombre + " a la lista");
                        }
                        System.out.println("*********************************************");


                    }
                    break;
                }
                case 2:{

                    System.out.println("Ingrse la primera letra de los nombres que desea buscar");
                    letra = teclado2.nextLine();
                    System.out.println("Nombres que empiezan por la letra: " + letra);
                    /// En este caso usaremos una funcion lambda
                    usuariosRegistrados.stream()
                            ///  filtramos solo los nombres en la lista de usuariosRegistrados con la letra
                            /// agregada en la variable letra
                            .filter( e -> e.startsWith(letra))
                            /// Y mostrasmos los nombres filtrados
                            .forEach(System.out::println);
                    System.out.println("**********************************************");
                    break;
                }
                case 3:{
                  usuariosRegistrados.forEach(System.out::println);
                    System.out.println("*********************************************");
                  break;
                }
                case 4:{
                    System.out.println("Ingrse la primera letra de los nombres que desea buscar");
                    letra = teclado2.nextLine();
                    System.out.println("Nombres que empiezan por la letra: " + letra);
                    /// En este caso usaremos una funcion lambda
                    usuariosRegistrados.stream()
                            ///  filtramos solo los nombres en la lista de usuariosRegistrados con la letra
                            /// agregada en la variable letra
                            .filter( e -> e.startsWith(letra))
                            .map( e -> e.toUpperCase())
                            .forEach(System.out::println);
                    System.out.println("*******************************************");

                    break;
                }
                case 9:{
                    bandera = false;
                    System.out.println("Saliendo........................");
                    break;
                }
        }

        }

    }

}
