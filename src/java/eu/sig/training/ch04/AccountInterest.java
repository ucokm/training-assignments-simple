package eu.sig.training.ch04;

public abstract class AccountInterest {
    private Money balance = new Money();
	
	public abstract Transfer makeTransfer(String counterAccount, Money amount) throws BusinessException;
	
	private void addInterest(float interestPercentage) {
        Money interest = balance.multiply(interestPercentage);
        if (interest.greaterThan(0)) {
            balance.add(interest);
        } else {
            balance.substract(interest);
        }
    }
	
	protected int calculateAccountNumber(String counterAccount) {
		int sum = 0;
        for (int i = 0; i < counterAccount.length(); i++) {
            char character = counterAccount.charAt(i);
            int characterValue = Character.getNumericValue(character);
            sum = sum + (9 - i) * characterValue;
        }
		return sum;
	}
}
