package p3;

import static org.junit.Assert.*;
import java.util.Date;
import org.junit.Test;


public class AccountTest {
	@Test
	public void TestAccount() {
		Account t = new Account();
		double texpected = t.getbalance();
		double tactual = 0;
		assertTrue(texpected == tactual);
		}
	
		
	
	@Test
	public void TestgetMonthlyInterestRate(){
		Account t2 = new Account(1122, 20000, 4.5);
		double t2expected = t2.getMonthlyInterestRate();
		double t2actual = (4.5 / 12);
		assertTrue(t2expected == t2actual);
			
	}	
	@Test
	public void Testgetid(){
		Account t3 = new Account(1122, 20000, 4.5);
		int t3expected = t3.getid();
		int t3actual = 1122;
		assertTrue(t3expected == t3actual);
		
	}	
	@Test
	public void TestgetannualInterestRate(){
		Account t4 = new Account(1122, 20000, 4.5);
		double t4expected = t4.getannualInterestRate();
		double t4actual = 4.5;
		assertTrue(t4expected == t4actual);
		
	}	
	@Test
	public void TestgetdateCreated(){
		Account t5 = new Account();
		Date t5expected = t5.getdateCreated();
		Date t5actual = new Date();
		assertTrue(t5expected == t5actual);
		
	}	
	@Test		
	public void Testwithdraw(){
		Account t6 = new Account(1122,20000,4.5);
		double t6expected = t6.withdraw(2500);
		double t6actual = 17500; 
		assertTrue(t6expected == t6actual);
		
	}
	@Test
	public void Testdeposit(){
		Account t7 = new Account(1122,20000,4.5);
		double t7expected = t7.deposit(3000);
		double t7actual = 23000; 
		assertTrue(t7expected == t7actual);
			
	}

	
	
		fail("Not yet implemented");
	}

}
