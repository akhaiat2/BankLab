
public class Account {
	private final int idNumber;
	private int currentBalance;
	private int numberOfTransactions;
	
	public Account(int idNumber, int currentBalance, int numberOfTransactions) {
		this.idNumber = idNumber;
		this.currentBalance = currentBalance;
		this.numberOfTransactions = numberOfTransactions;
	}
	
	//getters, withdraw and deposit
	
	public void deposit (int depositAmount) {
		currentBalance = currentBalance + depositAmount;
	}
	
	public void withdraw (int withdrawalAmount) {
		if (currentBalance >= withdrawalAmount)
		currentBalance = currentBalance - withdrawalAmount;
	}
	
	public int getIdNumber () {
		return idNumber;
	}
	
	public int getCurrentBalance () {
		return currentBalance;
	}
	
	public int getNumberOfTransactions() {
		return numberOfTransactions;
	}
}
