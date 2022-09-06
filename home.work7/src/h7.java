import java.util.Scanner;

public class h7
{
    public static void main(String[] args)
    {
        double num1,num2,num3;
        Scanner input=new Scanner(System.in);

        System.out.println("Input 1st Number");
        num1=input.nextDouble();
        System.out.println("Input The 2nd number");
        num2=input.nextDouble();
        System.out.println("Input The 3rd number");
        num3=input.nextDouble();

        if ((num1<num2&&num2<num3)||(num1>num2&&num2>num3))
        {
            System.out.println("in order");
        }
        else if (num1==num2&&num2==num3)
        {
            System.out.println("1st and 2nd and 3ed is equal");
        }
        else
        {
            System.out.println("not in order");
        }
    }
}
