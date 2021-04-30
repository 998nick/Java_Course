import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lists {

        public static void main(String[] args) {

            List<String> list = new ArrayList<>();

            list.add("Maria");
            list.add("Joao");
            list.add("Ana");
            list.add("Felipe");
            list.add(2, "Marco");
            list.add("Rafael");
            list.add("Carlos");


            System.out.println(list.size());

            list.remove(1);
            list.removeIf(x -> x.charAt(0) == 'M');

            System.out.println(list.indexOf("Marco"));

            List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());


            for(String x : result) {
                System.out.println(x);
            }

            String name = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);


            for(String x : list) {
                System.out.println(x);
            }



        }
 }
