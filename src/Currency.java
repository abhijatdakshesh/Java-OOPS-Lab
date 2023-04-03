import java.util.*;

public class Currency {
    double inr,usd;
    double euro,yen;
    Scanner in= new Scanner(System.in);
    public void dollartorupee()
    {
        System.out.println("Enter the dollar amount to be converted:");
        usd = in.nextInt();
        inr = usd*81.33;
        System.out.println("Dollar ="+usd+"Equal to inr="+inr);

    }
    public void rupeetodollar()
    {
        System.out.println("Enter rupees to convert it into dollar ");
        inr = in.nextInt();
        usd = inr/81.33;
        System.out.println("INR="+inr+"Equal to usd="+ usd);
    }

    public void rupeetoeuro()
    {
        System.out.println("Enter rupees to convert it into dollar ");
        inr = in.nextInt();
        euro = inr * 81.33;
        System.out.println("INR=" + inr + "Equal to euro=" + euro);
    }

    public void eurotorupee()
    {
        System.out.println("Enter rupees to convert it into dollar ");

        euro= in.nextInt();
        inr = inr/81.33;
        System.out.println("Euro=" + euro + "Equal to inr=" + inr);
    }

}
