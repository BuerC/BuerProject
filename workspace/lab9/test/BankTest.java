import org.junit.Assert;
import org.junit.Test;

import junitlab.bank.AccountNotExistsException;
import junitlab.bank.impl.FirstNationalBank;
import junitlab.bank.impl.GreatSavingsBank;

public class BankTest {

	
	@Test
	public void testOpenAccount() throws AccountNotExistsException
	{
		GreatSavingsBank bank = new GreatSavingsBank();
		String acc = bank.openAccount();
		Assert.assertEquals(0,  bank.getBalance(acc));
	}
	@Test
	public void testUniqueAccount()
	{
		GreatSavingsBank bank = new GreatSavingsBank();
		String previousacc = bank.openAccount();
		String currentacc;
		for(int i=0;i<5;i++)
		{
			currentacc = bank.openAccount();
			Assert.assertNotEquals(previousacc, currentacc);
			previousacc = currentacc;
		}
	}
	@Test(expected=AccountNotExistsException.class)
	public void testInvalidAccount()throws Exception
	{
		GreatSavingsBank bank = new GreatSavingsBank();
		bank.getBalance(null);
	}
	@Test
	public void testDeposit() throws AccountNotExistsException
	{
		long amount = 2000;
		GreatSavingsBank bank = new GreatSavingsBank();
		String acc = bank.openAccount();
		bank.deposit(acc, 2000);
		Assert.assertEquals(amount, bank.getBalance(acc));
	}
}
