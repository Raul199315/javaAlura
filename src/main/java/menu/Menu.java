package menu;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import menu.UsuariosRegistrados;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private Scanner teclado = new Scanner(System.in);
    private boolean bandera = true;
    private List<UsuariosRegistrados> usuarios = new ArrayList<>();

    public void menu() {
        String archivo = "usuariosRegistrados.json";
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // **Leer JSON existente**
        try (Reader reader = new FileReader(archivo)) {
            usuarios = gson.fromJson(reader, new TypeToken<List<UsuariosRegistrados>>() {}.getType());
            if (usuarios == null) { // Si la lectura devuelve null, inicializar la lista
                usuarios = new ArrayList<>();
            }
        } catch (IOException e) {
            System.out.println("Archivo JSON no encontrado, se creará uno nuevo.");
            usuarios = new ArrayList<>(); // Asegurarse de que la lista esté inicializada
        }

        while (bandera) {
            System.out.printf("""
                Bienvenidos a SuTienda
                
                1. Iniciar Sesión
                2. Registrarse
                3. Ver productos
                4. Salir
                
                Selecciona una opción válida:
                """);

            int opcion = teclado.nextInt();
            teclado.nextLine(); // Limpiar buffer

            if (opcion == 1) {
                iniciarSesion();
            } else if (opcion == 2) {
                registrarUsuario();
            } else if (opcion == 3) {
                verUsuarios();
            } else if (opcion == 4) {
                guardarUsuarios(archivo, gson);
                bandera = false;
                System.out.println("Saliendo...");
            }
        }
    }

    private void iniciarSesion() {
        System.out.println("Ingrese su cédula:");
        int cc = teclado.nextInt();
        System.out.println("Ingrese su clave:");
        int cl = teclado.nextInt();

        for (UsuariosRegistrados usuario : usuarios) {
            if (usuario.getCedula() == cc && usuario.getClaveNumerica() == cl) {
                System.out.println("Inicio de sesión exitoso. Bienvenido, " + usuario.getNombre());
                return;
            }
        }
        System.out.println("Credenciales incorrectas.");
    }

    private void registrarUsuario() {
        System.out.println("Ingrese su nombre:");
        String nombre = teclado.next();
        System.out.println("Ingrese su apellido:");
        String apellido = teclado.next();
        System.out.println("Ingrese su número de cédula:");
        int numeroDeCedula = teclado.nextInt();
        System.out.println("Ingrese su nueva contraseña:");
        int clave = teclado.nextInt();
        String fecha = String.valueOf(LocalDate.now());



        usuarios.add(new UsuariosRegistrados(nombre, apellido, numeroDeCedula, clave,fecha));
        System.out.println("Registro exitoso.");
    }

    private void verUsuarios() {
        System.out.println("Usuarios registrados:");
        for (UsuariosRegistrados usuario : usuarios) {
            System.out.println(usuario.getNombre() + " " + usuario.getApellido() + " - CC: " + usuario.getCedula());
        }
    }

    private void guardarUsuarios(String archivo, Gson gson) {
        try (FileWriter writer = new FileWriter(archivo)) {
            gson.toJson(usuarios, writer);
            System.out.println("Datos guardados correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}