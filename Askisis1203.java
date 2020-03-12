
import java.util.Scanner;

public class Askisis1203 {

    public static void main(String[] args) {
        /*
        Write a Java program to print the result of the following operations for x = 1 and y =2. After every operation print the result of the whole operation, x and y.
a. -x + x++ * 2
b. (x++ + --y) + --y
c. x + x
At the end, after all the operations print the values of x and y. 
         */
        byte x = 1;
        byte y = 2;
        byte a = (byte) (-x + x++ * 2);
        System.out.printf("the result of a. operation is: %s%n", a);
        System.out.printf("after a. operation, the result of x is %s and y is %s%n", x, y);
        System.out.println("-----------------");
        x = 1;
        y = 2;
        byte b = (byte) ((x++ + --y) + --y);
        System.out.printf("the result of b. operation is: %s%n", b);
        System.out.printf("after b. operation, the result of x is %s and y is %s%n", x, y);
        System.out.println("-----------------");
        x = 1;
        y = 2;
        byte c = (byte) (x + x);
        System.out.printf("the result of c. operation is: %s%n", c);
        System.out.printf("after c. operation, the result of x is %s and y is %s%n", x, y);
        System.out.println("-----------------");

        x = 1;
        y = 2;
        int d = (int) (-x + x++ * 2) + ((x++ + --y) + --y) + (x + x);
        System.out.printf("after all the operations the values of x is %s and y is %s%n", x, y);

        System.out.println("");
        System.out.println("2.Write a Java program to print the area and perimeter of a rectangle.");
        float width = 5.5f;
        float height = 8.5f;
        float area = width * height;
        float perimeter = 2 * (width + height);
        System.out.printf("The area of rectangle is %s%n", area);
        System.out.printf("The perimeter of rectangle is %s%n", perimeter);
        System.out.println("-----------------");

        System.out.println("");
        System.out.println("3.Write a Java program to convert seconds to hour and minutes.");
        System.out.println("Give seconds");
        Scanner input = new Scanner(System.in);
        float seconds = input.nextFloat();
        float hours = seconds / 3600;
        float minutes = seconds / 60;
        System.out.printf("The %s seconds are %s hours and %s minutes%n", seconds, hours, minutes);
        System.out.println("-----------------");

        System.out.println("");
        System.out.println("4.Write a program to enter names and year of birth of 3 people. Print a message for each person showing his/her details.");
        for (int i = 0; i < 3; i++) {
            System.out.println("Please type a name");
            String name = input.next();
            System.out.println("thank you, now please type his/her year of birth");
            short yearOfBirth = input.nextShort();
            System.out.printf("%s.name:%s ,year of birth:%s%n", i + 1, name, yearOfBirth);
        }

        System.out.println("-----------------");

        System.out.println("");
        System.out.println("5.Write a Java program to convert temperature from Fahrenheit to Celsius degree.");
        System.out.println("Input Fahrenheit degrees");
        double fahrenheit = input.nextDouble();
        double celsius = fahrenheit - 17.77778;
        System.out.printf("for %s Fahrenheit degrees, the Celsius degrees are %s%n", fahrenheit, celsius);

        System.out.println("-----------------");

        System.out.println("");
        System.out.println("5.Write a Java program that reads a number in inches, converts it to meters.");
        System.out.println("Input inches");
        double inches = input.nextDouble();
        double meters = inches / 0.0254;
        System.out.printf("for %s inches, the meters are %s%n", inches, meters);
        System.out.println("-----------------");

        System.out.println("");
        System.out.println("6.Γράψτε ένα πρόγραμμα που δέχεται την τιμή ενός προϊόντος και εμφανίζει σε μηνύματα τη τιμή του σε έκπτωση 10%, 20%, 30%, 40%, 50%, 60%.");
        System.out.println("Input price of a product");
        double price = input.nextDouble();
        for (int discount = 10; discount < 70; discount = discount + 10) {
            double priceWithDiscount = price * discount / 100;
            System.out.printf("The price with %s percent discount is %s%n", discount, priceWithDiscount);
        }

    }

}
