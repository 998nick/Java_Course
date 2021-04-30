import java.util.Scanner;

public class FunctionStructure {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter three numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int higher = max(a, b, c);

            showResult(higher);

            sc.close();
        }

        public static int max(int x, int y, int z) {
            int aux;
            if(x > y && y > z) {
                aux = x;
            }
            else if(y > z) {
                aux = y;
            }
            else {
                aux = z;
            }
            return aux;
        }

        public static  void showResult(int value) {    //void pq so imprime uma mensagem, nao retorna nada
            System.out.println("Higher = " + value);
        }

    }


