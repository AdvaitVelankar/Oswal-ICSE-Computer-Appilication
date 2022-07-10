import java.util.*;
public class Library_Book
{
    public static void main()
   {
    int d, f;
    Scanner sc=new Scanner(System.in);
    System.out.println("Please enter the total days you had your library book");
    d=sc.nextInt();
    if(d<=3)
    {
        f=(4*d);
        System.out.println("Your fine is:" +f);
    }
    else if(d>3 && d<=7)
    {
        f=(8*d);
        System.out.println("Your fine is:" +f);
    }
    else if(d>7 && d<=10)
    {
        f=(12*d);
        System.out.println("Your fine is:" +f);
    }
    else if(d>10)
    {
        f=(15*d);
        System.out.println("Your fine is:" +f);
    }
    System.out.println("Any doubt please email me \n addyvelankar@gmail.com");
   } 
}