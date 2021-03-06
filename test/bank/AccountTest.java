package bank;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


import org.junit.Before;
import org.junit.Test;


public class AccountTest {
	private Account account;

	@Before
	public void setup() {
		account = new Account(10000);
	}

	@Test
	public void testAccount() throws Exception {

	}

	@Test
	public void testGetBalance() throws Exception {

		assertEquals("10000원으로 계좌 생성 후 잔고 조회", 10000, account.getBalance());

		account = new Account(1000);
		assertEquals("1000원으로 계좌 생성 후 잔고 조회", 1000, account.getBalance());

		account = new Account(0);
		assertEquals("0원으로 계좌 생성 후 잔고 조회", 0, account.getBalance());
	}

	@Test
	public void testDeposit() throws Exception {

		account.deposit(1000);
		assertEquals(11000, account.getBalance());
	}

	@Test
	public void testWithdraw() throws Exception {

		account.withdraw(1000);
		assertEquals(9000, account.getBalance());
	}
	
	@Test
	public void testSavePassword() throws Exception {
		UserRegister register = new UserRegister();
		Cipher cipher = new MockMD5Cipher();
		
		String userId = "sweet88";
		String password = "potato";
				
		register.savePassword(userId, cipher.encrypt(password));
		String decryptjPassword = cipher.decrypt(register.getPassword(userId));
		assertEquals(password, decryptjPassword);
		
	}

}
