import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import junitlab.bank.AccountNotExistsException;
import junitlab.bank.NotEnoughFundsException;
import junitlab.bank.impl.FirstNationalBank;
import junitlab.bank.impl.GreatSavingsBank;

public class BankTestFixture {
	
	GreatSavingsBank bank;
	String acc1;
	String acc2;
	
	@Before
	public void setUp() throws AccountNotExistsException
	{
		bank = new GreatSavingsBank();
		acc1 = bank.openAccount();
		bank.deposit(acc1, 1500);
		acc2 = bank.openAccount();
		bank.deposit(acc2, 12000);
	}
	
	@Test
	public void testTransfer() throws AccountNotExistsException, NotEnoughFundsException
	{
		bank.transfer(acc2, acc1, 3456);
		Assert.assertEquals(4956, bank.getBalance(acc1));
		Assert.assertEquals(8544, bank.getBalance(acc2));
	}
	
	@Test(expected=NotEnoughFundsException.class)
	public void testTransferWithoutEnoughFunds() throws AccountNotExistsException, NotEnoughFundsException
	{
		bank.withdraw(acc1, bank.getBalance(acc1));
		bank.transfer(acc1, acc2, 3456);
	}
}
