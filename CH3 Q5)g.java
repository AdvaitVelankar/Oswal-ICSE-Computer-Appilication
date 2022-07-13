import java.util.*;
public class Groceries_Sales
{
    public static void main()
    {
        double G, F, P;
        Scanner sc=new Scanner(System.in);
        System.out.println("Hello, Welcome \nHere 1Kg of groceries is of rupees 10 and 1Kg of fruit is of rupees 5 ");
        System.out.println("Enter the weight of Groceries");
        G=sc.nextDouble();
        System.out.println("Enter the weight of Fruits");
        F=sc.nextDouble();
        if(G>=10 && F>=8)
        {
            P=(G*10 + F*5);
            System.out.println("Your total is:" +P);
            System.out.println("Your Gift is a CHOCOLATE CAKE");
        }
        else if(G>=7 && F>=5)
        {
            P=(G*10 + F*5);
            System.out.println("Your total is:" +P);
            System.out.println("Your Gift is a VANILLA ICECREAM");
        }
        else if(G>=4 && F>=2)
        {
            P=(G*10 + F*5);
            System.out.println("Your total is:" +P);
            System.out.println("Your Gift is a FRUIT JUICER BOTTLE");
        }
        else if(G<=4 && F<=2)
        {
            P=(G*10 + F*5);
            System.out.println("Your total is:" +P);
            System.out.println("Sorry! No Gift for you");
        }
        System.out.println("Thank You \nVisit Again");
    }
}