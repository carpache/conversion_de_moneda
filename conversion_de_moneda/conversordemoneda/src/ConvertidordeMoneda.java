import java.util.Scanner;

public class ConvertidordeMoneda {

    public static void convertir (String base_code, String target_code, ConsultarMoneda consulta, Scanner eso) {
        double cantidad;
        double cantidadConvertida;

        Monedas monedas = consulta.buscarMoneda( base_code, target_code );
        System.out.println( "Ingrese el valor que desea convertir :" );
        cantidad = Double.parseDouble( eso.nextLine() );
        cantidadConvertida = cantidad * monedas.conversion_rate();
        System.out.println( "El valor " +cantidad +" "+ base_code+" " + "corresponde al valor final de " + cantidadConvertida);




    }
    }