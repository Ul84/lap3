import java.util.Scanner;

public class h2
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);

        char L[]=new char[] {'a','c','e','g'};
        System.out.println("input Letter And Number");

        System.out.println("Letter : ");
        char L1=scan.next().charAt(0);

        System.out.println("Number : ");
        byte number=scan.nextByte();

        for (int i=0;i<8;i++)
        {
           if (L1==L[i]&&i<4)
           {
               if (number%2==1)
               {
                   System.out.println("Black");break;
               }


               else System.out.println("White");break;
           }

           else
           {
               if (number%2==1)
               {
                   System.out.println("White");break;
               }
               else
                   System.out.println("Black");break;
           }


        }
    }
}
