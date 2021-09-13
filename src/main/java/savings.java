import java.text.SimpleDateFormat;  
import java.util.Date; 

public class savings {

	String name;
	String address;
	String phoneno;
	int accountno;
	int accountbalance;
	
	savings()
	{
		name="";
		address="";
		phoneno="";
		accountno=0;
		accountbalance=0;
	}
	savings(String a,String b,String c,int e,int f)
	{
		name=a;
		address=b;
		phoneno=c;
		accountno=e;
		accountbalance=f;
	}
	void insert(String a,String b,String c,int e,int f)
	{
		name=a;
		address=b;
		phoneno=c;
		accountno=e;
		accountbalance=f;
	}
	void getdetails()
	{
		System.out.print("The name is: ");
		System.out.println(name);
		System.out.print("The address is: ");
		System.out.println(address);
		System.out.print("The phone number is: ");
		System.out.println(phoneno);
		System.out.print("The account number is: ");
		System.out.println(accountno);
		System.out.print("The account balance is: ");
		System.out.println(accountbalance);
	}
	void setbalance(int bal)
	{
		accountbalance=bal;
	}
	int getaccountnumber()
	{
		return accountno;
	}
	int getbalance()
	{
		return accountbalance;
	}
	void checkbalance()
	{
		System.out.println("The account holder name is: " + name);
		System.out.println("The balance is: " + accountbalance);
	}
	void makedeposit(int amount)
	{
		if(amount>0)
		{
			accountbalance+=amount;
			System.out.println("The new balance after deposit is: " + accountbalance);
		}
		else
		{
			System.out.println("Cannot enter negative amount:)");
		}
	}
	void makewithdrawl(int amount)
	{
		if (amount<accountbalance)
		{
			accountbalance-=amount;
			System.out.println("The new balance after withdrawl is: " + accountbalance);
		}
		else
		{
			System.out.println("Withdrawl amount is greater than account balance :(");
		}
	}
	void transferamount(savings obj,int amount)
	{	
		accountbalance-=amount;
		obj.accountbalance+=amount;
	}
	void calculatezakat()
	{
		if (accountbalance>=20000)
		{
			double zakat=(accountbalance*2.5)/100;
			System.out.println("The Zakat is: " + zakat);
		}
		else
		{
			System.out.println("Amount balance less than 20000 so can't calculate Zakat");
		}
	}
	void printstatement(int amount)
	{
		System.out.print("The name is: ");
		System.out.println(name);
		System.out.print("The address is: ");
		System.out.println(address);
		System.out.print("The phone number is: ");
		System.out.println(phoneno);	
		System.out.print("The account number is: ");
		System.out.println(accountno);
	    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date();  
	    System.out.print("The Transaction date and time is: ");
	    System.out.println(formatter.format(date));
		System.out.print("The transaction amount is: ");
		System.out.println(amount);
		System.out.println("The balance is: " + accountbalance);
	}
	void calculateinterest(double amount,double interestrate)
	{
		System.out.println("The interest rate given is: " + interestrate);
		double interest=amount+((interestrate/100)*amount);
		System.out.println("The interest amount would be: " + interest);
	}
}
