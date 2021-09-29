import java.io.*;
public class mainmenu extends beverages
{
    static int bill=0;
    public static void main()throws IOException
    {
        double total=0;
        double final_amount=0;
        double discount=0;
        double Famount=0;
        int j=0;
        String itemname[] = new String[10];
        int rate[]=new int[10];
        int qty[]=new int[10];
        {
            BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
            {
                System.out.println("__________       __________   ____________        ||                                         _______________");
                System.out.println("|          |  |           |             |        |  |              |         |   |         |        |        ");
                System.out.println("|          |  |          |             |        |    |             |         |   |         |        |         ");
                System.out.println("|          |  |         |             |        |      |            |         |   |         |        |         ");
                System.out.println("|          |  |        |             |        |________|           |         |   |         |        |         ");
                System.out.println("|__________|  |       |             |         |        |           |_________|   |         |        |         ");       
                System.out.println("|             |      |             |          |        |           |         |   |         |        |         ");
                System.out.println("|             |     |             |           |        |           |         |   |         |        |         ");
                System.out.println("|             |    |             |            |        |           |         |   |         |        |         ");
                System.out.println("|             |   |            |              |        |           |         |   |         |        |         ");
                System.out.println("|             |  |__________  |____________   |        |           |         |   |_________|        |         ");
                System.out.println("Please Enter Your Name");
                String nam=buf.readLine();
                {
                    do
                    {
                        System.out.println(" 1. Pizza mania"); 
                        System.out.println(" 2. Beverages"); 
                        System.out.println(" 3. Garnishes"); 
                        System.out.println(" 4. Tachoes"); 
                        System.out.println("Kindly Enter Your Choice");
                        String x=buf.readLine();
                        int choice=Integer.parseInt(x);
                        switch(choice)
                        {
                            case 1:
                                pizza_mania piz = new pizza_mania();
                                piz.menu1();
                                break;
                            case 2:
                                beverages bev=new beverages();
                                bev.menu2();
                                break;
                            case 3:
                                garnishes gar = new garnishes();
                                gar.menu3();
                                break;
                            case 4:
                                tachoes tac = new tachoes();
                                tac.menu4();
                                break;
                            default:
                                System.out.println("Invalid choice");
                                break;
                        }
                        System.out.println("Would you like to buy anything else(1-Yes  0-No)");
                        j=Integer.parseInt(buf.readLine());
                    }
                    while(j!=0);
                }
            }
            if(j==0)
            {
                total=pizza_mania.amount1+beverages.amount2+garnishes.amount3+tachoes.amount4;
            }
        }
        if(total>250)
            discount=0.1*total;
        else if(total>500)
            discount=0.15*total;
        final_amount=total-discount;
        double tax=0.04*final_amount;
        Famount=final_amount + tax;
        System.out.println(" <<<<<<<<<<<------Bill no.------>>>>>>>>>>>   "+(bill++) );
        System.out.println(" *****************************************************  ");
        System.out.println("                Item"+"\t\t"+"Qty"+"\t\t"+"Price  ");
        System.out.println(" ===================================================== ");
        for(int i=0;i<=5;i++)
        {
            if(pizza_mania.qty1[i]>0)
            {
                System.out.println(pizza_mania.z11[i]+"\t\t"+pizza_mania.qty1[i]+"\t\t"+pizza_mania.price1[i]);
            }
        }
        for( j=0;j<=5;j++)
        {
            if(beverages.qty2[j]>0)
            {
                System.out.println(beverages.z22[j]+ "\t\t"+beverages.qty2[j]+ "\t\t"+beverages.price2[j]);
            }
        }
        for(int o=0;o<=5;o++)
        {
            if(garnishes.qty3[o]>0)
            {
                System.out.println(garnishes.z33[o]+"\t\t"+garnishes.qty3[o]+"\t\t"+garnishes.price3[o]);
            }
        }
        for(int t=0;t<=5;t++)
        {
            if(tachoes.qty4[t]>0)
            {
                System.out.println(tachoes.z44[t]+"\t\t" +tachoes.qty4[t]+"\t\t"+tachoes.price4[t]);
            }
        }
        System.out.println("  Discount is Rs.  "+discount);
        System.out.println("  Tax is Rs.  "+tax + "\n" +"\n");          
        System.out.println("  Total Amount with tax is Rs. "+Famount);
        System.out.println("         --------------Thank you------------                              ");
        System.out.println("         ********Please visit again*********                              ");    
    }
}

