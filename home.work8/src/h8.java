import java.util.Scanner;
import javax.swing.JOptionPane;
public class h8
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        String emp_name,response;

      emp_name=JOptionPane.showInputDialog("Enter The Employee Name");

        response=JOptionPane.showInputDialog("How Much Is Paid To Employee Per Hour");
        double total,salary=Double.parseDouble(response);

       response= JOptionPane.showInputDialog("How Many Hours The Employee  Work In Last Week?");
        int hours=Integer.parseInt(response);

        total=salary*hours;
        if (hours>40)
        {
            JOptionPane.showMessageDialog
                    (
                    null,"Employee Name: "+emp_name+"\n"
                    +"The Salary= "+total*1.5d+"\n");
        }

        else

            JOptionPane.showMessageDialog
                    (
                            null,"Employee Name: "+emp_name+"\n"
                                    +"The Salary= "+total+"\n");

    }
}
