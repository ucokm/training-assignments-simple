package eu.sig.training.ch04;

public abstract class AccountInterest {
    private Money balance = new Money();
    private float interestPercentage;
	
	public abstract Transfer makeTransfer(String counterAccount, Money amount) throws BusinessException;
	
	public void setInterestPercentage(float val) {
		interestPercentage = val;
	}
	
	public void addInterest() {
        Money interest = balance.multiply(interestPercentage);
        if (interest.greaterThan(0)) {
            balance.add(interest);
        } else {
            balance.substract(interest);
        }
    }
}
