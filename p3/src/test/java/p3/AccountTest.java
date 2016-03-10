package p3;

import static org.junit.Assert.*;
import java.util.Date;
import org.junit.Test;


public class AccountTest {
	@Test
	public void TestAccount() {
		Account t = new Account();
		
		
	}
	
		
	
	
	public void TestgetMonthlyInterestRate(){
		Account t2 = new Account(1122, 20000, 4.5);
		double t2expected = t2.getMonthlyInterestRate();
		double t2actual = (4.5 / 12);
		assertTrue(t2expected == t2actual);
		
		
	}	
	
	public void Testgetid(){
		Account t3 = new Account(1122, 20000, 4.5);
		int t3expected = t3.getid();
		int t3actual = 1122;
		assertTrue(t3expected == t3actual);
		
	}	
	
	public void TestgetannualInterestRate(){
		Account t4 = new Account(1122, 20000, 4.5);
		int t4expected = t4.getannualInterestRate();
		int t4actual = 4.5;
		assertTrue(t4expected == t4actual);
		
	}	
	
	public void TestgetdateCreated(){
		Account t5 = new Account();
		Date t5expected = t5.getdateCreated();
		Date t5actual = new Date();
		
	}	
			
	public void Testwithdraw(){
				
	}
	
	public void Testdeposit(){
		
	}

	
	
		fail("Not yet implemented");
	}

}
