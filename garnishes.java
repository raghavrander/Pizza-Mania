import java.io.*;
public class garnishes
{
    public static String z33[]=new String[6];
    public static int amount3=0;
    public static int rate3[]=new int[6];
    public static int price3[]=new int[6];
    public static int choice3=0;
    public static int qty3[]=new int [6];
    public void menu3()throws IOException
    {
        int cho3=0;
        int c=0;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader ab=new BufferedReader(isr);
        {
            do
            {
                System.out.println();
                System.out.println("~~~~~~~~~~~~~~~~~~~~Garnishes~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
                System.out.println("1.Extra Cheese..............................................40.00");  
                System.out.println("2.Extra toppings................................................44.00");  
                System.out.println("3.Berries.............................................54.00"); 
                System.out.println("4.Paneer......................................50.00");  
                System.out.println("5.Fruit Salad.............................................45.00"); 
                BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
                String y3=buf.readLine();
                int choice3=Integer.parseInt(y3);
                String z3[]={"Extra Cheese","Extra Toppings","Berries","Paneer","Fruit Salad"};
                int rate3[]={40,44,54,50,45};
                if(choice3==1)
                {
                    z33[0]="Extra Cheese";
                    System.out.println("Enter Quantity");
                    y3=buf.readLine();
                    qty3[0]=qty3[0] + Integer.parseInt(y3);
                    System.out.println("You have purchased"+qty3[0]+"Extra Cheese for Rs."+rate3[0]*qty3[0]);
                }
                if(choice3==2)
                {
                    z33[1]="Extra toppings";
                    System.out.println("Enter Quantity");
                    y3=buf.readLine();
                    qty3[1]=qty3[1]+Integer.parseInt(y3);
                    System.out.println("You have purchased"+qty3[1]+"Extra toppings for Rs."+rate3[1]*qty3[1]);
                }
                if(choice3==3)
                {
                    z33[2]="Berries";
                    System.out.println("Enter Quantity");
                    y3=buf.readLine();
                    qty3[2]=qty3[2]+Integer.parseInt(y3);
                    System.out.println("You have purchased"+qty3[2]+"Berries for Rs."+rate3[2]*qty3[2]);
                }
                if(choice3==4)
                {
                    z33[3]="Paneer";
                    System.out.println("Enter Quantity");
                    y3=buf.readLine();
                    qty3[3]=qty3[3]+Integer.parseInt(y3);
                    System.out.println("You have purchased"+qty3[3]+"Paneer for Rs."+rate3[3]*qty3[3]);
                }
                if(choice3==5)
                {
                    z33[4]="Fruit Salad";
                    System.out.println("Enter Quantity");
                    y3=buf.readLine();
                    qty3[4]=qty3[4]+Integer.parseInt(y3);
                    System.out.println("You have purchased"+qty3[4]+"Fruit Salad for Rs."+rate3[4]*qty3[4]);
                }   
                for(c=0;c<5;c++)
                {
                    price3[c]=rate3[c]*qty3[c];
                    amount3=amount3+price3[c];
                }
                System.out.println("Do you wish to buy anything else[1-Yes/0-No]");
                choice3=Integer.parseInt(ab.readLine());
            }
            while(cho3!=0);
        }
    }
}	
