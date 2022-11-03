
public class Transaction {
	
	private final int transactionAmount;
	private int fromAccountId;
	private int toAccountId;
	
	public Transaction(int transactionAmount, int fromAccountId, int toAccountId) {
		this.transactionAmount = transactionAmount;
		this.fromAccountId = fromAccountId;
		this.toAccountId = toAccountId;
	}

	public void setFromAccountId(int newAccount) {
		this.fromAccountId = newAccount;
	}

	public void setToAccountId(int toAccountId) {
		this.toAccountId = toAccountId;
	}
	
	public int getToAccountId() {
		return toAccountId;
	}
	
	public int getFromAccountId() {
		return fromAccountId;
	}

	public int getTransactionAmount() {
		return transactionAmount;
	}
	
	
}
