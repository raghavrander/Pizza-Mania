import java.io.*;
public class beverages
{
    public static String z22[]=new String[10];
    public static int amount2=0;
    public static int rate2[]=new int[10];
    public static int price2[]=new int[10];
    public static int choice2=0;
    public static int qty2[]=new int [10];
    public void menu2()throws IOException
    {
        int cho2=0;
        int b=0;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader ab=new BufferedReader(isr);
        {
            do
            {
                System.out.println();
                System.out.println("~~~~~~~~~~~~~~~~~~Beverages~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("1.Cold Coffee................................................120.00"); 
                System.out.println("2.Lemonade.................................................140.00"); 
                System.out.println("3.Ice-cream Punch............................................145.00"); 
                System.out.println("4.Pizza Hut Special Drink..........................................150.00"); 
                System.out.println("5.Fruit Punch................................140.00"); 
                BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
                String y2=buf.readLine();
                int choice2=Integer.parseInt(y2);
                String z2[]={"Cold Coffee","Lemonade","Ice-cream Punch","Pizza Hut Special Drink","Fruit Punch"};
                int rate2[]={120,140,145,150,140};
                if(choice2==1)
                {
                    z22[0]="Cold Coffee";
                    System.out.println("Enter Quantity");
                    y2=buf.readLine();
                    qty2[0]=qty2[0] + Integer.parseInt(y2);
                    System.out.println("You have purchased"+qty2[0]+"Cold Coffee for Rs."+rate2[0]*qty2[0]);
                }
                if(choice2==2)
                {
                    z22[1]="Lemonade";
                    System.out.println("Enter Quantity");
                    y2=buf.readLine();
                    qty2[1]=qty2[1]+Integer.parseInt(y2);
                    System.out.println("You have purchased"+qty2[1]+"Lemonade for Rs."+rate2[1]*qty2[1]);
                }
                if(choice2==3)
                {
                    z22[2]="Ice-cream Punch";
                    System.out.println("Enter Quantity");
                    y2=buf.readLine();
                    qty2[2]=qty2[2]+Integer.parseInt(y2);
                    System.out.println("You have purchased"+qty2[2]+"Ice-cream Punch for Rs."+rate2[2]*qty2[2]);
                }
                if(choice2==4)
                {
                    z22[3]="Pizza hut Special Drink";
                    System.out.println("Enter Quantity");
                    y2=buf.readLine();
                    qty2[3]=qty2[3]+Integer.parseInt(y2);
                    System.out.println("You have purchased"+qty2[3]+"Pizza Hut Special Drink for Rs."+rate2[3]*qty2[3]);
                }
                if(choice2==5)
                {
                    z22[4]="Fruit Punch";
                    System.out.println("Enter Quantity");
                    y2=buf.readLine();
                    qty2[4]=qty2[4]+Integer.parseInt(y2);
                    System.out.println("You have purchased"+qty2[4]+"Fruit Punch for Rs."+rate2[4]*qty2[4]);
                }
                for(b=0;b<5;b++)
                {
                    price2[b]=rate2[b]*qty2[b];
                    amount2=amount2+price2[b];
                }
                System.out.println("Do you wish to buy anything else[1-Yes/0-No]");
                choice2=Integer.parseInt(ab.readLine());
            }while(cho2!=0);
        }
    }	
}
