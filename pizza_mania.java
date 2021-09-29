import java.io.*;
import java.util.*;    
public class pizza_mania
{
    public static String z1[]=new String[10];
    public static int amount1=0;
    public static int price1[]=new int[10];
    public static int choice1=0;
    public static int qty1[]=new int [10];
    public static int arr[]=new int[10];
    public static String z11[]=new String[10];
    //public static int menu1()
    public void menu1()throws IOException
    {
        int cho1=0;
        int a=0,i;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader ab=new BufferedReader(isr);
        do
        {
            System.out.println();
            System.out.println("Pizza Mania");
            System.out.println("1.Farmhouse.................................................150.00");
            System.out.println("2.Country Special...............................................128.00");
            System.out.println("3.Spicy Chilly...............................................135.00");
            System.out.println("4.Garnished Pizza.............................................125.00");
            System.out.println("5.Pizza Hut Special..............................................130.00");
            System.out.println("6.Spicy farmhouse.............................................140.00");
            System.out.println("7.Day in......................................................118.00");    
            System.out.println("8.Chilly Pizza.................................................123.00");    
            BufferedReader buf=new BufferedReader((new InputStreamReader(System.in)));
            String y1=buf.readLine();
            int choice1=Integer.parseInt(y1);
            String z1[]={"Farmhouse","Country Special","Spicy Chilly","Garnished Pizza","Pizza Hut Special","Spicy farmhouse","Day in","Chilly pizza"};
            int rate1[]={150,128,135,125,130,140,118,123};
            if(choice1==1)
            {
                z11[0]="Farmhouse";
                System.out.println("Enter Quantity");
                y1=buf.readLine();
                qty1[0]=qty1[0] + Integer.parseInt(y1);
                System.out.println("You have purchased"+qty1[0]+"Farmhouse for Rs."+rate1[0]*qty1[0]);
            }
            if(choice1==2)
            {
                z11[1]="Country Special";
                System.out.println("Enter Quantity");
                y1=buf.readLine();
                qty1[1]=qty1[1]+Integer.parseInt(y1);
                System.out.println("You have purchased"+qty1[1]+"Country Special for Rs."+rate1[1]*qty1[1]);
            }
            if(choice1==3)
            {
                z11[2]="Spicy Chilly";
                System.out.println("Enter Quantity");
                y1=buf.readLine();
                qty1[2]=qty1[2]+Integer.parseInt(y1);
                System.out.println("You have purchased"+qty1[2]+"Spicy Chilly for Rs."+rate1[2]*qty1[2]);
            }
            if(choice1==4)
            {
                z11[3]="Garnished Pizza";
                System.out.println("Enter Quantity");
                y1=buf.readLine();
                qty1[3]=qty1[3]+Integer.parseInt(y1);
                System.out.println("You have purchased"+qty1[3]+"Garnished Pizza for Rs."+rate1[3]*qty1[3]);
            }
            if(choice1==5)
            {
                z11[4]="Pizza Hut Special";
                System.out.println("Enter Quantity");
                y1=buf.readLine();
                qty1[4]=qty1[4]+Integer.parseInt(y1);
                System.out.println("You have purchased"+qty1[4]+"Pizza Hut Special for Rs."+rate1[4]*qty1[4]);
            }
            if(choice1==6)
            {
                z11[5]="Spicy farmhouse";
                System.out.println("Enter Quantity");
                y1=buf.readLine();
                qty1[5]=qty1[5]+Integer.parseInt(y1);
                System.out.println("You have purchased"+qty1[5]+"Spicy farmhouse for Rs."+rate1[5]*qty1[5]);
            }
            if(choice1==7)
            {
                z11[6]="Day in";
                System.out.println("Enter Quantity");
                y1=buf.readLine();
                qty1[6]=qty1[6]+Integer.parseInt(y1);
                System.out.println("You have purchased"+qty1[6]+"Day in for Rs."+rate1[6]*qty1[6]);
            }
            if(choice1==8)
            {
                z11[7]="Chilly Pizza";
                System.out.println("Enter Quantity");
                y1=buf.readLine();
                qty1[7]=qty1[7]+Integer.parseInt(y1);
                System.out.println("You have purchased"+qty1[7]+"Chilly Pizza for Rs."+rate1[7]*qty1[7]);
            }        
            for(a=0;a<8;a++)
            {
                price1[a]=rate1[a]*qty1[a];
                amount1=amount1+price1[a];
            }
            System.out.println("Do you wish to buy anything else[1-Yes/0-No]");
            choice1=Integer.parseInt(ab.readLine());
        }
        while(cho1!=0);
    }
}
