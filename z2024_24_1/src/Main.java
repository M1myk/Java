import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


    public static void checkAge(int age)
    {
        if(age < 18)
        {
            throw new IllegalArgumentException("Age must be at least 18");
        }

        System.out.println(age);


    }

    public static void iloraz()
    {
        Scanner sc = new Scanner(System.in);

        boolean valid = false;


        while(!valid)
        {
            System.out.print("Enter age: ");
            try
            {
                int age2 = sc.nextInt();
            }
            catch(InputMismatchException e)
            {
                System.out.println("Invalid input");

            }



        }




        try
        {
            if(age2 == 0)
            {
                throw new ArithmeticException("Podaj liczbe calkowita");
            }
            else
            {
                double result = (double)age1/age2;
                System.out.println(result);
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        catch(InputMismatchException e)
        {
            System.out.println("Podaj lioczbe czlkowita");
        }







    }

    public static void main(String[] args) {
        int[] ages = {17,25,11,19,18};
        for(int age:ages)
        {
           try
           {
               checkAge(age);
           }
           catch(IllegalArgumentException e){
               {
                   System.out.println("BLag age = " + e.getMessage());
               }

           }
        }




    }
}