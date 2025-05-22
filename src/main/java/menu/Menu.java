package menu;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    ///  variable
    private Scanner teclado = new Scanner(System.in);
    private Scanner teclado1 = new Scanner(System.in);
    private Scanner teclado2 = new Scanner(System.in);
    private Scanner teclado3 = new Scanner(System.in);
    private boolean bandera = true;
    private boolean bandera1 = true;
    private int opcion;
    private String nombre;
    private String apellido;
    private int numeroDeCedula;
    private int clave;
    private List<modelos.UsuariosRegistrados> usuarios = new ArrayList();
    modelos.UsuariosRegistrados agregar= new modelos.UsuariosRegistrados();
    Gson gson = new Gson();
    String json = gson.toJson(usuarios);

    ///  variables validacion de iniicio de seccion
    int cc;
    int cl;

    public void menu (){

        while (bandera){


            System.out.printf("""
                    Bienvenidos a SuTienda
                    
                    1 Iniciar Seccion
                    2 Registrarse
                    3 Ver Productos
                    3 Salir
                    
                    Seleciona una opcion valida
                    """);
            opcion= teclado.nextInt();
            if (opcion==1){
                    while (bandera1) {
                        System.out.printf("Ingresa su cedula");
                        cc = teclado.nextInt();
                        System.out.printf("Ingrese la clave");
                        cl = teclado1.nextInt();

                        if (cl == usuarios.get(0).getClaveNumerica() && cc == usuarios.get(0).getCedula()) {
                            System.out.printf("Incio de Seccion Exitoso BIENVENIDO: " + usuarios.get(0).getNombre());
                            bandera1= false;
                            bandera1= false;
                        }else {
                            System.out.printf("Credenciales incorrectas");
                        }

                    }


            }else if(opcion ==2){
                System.out.printf("Ingrese Su nombre");
                nombre = teclado1.nextLine();
                System.out.printf("Ingrese Su Apellido");
                apellido = teclado2.nextLine();
                System.out.printf("Ingrese Su Numero De CC");
                numeroDeCedula = teclado3.nextInt();
                System.out.printf("Ingrese su nueva Contraseña");
                clave = teclado.nextInt();
                usuarios.add(new modelos.UsuariosRegistrados(nombre,apellido,numeroDeCedula, clave));
                System.out.printf("registro exitoso "+ usuarios.get(0) );




            } else if (opcion == 3) {
                /// escribir o crear el json
                try (FileWriter writer= new FileWriter("usuarioRegistrados.json")){
                    writer.write(json);
                }catch (IOException e) {
                    System.out.printf("Ocurrio un error al crear el json");
                }
                bandera = false;
                System.out.printf("Saliendo.........................");
            }


        }



    }
    public void menuUsuariosRegistrados(){
        
    }

}