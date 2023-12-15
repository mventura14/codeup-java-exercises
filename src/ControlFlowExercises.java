import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        while (i <= 15) {
            System.out.println(i);
            i++;

        }
        ;

        System.out.println("-- 1.2.1 --");
        i = 0;
        do {
            System.out.println(i);
            i += 2;

        } while (i <= 100);

        System.out.println("-- 1.2.2 --");
        long ii = 2;
        do {
            System.out.println(ii);
            ii -= 5;
        } while (ii >= -10);

        System.out.println("-- 1.2.3 --");
        ii = 2;
        do {
            System.out.println(ii);
            ii *= ii;
        } while (ii < 1000000);

        System.out.println("-- 1.3.1");
        for (i = 100; i >= -10; i -= 5) {
            System.out.println(i);
        }
        ;

        System.out.println("-- 1.3.2 --");
        for (long iii = 2; iii < 1000000; iii *= iii) {
            System.out.println(iii);
        }

        System.out.println("-- Fizz Buzz --");
        for (int num = 0; num <= 100; num++) {
            if (num != 0) {
                if (num % 5 == 0 && num % 3 == 0) {
                    System.out.println("fizzbuzz");
                } else if (num % 5 == 0) {
                    System.out.println("Buzz");
                } else if (num % 3 == 0) {
                    System.out.println("Fizz");
                } else {
                    System.out.println(num);
                }
            } else {
                System.out.println(num);
            }

        }


        System.out.println("-- 3 --");
        Scanner sc = new Scanner(System.in);
        System.out.print("What number would you like to go up to? ");
        int userNum = sc.nextInt();
        System.out.println("Here is your table!");
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");
        i = 1;
        do {
            System.out.printf("%-7d      | %-7d        | %d %n", i, i * i, i * i * i);
            i++;
        } while (i <= userNum);

        System.out.println("-- 4 --");

        System.out.print("input student grade: ");
        int grade = sc.nextInt();
        System.out.println("Continue? [y/n]");
        String userCont = sc.next();
        while (!userCont.equalsIgnoreCase("y")) {
            userCont = sc.next();
        }
        if (grade <= 100 && grade >= 88) {
            System.out.println("Grade is an: A");
        } else if (grade <= 87 && grade >= 80) {
            System.out.println("Grade is a: B");
        } else if (grade <= 79 && grade >= 67) {
            System.out.println("grade is a: C");
        } else if (grade <= 66 && grade >= 60) {
            System.out.println("Grade is a: D");
        } else if (grade <= 59 && grade >= 0) {
            System.out.println("Grade is a: F");
        }

    }
}

