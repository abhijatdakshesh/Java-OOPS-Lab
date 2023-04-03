import java.util.*;
public class root {
    public static void main(String[] arg)
    {
        double a,b,c,d,r1,r2,x,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a,b,c");
        a=sc.nextDouble();
        b=sc.nextDouble();
        c= sc.nextDouble();
        d= (b*b)-(4*a*c);

        if(d==0)
        {
            System.out.println("Roots are real and equal");
            r1=r2=(-b/2*a);
            System.out.println("R1="+r1);
            System.out.println("R2="+r2);
        }
        else if (d>0) {
            System.out.println("Roots are real and distinct");
            r1=-b-Math.sqrt(d/2*a);
            r2=-b+Math.sqrt(d/2*a);
            System.out.println("R1="+r1);
            System.out.println("R2="+r2);
        }
        else
        {
            System.out.println("Roots are imaginary and Distinct");
            x = -b/(2*a);
            y = Math.sqrt(-d)/(2*a);
            System.out.println("Roots are:");
            System.out.println((-b/2*a)+" +i" + Math.sqrt(-d));
            System.out.println((-b/2*a)+" -i" + Math.sqrt(-d));
        }


    }
}
