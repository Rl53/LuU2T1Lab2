import java.util.Scanner;
public class ChatBotRunner {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        ChatBot debbie = new ChatBot("Debbie", 5);
        System.out.print("Hey there! What is your name: ");
        String name = myScanner.nextLine();
        debbie.greeting(name);
        System.out.println("Are you curious about the weather? Well, sorry. ");
        debbie.weather();
        System.out.println("By the way, I can convert any integer from feet to meters.");
        System.out.print("Enter an amount in feet as an integer and I will convert it to meters. ");
        int feet = myScanner.nextInt();
        System.out.println(feet + " feet is equal to " + debbie.convertFeetToMeters(feet) + " meters.");
        System.out.print("Also, what is your favorite number: ");
        int favNum = myScanner.nextInt();
        debbie.favoriteNumber(favNum);
        System.out.println("I can also add up 3 integers of your choosing.");
        System.out.print("Enter integer 1: ");
        int int1 = myScanner.nextInt();
        System.out.print("Enter integer 2: ");
        int int2 = myScanner.nextInt();
        System.out.print("Enter integer 3: ");
        int int3 = myScanner.nextInt();
        System.out.println("The sum of those numbers is " + debbie.addNumbers(int1,int2,int3));
        System.out.println("I can multiply 3 numbers of your choosing as well.");
        System.out.print("Enter number 1: ");
        double n1 = myScanner.nextDouble();
        System.out.print("Enter number 2: ");
        double n2 = myScanner.nextDouble();
        System.out.print("Enter number 3: ");
        double n3 = myScanner.nextDouble();
        double product = debbie.multiplyNumbers(n1,n2,n3);
        System.out.println("The product of these numbers is " + product);
        debbie.season();
        System.out.println(debbie.goodbye());
    }
}
