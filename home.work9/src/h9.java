import javax.swing.*;
import java.util.Scanner;

public class h9
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        String response,season;

        response=JOptionPane.showInputDialog("Enter The Number Of The Month");
        int month=Integer.parseInt(response);

        response=JOptionPane.showInputDialog("Enter The Number Of The Day");
        int day=Integer.parseInt(response);

        if (month==1||month==2||month==3)
            season="Wither";
        else if (month==4||month==5||month==6)
              season="Spring";
        else if (month==7||month==8||month==9)
            season="Summer";
        else
            season="Fall";
          if (day>=21&&month==3)
              season="Spring";
        if (day>=21&&month==6)
            season="Summer";
        if (day>=21&&month==9)
            season="Fall";
        if (day>=21&&month==12)
            season="Wither";

        JOptionPane.showMessageDialog(null,"It Is "+season);



    }
}
