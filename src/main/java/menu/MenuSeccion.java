package menu;

import java.util.Scanner;

public class MenuSeccion  {
    private int opcion;
    private boolean bandera;
    Scanner teclado = new Scanner(System.in);

    Menu menu = new Menu();

    public void menu2 (){
        System.out.printf( """
                1 Targeta de credito
                2 Tarjeta de debito
                3 Comprar
                
                """);
        opcion =teclado.nextInt();
        if (opcion ==1){

        }
    }
}
