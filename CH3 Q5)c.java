import java.util.*;
public class Annual_Tax_Income
{
    public static void main()
    {
        double a, Tax;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Income: ");
        a=sc.nextDouble();
        if(a<=100000)
        {
            System.out.println("Your tax is nil");
        }
        else if(a>=100001 && a<=150000)
        {
            Tax=(a-100001);
            Tax=(Tax*0.1);
            System.out.println("Your tax is:" +Tax);
        }
        else if(a>+150001 && a<=250000)
        {
            Tax=(a-150001);
            Tax=(Tax*0.2);
            Tax=(Tax+5000);
            System.out.println("Your tax is:" +Tax);
        }
        else if(a>250000)
        {
            Tax=(a-250000);
            Tax=(Tax*0.3);
            Tax=(Tax+25000);
            System.out.println("Your tax is:" +Tax);
        }
        else
        {
            System.out.println("Invalid Income");
        }
        System.out.println("Thank You");
    }
}