import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PairConversion pairConversion = new PairConversion();

        int out = 1;
        while(out != 2){
            System.out.println("Bienvenido al conversor de monedas");
            System.out.println("""
        ¿Qué conversión deseas hacer?
            1.- Dólar (USD) a Euro (EUR)
            2.- Euro (EUR) a Dólar (USD)
            3.- Yen Japonés (JPY) a Dólar (USD)
            4.- Dólar (USD) a Libra Esterlina (GBP)
            5.- Dólar (USD) a Dólar Canadiense (CAD)
            6.- Peso Mexicano (MXN) a Dólar (USD)
        """);

//            7.- Dólar (USD) a Dólar Australiano (AUD)
//            8.- Dólar (USD) a Yuan Chino (CNY)
//            9.- Dólar (USD) a Franco Suizo (CHF)
//            10.- Dólar (USD) a Peso Argentino (ARS)
        System.out.println("Ingresa la opción: ");
        int answer;
        try {
            answer = input.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Opción inválida. Intenta de nuevo");
            input.nextLine();
            continue;
        }
            String base_code="";
            String target_code="";
            float amount;

            switch (answer){
                case 1:
                    System.out.println("Conversión Dólar (USD) a Euro (EUR)");
                    base_code ="USD";
                    target_code = "EUR";
                    break;
                case 2:
                    System.out.println("Conversión Euro (EUR) a Dólar (USD)");
                    base_code="EUR";
                    target_code="USD";
                    break;
                case 3:
                    System.out.println("Yen Japonés (JPY) a Dólar (USD) ");
                    base_code = "JPY";
                    target_code="USD";
                    break;
                case 4:
                    System.out.println("Conversión Dólar (USD) a Libra Esterlina (GBP)");
                    base_code = "USD";
                    target_code="GBP";
                    break;
                case 5:
                    System.out.println("Conversión Dólar (USD) a Dólar Canadiense (CAD)");
                    base_code="USD";
                    target_code="CAD";
                    break;
                case 6:
                    System.out.println("Conversión Peso Mexicano (MXN) a Dólar (USD)");
                    base_code = "MXN";
                    target_code="USD";
                    break;
                default:
                    System.out.println("Opción inválida");
                    continue; // Salta lo que viene, regresa al inicio del while
            }
        System.out.println("¿Qué cantidad deseas convertir?");

            try {
                amount = input.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println("Debes ingresar un número válido. Intenta de nuevo");
                input.nextLine();
                continue;

            }

            Coin result = pairConversion.conversion(base_code, target_code, amount);
        System.out.println("Resultado: " + result.conversion_result());


            System.out.println("¿Deseas hacer otra conversión? 1: Sí, 2: No");
            out = input.nextInt();

        }

        if (out == 2){
            System.out.println("Gracias por usar el conversor.");
        }
    }
}
