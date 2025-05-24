package menu;

import tajetas.TarjetaCredito;

import java.util.Scanner;

public class MenuSeccion  {
    private int opcion;
    private boolean bandera;
    Scanner teclado = new Scanner(System.in);
    TarjetaCredito tarjetaCredito = new TarjetaCredito();

    public void menu2 (){
        System.out.printf( """
                1 Targeta de credito
                2 Tarjeta de debito
                3 Comprar
                
                """);
        opcion =teclado.nextInt();
        if (opcion ==1){
            System.out.printf("Cupo total: " + tarjetaCredito.getCupo() );
            System.out.printf("Cupu utilizado: " + tarjetaCredito.getCupoUsado());
            System.out.printf("Cupo disponible: " + (tarjetaCredito.getCupo()-tarjetaCredito.getCupoUsado()));
        }
    }
}
