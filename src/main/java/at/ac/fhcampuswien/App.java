package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    public static Scanner scanner;

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        // input your solution here
        String robot = "0123456789012345678901" + System.lineSeparator() +
                "         __" + System.lineSeparator() +
                " _(\\    |@@|" + System.lineSeparator() +
                "(__/\\__ \\--/ __" + System.lineSeparator() +
                "   \\___|----|  |   __" + System.lineSeparator() +
                "       \\ }{ /\\ )_ / _\\" + System.lineSeparator() +
                "       /\\__/\\ \\__O (__" + System.lineSeparator() +
                "      (--/\\--)    \\__/" + System.lineSeparator() +
                "      _)(  )(_" + System.lineSeparator() +
                "     `---''---`";
        System.out.println(robot);
    }

    //todo Task 3
    public void sumOfLiterals(){
        char c ='Z';
        int i1 = 0xface, i2 = 012;
        long l = 80L;
        float f1 = 44e-1f, f2 = 5.5f;
        double d1 = 8.88e1, d2 = 99.9;

        int sum = c + i1 + i2 + (int)l + (int)f1 + (int)f2 + (int)d1 + (int)d2;
        System.out.println(sum);
    }

    //todo Task 4
    public void addTwoNumbers(){
        scanner = new Scanner(System.in);
        int a,b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        int sum = a + b;
        System.out.println(sum);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        scanner = new Scanner(System.in);
        int x,y;

        System.out.println("Before Swap:");
        System.out.print("x: ");
        x = scanner.nextInt();
        System.out.print("y: ");
        y = scanner.nextInt();

        // x=4 y=2
        x+=y;       // x=6 y=2
        y = x-y;    // x=6 y=4
        x-=y;       // x=2 y=4

        System.out.println("After Swap:");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        scanner = new Scanner(System.in);
        int n1,n2;

        System.out.print("n1: ");
        n1 = scanner.nextInt();
        System.out.print("n2: ");
        n2 = scanner.nextInt();

        if(n1 > n2){
            System.out.println("n1 > n2");
        } else if(n1 < n2){
            System.out.println("n2 > n1");
        } else{
            System.out.println("n1 == n2");
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        scanner = new Scanner(System.in);
        System.out.print("Enter annual Revenue: ");
        int sales = scanner.nextInt();

        if(sales < 0 || sales >= 100000){
            System.out.println("Invalid Revenue");
        } else if(sales >= 0 && sales < 20000){
            System.out.println("Poor Sales Revenue");
        } else if(sales >= 20000 && sales < 50000){
            System.out.println("Average Sales Revenue");
        } else if(sales >= 50000 && sales < 80000){
            System.out.println("Good Sales Revenue");
        } else if(sales >= 80000 && sales <100000){
            System.out.println("Excellent Sales Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate(){
        scanner = new Scanner(System.in);
        System.out.print("Enter CommissionClass: ");
        int comClass = scanner.nextInt();

        switch(comClass){
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.0");
        }
    }

    //todo Task 9
    public void leapyear(){
        scanner = new Scanner(System.in);
        System.out.print("Year: ");
        int year = scanner.nextInt();
        if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
            System.out.println("Leapyear");
        } else{
            System.out.println("Not a Leapyear");
        }
    }

    //todo Task 10
    public void transposedNumbers(){
        scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();

        int h = number / 100;
        int z = number % 100 / 10;
        int e = number % 100 % 10;

        int reversed = e*100 + z*10 + h;

        System.out.println(reversed);

    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}