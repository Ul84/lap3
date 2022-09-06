import java.util.Scanner;

public class h3
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);

        System.out.println("Input A Number: ");
        int num=scan.nextByte();

        if (num>0)
        {
            System.out.println("The Number Is Positive");
        }

        else if (num<0)
        {
            System.out.println("The Number Is Negative");
        }

        else System.out.println("The Number Is Zero ");
    }
}
