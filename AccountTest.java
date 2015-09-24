import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {

	@Test
	public void testInit() {
		Account shaun= new Account(500);
		assertEquals(shaun.balance(), 500);
		
	}
	@Test
	public void testInvalidArgs(){
		Account shaun= new Account(500);
		shaun.withdraw(-50);
		shaun.deposit(-50);
		assertEquals(shaun.balance(),500);
	}
	@Test
	public void testOverdraft(){
		Account shaun= new Account(100);
		shaun.withdraw(500);
		assertEquals(shaun.balance(),100);
	}
	@Test
	public void testDeposit(){
		Account shaun= new Account(100);
		shaun.deposit(50);
		assertEquals(shaun.balance(),150);
	}
	@Test
	public void testWithdraw(){
		Account shaun= new Account(100);
		shaun.withdraw(50);
		assertEquals(shaun.balance(),50);
	}
}
