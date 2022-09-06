import java.util.Scanner;

public class h4
{
    public static void main(String[] args)
    {
        int number=0,counter=0;
        Scanner input=new Scanner(System.in);

        System.out.println("Enter A Number");
        number=input.nextInt();
        System.out.println("The Number Is: "+number);
      while (number!=0)
      {
         number/=10;
         counter++;
      }
        System.out.println("The Digit of The Number= "+counter);
      }
}
