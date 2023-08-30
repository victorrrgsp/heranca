package Entities;

// é uma sub classe
// essa classe é uma extenção, onde terá todos os dados e comportamentos da classe Account
public class BusinessAccount extends Account {

    private Double loanLimit;

    public BusinessAccount (){
        // se uma logica for acrescentada no construtor padrão, essa logica tambem será ezecutada no construtor da subClass
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        // chama o construtor da super class com os argumentos, pela palavra super
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void Loan(double amount){
        if (amount <= loanLimit){
            balance += amount - 10.0;
        }
    }
}
