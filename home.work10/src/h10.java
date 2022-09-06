import java.util.Scanner;
public class h10
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int month;
        System.out.println("Enter The Number Of The Month");
        month=input.nextInt();

        if (month>=1||month<=12)
        {
            if (month==4||month==6||month==9||month==11)
            {
                System.out.println("There Is 30 Day IN This Month");
            }
            else if (month==1||month==3||month==5||month==7||month==8||month==10||month==12)
            {
                System.out.println("There Is 31 Day In This Month");
            }
            else System.out.println("There Is 28 or 29 Day In This Month");
        }
        else System.out.println("Fault Input,Try Again");
    }
}
