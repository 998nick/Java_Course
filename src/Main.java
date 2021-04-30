import java.util.Locale;

public class Main {
        public static void main (String[] args)  {
            int y = 32;
            double x = 10.3594;
            String nome = "Maria";
            int idade = 30;
            double salario = 4000.0;

            System.out.printf("%.2f%n", x);
            Locale.setDefault(Locale.US);
            System.out.printf("%.2f%n", x);

            System.out.println(y);
            System.out.println("Resultado: " + x + " metros");
            System.out.printf("Resultado: " + "%.2f metros%n", x);

            System.out.printf("%s tem %d anos e ganha R$ %.2f reais %n", nome, idade, salario);
        }
    }

