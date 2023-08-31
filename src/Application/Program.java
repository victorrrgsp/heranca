package Application;

import Entities.Account;
import Entities.BusinessAccount;
import Entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		//polimofismo
		Account acc1 = new Account(1002, "Maria", 1000.0);
		Account acc2 = new SavingsAccount(1003, "Alex", 1000.00, 0.01);

		acc1.withdraw(50.0);
		acc2.withdraw(50.0);

		System.out.println(acc1.getBalance());
		System.out.println(acc2.getBalance());
	}
}