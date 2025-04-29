
import java.util.Scanner;

public class ConversorTemperaturaHiago2A {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.println("===Conversor de temperatura===");
            System.out.println("1. Celsius");
            System.out.println("2. Fahrenheit");
            System.out.println("3. Kelvin");
            System.out.println("4. Sair");
            System.out.println("Escolha a unidade de Origem (1-4)");
            int escolha = scanner.nextInt();

            if (escolha == 4) {
                continuar = false;
                continue;
            }
            if (escolha < 1 || escolha > 4) {
                System.out.println("Opcao Invalida");
                continue;
            }
            System.out.println("Digite o valor da temperatura: ");
            double graus = scanner.nextDouble();

            switch (escolha) {
                case 1:
                    celsius celsius = new celsius(graus);
                    System.out.println("******************");
                    System.out.println("Resultado: ");
                    System.out.println("fahrenheit" + celsius.parafahrenheit());
                    System.out.println("Kelvin" + celsius.paraKelvin());
                    System.out.println("*******************");
                    break;
                case 2:
                    fahrenheit f = new fahrenheit(graus);
                    System.out.println("******************");
                    System.out.println("Resultado: ");
                    System.out.println("celsius" + f.paracelsius());
                    System.out.println("Kelvin" + f.paraKelvin());
                    System.out.println("*******************");
                    break;
                case 3:
                    Kelvin k = new Kelvin(graus);
                    System.out.println("******************");
                    System.out.println("Resultado: ");
                    System.out.println("celsius" + k.paracelsius());
                    System.out.println("fahrenheit" + k.parafahrenheit());
                    System.out.println("*******************");
                    break;
            }
        }
        System.out.println("programa encerrado");
        scanner.close();

    }

}
     
     
    

