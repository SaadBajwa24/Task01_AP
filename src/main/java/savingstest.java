import org.junit.*;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

@SuppressWarnings("unused")
public class savingstest {

	private savings savings_obj_test;
	
	/*@Before
	void setup()
	{
		savings_obj_test=new savings();
		savings_obj_test.insert("saad","abcdefghijkl","0310",1234,50000);
	}*/
	
	@Test
	void test_zakat_1() {
		savings_obj_test=new savings();
		savings_obj_test.insert("saad","abcdefghijkl","0310",1234,50000);
		double expected_result=1250.0;
		double return_result=savings_obj_test.calculatezakat();
		Assert.assertEquals(expected_result,return_result,0.0);
	}
	@Test
	void test_zakat2() {
		savings_obj_test=new savings();
		savings_obj_test.insert("saad","abcdefghijkl","0310",1234,5000);
		double expected_result=0.0;
		double return_result=savings_obj_test.calculatezakat();
		Assert.assertEquals(expected_result,return_result,0.0);
	}
	@Test
	void test_interest_1() {
		savings_obj_test=new savings();
		savings_obj_test.insert("saad","abcdefghijkl","0310",1234,50000);
		double expected_result=107.5;
		double return_result=savings_obj_test.calculateinterest(100,7.5);
		Assert.assertEquals(expected_result,return_result,0.0);
		
	}
	@Test
	void test_interest_2() {
		savings_obj_test=new savings();
		savings_obj_test.insert("saad","abcdefghijkl","0310",1234,50000);
		double expected_result=1250;
		double return_result=savings_obj_test.calculateinterest(1000,25.0);
		Assert.assertEquals(expected_result,return_result,0.0);
	}
	@Test
	void test_withdrawl_1() {
		savings_obj_test=new savings();
		savings_obj_test.insert("saad","abcdefghijkl","0310",1234,50000);
		boolean expected_result=true;
		boolean return_result=savings_obj_test.makewithdrawl(500);
		Assert.assertEquals(expected_result,return_result);
	}
	@Test
	void test_withdrawl_2() {
		savings_obj_test=new savings();
		savings_obj_test.insert("saad","abcdefghijkl","0310",1234,50000);
		boolean expected_result=false;
		boolean return_result=savings_obj_test.makewithdrawl(100000);
		Assert.assertEquals(expected_result,return_result);
	}
	@Test
	void test_deposit_1() {
		savings_obj_test=new savings();
		savings_obj_test.insert("saad","abcdefghijkl","0310",1234,50000);
		boolean expected_result=true;
		boolean return_result=savings_obj_test.makedeposit(1000);
		Assert.assertEquals(expected_result,return_result);
	}
	@Test
	void test_deposit_2() {
		savings_obj_test=new savings();
		savings_obj_test.insert("saad","abcdefghijkl","0310",1234,50000);
		boolean expected_result=false;
		boolean return_result=savings_obj_test.makedeposit(-50);
		Assert.assertEquals(expected_result,return_result);
	}
	
}
