import java.util.Scanner;

public class Cacluclator
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter valid Number : ");
        int a = scanner.nextInt();
        System.out.println("Please Enter valid Character : ");
        char Sym = scanner.next().charAt(0);
        System.out.println("Please Enter Second Digit : ");
        int b = scanner.nextInt();

        if(Sym =='+')
        {
            System.out.println("The addition of "+a+" + "+b+" = "+(a+b));
        } else
        if(Sym=='-')
        {
            System.out.println("The Subtraction of "+a+" - "+b+" = "+(a-b));
        } else
            if (Sym=='/') {
                System.out.println("The division of "+a+" / "+b+" = "+(a/b));
            } else
                if(Sym=='*')
                {
                    System.out.println("The Multiplication of "+a+" x "+b+" = "+(a*b));
                } else
                {
                    System.out.println("Please Enter The Valid Character..");
                }

    }



}
