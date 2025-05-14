

import java.util.Scanner;

public class Principal {


    public static void main(String[] args) {
        Scanner eso = new Scanner(System.in);

        ConsultarMoneda consulta = new ConsultarMoneda();
        int opcion = 0;
        while(opcion != 7) {
            System.out.println("------------------------------\n"+
                    "Bienvenido al conversor de moneda \n\n" +
                    "1) Dolar a peso Argentino\n" +
                    "2) Peso argentino a Dolar\n" +
                    "3) Dolar a real Brasilera\n" +
                    "4) Real Brasileño a Dolar\n" +
                    "5) Dolar a Peso Colombiano\n" +
                    "6) Peso Colombiano a Dolar\n" +
                    "7) salir \n" + "Eliga una opcion validad:\n" + "----------------------------");

            opcion= eso.nextInt();
            eso.nextLine();

            switch (opcion) {
                case 1:
                    ConvertidordeMoneda.convertir( "USD","ARS", consulta ,eso );

                case 2:
                    ConvertidordeMoneda.convertir( "ARS", "USD", consulta ,eso );
                    break;
                case 3:
                    ConvertidordeMoneda.convertir( "USD", "BRL", consulta ,eso );
                    break;
                case 4:
                    ConvertidordeMoneda.convertir( "BRL", "USD", consulta ,eso );
                    break;
                case 5:
                    ConvertidordeMoneda.convertir( "USD", "COP", consulta ,eso );
                    break;
                case 6:
                    ConvertidordeMoneda.convertir( "COP", "USD", consulta ,eso );
                    break;
                case 7:
                    System.out.println("Salir");
                    break;


            }


        }
    }


    }



