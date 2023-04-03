import java.util.*;
public class Quadratic {
    public static void main(String[] args) {
        double a,b,c,d,r1,r2,x,y;
        System.out.println("Enter the Coeffecints of a,b,c");
        Scanner s = new Scanner(System.in);
        a= s.nextDouble();
        b= s.nextDouble();
        c = s.nextDouble();
        d = (b*b)-(4*a*c);


        if(d==0){
            System.out.println("The Roots are real & Equal");
            r1=r2=(-b/2*a);
            System.out.println("R1="+r1);
            System.out.println("R2="+r2);
        }

        else if(d>0){
            System.out.println("The Roots are Real & Distinct");
            r1= -b-Math.sqrt(d/2*a);
            r2= -b+Math.sqrt(d/2*a);
            System.out.println("R1="+r1);
            System.out.println("R2="+r2);

        }

        else{
            System.out.println("The Roots are Imaginary & Distinct");
            x=(-b/2*a);
            y= Math.sqrt(-d/2*a);
            System.out.println("The Roots are");
            System.out.println((-b/2*a)+"+i"+Math.sqrt(-d));
            System.out.println((-b/2*a)+"-i"+Math.sqrt(-d));


        }
    }
}
