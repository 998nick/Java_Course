package Exercises;

import java.util.Scanner;

public class ExerciseFor2 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int in = 0;
            int out = 0;

            for(int i=1; i<=n; i++) {
                int x = sc.nextInt();

                if(x >= 10 && x <= 20) {
                    in++;
                }else{
                    out++;
                }
            }
            System.out.println(in + " in");
            System.out.println(out + " out");

        }
    }

