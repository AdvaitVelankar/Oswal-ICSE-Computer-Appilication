import java.util.*;
public class TI
{
    public static void main()
    {
        double TI, TAX;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of income");
        TI=sc.nextFloat();
        if(TI<160000)
        {
            System.out.println("Your Tax is Nil");
        }
        else if(TI>160000 && TI<=500000)
        {
            TAX = (TI-160000);
            TAX = 0.1 * TAX;
            System.out.println("TAX:" +TAX);
        }
        else if(TI>500000 && TI<=800000)
        {
            TAX = (TI-500000);
            TAX = 0.2 * TAX;
            TAX = TAX + 34000;
            System.out.println("TAX:" +TAX);
        }
        else if(TI>=80000)
        {
            TAX = (TI-800000);
            TAX = 0.3 * TI;
            TAX = TAX + 94000;
            System.out.println("TAX:" +TAX);
        }
        else
        {
            System.out.println("ERROR");
        }
        System.out.println("Thank You");
    }    
}
