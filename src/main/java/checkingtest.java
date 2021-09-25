import org.junit.*;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

@SuppressWarnings("unused")
public class checkingtest {

	private checking checking_obj_test;
	
	/*@Before
	void setup()
	{
		checking_obj_test=new checking();
		checking_obj_test.insert("saad","abcdefghijkl","0310",1234,50000);
	}*/
	
	@Test
	void test_withdrawl_1() {
		checking_obj_test=new checking();
		checking_obj_test.insert("saad","abcdefghijkl","0310",1234,50000);
		boolean expected_result=true;
		boolean return_result=checking_obj_test.makewithdrawl(5000);
		Assert.assertEquals(expected_result,return_result);
	}
	@Test
	void test_withdrawl_2() {
		checking_obj_test=new checking();
		checking_obj_test.insert("saad","abcdefghijkl","0310",1234,50000);
		boolean expected_result=true;
		boolean return_result=checking_obj_test.makewithdrawl(54000);
		Assert.assertEquals(expected_result,return_result);
	}
	@Test
	void test_withdrawl_3() {
		checking_obj_test=new checking();
		checking_obj_test.insert("saad","abcdefghijkl","0310",1234,50000);
		boolean expected_result=false;
		boolean return_result=checking_obj_test.makewithdrawl(70000);
		Assert.assertEquals(expected_result,return_result);
	}
	@Test
	void test_deposit_1() {
		checking_obj_test=new checking();
		checking_obj_test.insert("saad","abcdefghijkl","0310",1234,50000);
		boolean expected_result=true;
		boolean return_result=checking_obj_test.makedeposit(1000);
		Assert.assertEquals(expected_result,return_result);
	}
	@Test
	void test_deposit_2() {
		checking_obj_test=new checking();
		checking_obj_test.insert("saad","abcdefghijkl","0310",1234,50000);
		boolean expected_result=false;
		boolean return_result=checking_obj_test.makedeposit(-50);
		Assert.assertEquals(expected_result,return_result);
	}
	
}
