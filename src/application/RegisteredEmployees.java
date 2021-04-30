package application;
import entities.RgEmployees;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class RegisteredEmployees {

        public static void main(String[] args) {

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);


            List<RgEmployees> list = new ArrayList<>();

            System.out.print("How many employees will be registered? ");
            int N = sc.nextInt();

            for(int i = 0; i<N; i++){
                System.out.println();
                System.out.println("Employee #" + (i + 1) + ":");
                System.out.print("Id: ");
                Integer id = sc.nextInt();

                while(hasId(list, id)) {
                    System.out.println("Id already taken! Try a new one: ");
                    System.out.print("Id: ");
                    id = sc.nextInt();
                }

                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Salary: ");
                Double salary = sc.nextDouble();

                RgEmployees emp = new RgEmployees(id, name, salary);

                list.add(emp);

            }


            System.out.println();
            System.out.print("Enter the employee id that will have salary increase: ");
            int idSalary = sc.nextInt();

            RgEmployees emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);

            //Integer pos = position(list, idSalary);

            if(emp == null) {
                System.out.println("This id does not exist");
            }else {
                System.out.print("Enter the porcentage: ");
                double percent = sc.nextDouble();
                emp.increaseSalary(percent);
            }

            System.out.println();
            System.out.println("List of employees: ");
            for(RgEmployees i : list) {
                System.out.println(i);
            }


            sc.close();
        }

        public static Integer position(List<RgEmployees> list, int id) {
            for(int i = 0; i< list.size(); i++) {
                if(list.get(i).getId() == id) {
                    return i;
                }
            }
            return null;
        }

        public static boolean hasId(List<RgEmployees> list, int id) {
            RgEmployees emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
            return emp != null;
        }
    }
