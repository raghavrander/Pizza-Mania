import java.io.*;
import java.util.*;
public class tachoes
{
    //public static int amount4=0,item=0;
    //public static int price4[]=new int[5];
    public static String z44[]=new String[6];
    public static int amount4=0;
    public static int choice4=0;
    public static int qty4[]=new int[6];
    public static int rate4[]=new int[6];
    public static int price4[]=new int[6];
    public void menu4()throws IOException
    {
        int cho4=0,d=0;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader ab=new BufferedReader(isr);
        {
            do
            {
                System.out.println("                                   ");
                System.out.println("~~~~~~~~~~~~~~~~~~~Tachoes~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
                System.out.println("1.Veg. Tachos.....................................................170.00"); 
                System.out.println("2.Cheese tachos.......................................120.00"); 
                System.out.println("3.Simply veg...............................................130.00"); 
                System.out.println("4.Stuffed Paneer Tachos...............................................180.00");
                System.out.println("5.Chilly Paneer Tachos............................................200.00"); 
                BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
                String y4=buf.readLine();
                int choice4=Integer.parseInt(y4);
                String z4[]={"Veg. Tachos","Cheese tachoes","Simply veg","Stuffed Paneer Tachos","Chilly Paneer Tachos"};
                //int qty4[]=new int[5];
                int rate4[]={170,120,130,180,200};
                if(choice4==1)
                { 
                    z44[0]="Veg. Tachos";
                    System.out.println("Enter quantity");
                    y4=buf.readLine();
                    qty4[0]= qty4[0]+Integer.parseInt(y4);
                    System.out.println("You have purchased "+qty4[0]+" Veg. Tachos for Rs."+rate4[0]*qty4[0]);
                }
                if(choice4==2)
                {
                    z44[1]="Cheese tachos";
                    System.out.println("Enter quantity");
                    y4=buf.readLine();
                    qty4[1]=qty4[1]+Integer.parseInt(y4);
                    System.out.println("You have purchased "+qty4[1]+" Cheese tachos for Rs."+rate4[1]*qty4[1]);
                }
                if(choice4==3)
                {
                    z44[2]="Simply veg";
                    System.out.println("Enter quantity");
                    y4=buf.readLine();
                    qty4[2]=qty4[2]+Integer.parseInt(y4);
                    System.out.println("You have purchased "+qty4[2]+" Simply veg for Rs."+rate4[2]*qty4[2]);
                }
                if(choice4==4)
                {
                    z44[3]="Stuffed Paneer Tachos";
                    System.out.println("Enter quantity");
                    y4=buf.readLine();
                    qty4[3]= qty4[3]+Integer.parseInt(y4);
                    System.out.println("You have purchased "+qty4[3]+" Stuffed Paneer Tachos for Rs."+rate4[3]*qty4[3]);
                }
                if(choice4==5)
                {
                    z44[4]="Chilly Paneer Tachos";
                    System.out.println("Enter quantity");
                    y4=buf.readLine();
                    qty4[4]= qty4[4]+Integer.parseInt(y4);
                    System.out.println("You have purchased "+qty4[4]+" Chilly Paneer Tachos for Rs."+rate4[4]*qty4[4]);
                }
                for(d=0;d<5;d++)
                {
                    price4[d]=rate4[d]*qty4[d];
                    amount4=amount4+price4[d];
                }
                System.out.println("Do you wish to buy anything else[1-Yes/0-No]");
                cho4=Integer.parseInt(ab.readLine());
            }
            while(cho4!=0);
        }
    }}
