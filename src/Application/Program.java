package Application;

import Entities.Account;
import Entities.BusinessAccount;
import Entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// upcasting
		// é um objeto que recebe uma conta empresarial, pois não da erro por que a conta empresarial tambem é uma conta
		Account acc1 = bacc;
		// está atribuindo um objeto da sub classe para a super classe, 
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

		// downcasting
		// o tipo do acc2 é Account, onde terá que fazer um casth manual, falando que o tipo dela é do mesmo tipo da sub classe
		BusinessAccount acc4 = (BusinessAccount)acc2;
		// estar chamando uma operação LOAN que está dentro de BusinessAccount, o acc2 nao pode chama a operação loan por que o acc2 é do tipo Account
		// para que o acc2 possa fazer a operação de loan em alguma vareavel do tipo Accout, necessita fazer um donwcasting
		acc4.Loan(100.0);

		// tem um plobema onde o acc3 foi instaciada como SavingsAccount, que é uma Account mas não é uma BusinessAccount
		//BusinessAccount acc5 = (BusinessAccount)acc3;

		//se o acc3 for um objeto de BusinessAccount, 
		if (acc3 instanceof BusinessAccount){
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.Loan(200.0);
			System.out.println("loan!");
		}

		// se ele for uma instacia de SavingsAccount, irá criar uma vareavel SavingsAccount
		if (acc3 instanceof SavingsAccount){
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("update!");
		}
	}
}