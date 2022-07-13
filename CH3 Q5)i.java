import java.util.*;
public class Temperature_Converter
{
    public static void main()
    {
        double c, f, ans;
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 for conversion from celsius to fahrenheit");
        System.out.println("Press 2 for conversion from fahrenheit to celsius");
        ch=sc.next().charAt(0);
        switch(ch)
        {
            case '1':System.out.println("Please enter the temperature");
            c=sc.nextDouble();
            ans=(c*1.8);
            ans=(ans+32);
            System.out.println("Your answer is:" +ans);
            break;
            case '2':System.out.println("Please enter the temperature");
            f=sc.nextDouble();
            ans=(f-32);
            ans=(ans*5);
            ans=(ans/9);
            System.out.println("Your answer is:" +ans);
        }
    }
}