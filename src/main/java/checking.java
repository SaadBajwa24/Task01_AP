import java.text.SimpleDateFormat;  
import java.util.Date; 

public class checking {
	
	String name;
	String address;
	String phoneno;
	int accountno;
	int accountbalance;
	
	checking()
	{
		name="";
		address="";
		phoneno="";
		accountno=0;
		accountbalance=0;
	}
	checking(String a,String b,String c,int e,int f)
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
	boolean makedeposit(int amount)
	{
		if(amount>0)
		{
			accountbalance+=amount;
			System.out.println("The new balance after deposit is: " + accountbalance);
			return true;
		}
		else
		{
			System.out.println("Cannot enter negative amount:)");
			return false;
		}
	}
	boolean makewithdrawl(int amount)
	{
		if (amount<accountbalance)
		{
			accountbalance-=amount;
			System.out.println("The new balance after withdrawl is: " + accountbalance);
			return true;
		}
		else if (amount>accountbalance && (amount-accountbalance<5000))
		{
			accountbalance-=amount;
			System.out.println("The new balance after withdrawl is: " + accountbalance);
			return true;
		}
		else
		{
			System.out.println("Not Enough Balance :(");
			return false;
		}
	}
	void transferamount(checking obj,int amount)
	{	
		accountbalance-=amount;
		obj.accountbalance+=amount;
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
	
}
