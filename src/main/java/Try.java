import java.util.Scanner;

public class Try
{
	@SuppressWarnings("unused")
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner s1 = new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner s2 = new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner s3 = new Scanner(System.in);
        checking []checkArr = new checking[50];
        savings []saveArr = new savings[50];
        for (int i=0;i<50;i++)
        {
        	checkArr[i]=new checking();
        	saveArr[i]=new savings();
        }
        int count1 = 0;
        int count2 = 0;
        int option=0;
        System.out.println("Welcome to Bank Management System!");
        System.out.println("Enter 1 to create an account!");
        System.out.println("Enter 2 to login into the account and perform required operations!");
        System.out.println("Enter 3 to specify the interest rate and calculate interest!");
        System.out.println("Enter 4 to display account details!");
        System.out.println("Enter 5 to exit!");
    	System.out.println("Enter the option");
    	option=s1.nextInt();
        do {
        	if (option==1)
        	{
        		int temp;
        		System.out.println("Which type of account do you want to create?");
        		System.out.println("Enter 1 for savings");
        		System.out.println("Enter 2 for checking");
        		temp=s1.nextInt();
        		if(temp==1)
        		{
        			System.out.println("Creating a savings account :)");
        			System.out.println("Enter your name");
        			String a=s2.nextLine();
        			System.out.println("Enter your address");
        			String b=s2.nextLine();
        			System.out.println("Enter your phone number");
        			String c=s2.nextLine();
        			System.out.println("Enter your 4 digit account number");
        			int d=s1.nextInt();
        			System.out.println("Enter initial deposit amount");
        			int e=s1.nextInt();
        			saveArr[count1].insert(a, b, c, d, e);
        			count1++;
        		}
        		else if(temp==2)
        		{
        			System.out.println("Creating a checking account :)");
        			System.out.println("Enter your name");
        			String a=s2.nextLine();
        			System.out.println("Enter your address");
        			String b=s2.nextLine();
        			System.out.println("Enter your phone number");
        			String c=s2.nextLine();
        			System.out.println("Enter your 4 digit account number");
        			int d=s1.nextInt();
        			System.out.println("Enter initial deposit amount");
        			int e=s1.nextInt();
        			checkArr[count2].insert(a, b, c, d, e);
        			count2++;
        		}
        		else
        		{
        			System.out.println("Wrong value :( ");
        		}
        	}
        	else if(option==2)
        	{
        		System.out.println("Which type of account do you want to login?");
                System.out.println("Enter 1 for savings account login");
                System.out.println("Enter 2 for checkings account login");
                int userInput = s1.nextInt();
                boolean flag = false;
                int index=0;
                if(userInput == 1)
                {
                    System.out.println("enter account number");
                    int num=s1.nextInt();
                    for(int i=0;i<count1;i++)
                    {
                        if(saveArr[i].getaccountnumber() == num)
                        {
                            flag = true;
                            index=i;
                        }
                        if(flag==true)
                        {
                        	System.out.println("Enter 1 to deposit money");
                        	System.out.println("Enter 2 to withdraw money");
                        	System.out.println("Enter 3 to check balance");
                        	System.out.println("Enter 4 to calculate Zakat");
                        	System.out.println("Enter 5 to see bank statement");
                        	int temp1=s1.nextInt();
                        	if (temp1==1)
                        	{
                        		System.out.println("Enter the amount of money you want to deposit!");
                        		int amountmoney=s1.nextInt();
                        		saveArr[index].makedeposit(amountmoney);
                        	}
                        	else if (temp1==2)
                        	{
                        		System.out.println("Enter the amount of money you want to withdraw!");
                        		int amountmoney=s1.nextInt();
                        		saveArr[index].makewithdrawl(amountmoney);
                        	}
                        	else if (temp1==3)
                        	{
                        		saveArr[index].checkbalance();
                        	}
                        	else if (temp1==4)
                        	{
                        		double temp_zakat=saveArr[index].calculatezakat();
                        	}
                        	else if (temp1==5)
                        	{
                        		System.out.println("Enter transaction amount!");
                        		int transamount=s1.nextInt();
                        		saveArr[index].printstatement(transamount);
                        	}
                        	else
                        	{
                        		System.out.println("Wrong option entered :)");
                        	}
                        }
                        else
                        {
                            System.out.println("account not found");
                        }
                    }
                }
                else if(userInput==2)
                {
                    System.out.println("enter account number");
                    int num=s1.nextInt();
                    for(int i=0;i<count2;i++)
                    {
                        if(checkArr[i].getaccountnumber() == num)
                        {
                            flag = true;
                            index=i;
                        }
                        if(flag==true)
                        {
                        	System.out.println("Enter 1 to deposit money");
                        	System.out.println("Enter 2 to withdraw money");
                        	System.out.println("Enter 3 to check balance");
                        	System.out.println("Enter 4 to bank statement");
                        	int temp1=s1.nextInt();
                        	if (temp1==1)
                        	{
                        		System.out.println("Enter the amount of money you want to deposit!");
                        		int amountmoney=s1.nextInt();
                        		checkArr[index].makedeposit(amountmoney);
                        	}
                        	else if (temp1==2)
                        	{
                        		System.out.println("Enter the amount of money you want to withdraw!");
                        		int amountmoney=s1.nextInt();
                        		checkArr[index].makewithdrawl(amountmoney);
                        	}
                        	else if (temp1==3)
                        	{
                        		checkArr[index].checkbalance();
                        	}
                        	else if (temp1==4)
                        	{
                        		System.out.println("Enter transaction amount!");
                        		int transamount=s1.nextInt();
                        		checkArr[index].printstatement(transamount);
                        	}
                        	else
                        	{
                        		System.out.println("Wrong option entered :)");
                        	}
                        }
                        else
                        {
                            System.out.println("account not found");
                        }
                    }
                }
        	}
        	else if(option==3)
        	{
        		System.out.println("Enter the interest rate!");
        		double rate=s3.nextDouble();
        		System.out.println("Enter the amount!");
        		double amount=s3.nextDouble();
        		double temp_interest=saveArr[count1].calculateinterest(amount, rate);
        	}
        	else if(option==4)
        	{
        		System.out.println("Which account details you want?");
        		System.out.println("Enter 1 for savings");
        		System.out.println("Enter 2 for checking");
        		int inp=s1.nextInt();
        		if (inp==1)
        		{
        			System.out.println("Showing you the details of all savings account!");
        			if(count1==0)
        			{
        				System.out.println("No accounts yet :(");
        			}
        			for(int i=0;i<count1;i++)
        			{
        				saveArr[i].getdetails();
        			}
        		}
        		else if(inp==2)
        		{
        			System.out.println("Showing you the details of all current accounts!");
        			if(count2==0)
        			{
        				System.out.println("No accounts yet :(");
        			}
        			for (int i=0;i<count2;i++)
        			{
        				checkArr[i].getdetails();
        			}
        		}
        		else
        		{
        			System.out.println("Wrong input :)");
        		}
        	}
        	System.out.println("Enter the option from the menu!");
        	option=s1.nextInt();
 
        }while(option!=5);
        System.out.println("Exitting :)");
	}
	
}
