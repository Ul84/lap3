public class h1
{
    public static void main(String[] args)
    {
        {
            //A;
            int n=1;
            int m=-1;
            if (n<-m)
            {
                System.out.println("A.n= "+n);
            }

            else
            {
                System.out.println("A.M= "+m);
            }
        }

        {
            //B;
            int n=1;
            int m=-1;
            if (-n<=m)
            {
                System.out.println("B.N= "+n);
            }

            else
            {
                System.out.println("B.M= "+m);
            }
        }

        {
            //C;
         double x=0;
         double y=1;
         if (Math.abs(x-y)<1)
         {
             System.out.println("C.X= "+x);
         }
         else {
             System.out.println("C.Y= "+y);
              }
        }

        {
            //D;
            double x=Math.sqrt(2);
            double y=2;
            if (x*x==y)
            {
                System.out.println("D.X= "+x);
            }
            else System.out.println("D.Y= "+y);
        }


    }
}
