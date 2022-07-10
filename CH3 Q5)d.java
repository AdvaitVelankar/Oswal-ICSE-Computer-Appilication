import java.util.*;
public class Salary
{
    public static void main()
    {
        int Y;
        double S, R;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the years of service");
        Y=sc.nextInt();
        System.out.println("Enter your salary");
        S=sc.nextDouble();
        if(Y<5)
        {
            R=(S*0.05);
            S=(S+R);
            System.out.println("Your salary is:" +S);
        }
        else if(Y<10 && Y>=5)
        {
            R=(S*0.1);
            S=(S+R);
            System.out.println("Your salary is:" +S);
        }
        else if(Y<15 && Y>=10)
        {
            R=(S*0.15);
            S=(S+R);
            System.out.println("Your salary is:" +S);
        }
        else if(Y>=15)
        {
            R=(S*0.2);
            S=(S+R);
            System.out.println("Your salary is:" +S);
        }
        System.out.println("Thank You");
    }
}