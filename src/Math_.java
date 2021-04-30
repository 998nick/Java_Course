public class Math_ {

        public static void main(String[] args) {
            double a = 3.0;
            double b = 4.0;
            double c = -5.0;
            double X,Y,Z;

            X = Math.sqrt(a);
            Y = Math.sqrt(b);
            Z = Math.sqrt(25.0);

            System.out.println("Raiz quadrada de " + a + " = " + X);
            System.out.println("Raiz quadrada de " + b + " = " + Y);
            System.out.println("Raiz quadrada de  25 é " + Z);

            X = Math.pow(a, b);
            Y = Math.pow(a, 2.0);
            Z = Math.pow(5.0, 2.0);

            System.out.println(a + " elevado a " + b + " = " + X);
            System.out.println(a + " elevado ao quadrado = " + Y);
            System.out.println("Cinco elevado ao quadrado é = " + Z);

            X = Math.abs(b);
            Y = Math.abs(c);

            System.out.println("O valor absoluto de  " + b + " = " + X);
            System.out.println("O valor absoluto de " + c + " = " + Y);
        }
    }

