package jjs.java_seminar.exercise_20140513_08;

public class Exercise10 {

    public static void main(String[] args) {

        for (int i = 1; i <= 30; i++) {

            if (i % 3 != 0 && i % 5 != 0) {

                System.out.println(i);

            } else if (i % 3 == 0 && i % 5 == 0) {

                System.out.println("FizzBuzz");

            } else if (i % 3 == 0) {

                System.out.println("Fizz");

            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            }

        }
    }

}
