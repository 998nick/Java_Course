package application;
import entities.ProductConst;
import java.util.Locale;
import java.util.Scanner;

public class Constructor {


        public static void main(String[] args) {

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter product data: ");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            ProductConst productC = new ProductConst(name, price);

            productC.setName("Computer");
            System.out.println("Updated name: " + productC.getName());
            productC.setPrice(1200.00);
            System.out.println("Updated name: " + productC.getPrice());


            System.out.println();
            System.out.println("Product data: " + productC);

            System.out.println();
            System.out.print("Enter the number of products to be added in stock: ");
            int quantity = sc.nextInt();
            productC.addProducts(quantity);

            System.out.println();
            System.out.println("Updated data: " + productC);

            System.out.println();
            System.out.print("Enter the number of products to be removed from stock: ");
            quantity = sc.nextInt();
            productC.removeProducts(quantity);

            System.out.println();
            System.out.print("Updated data: " + productC);


            sc.close();
        }
    }

