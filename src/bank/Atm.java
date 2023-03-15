package bank;

public class Atm {
	private double balance;
	private double depositeAmt;
	private double withdrawamt;
	
	public Atm() {
		
		
	}
	
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getDepositeAmt() {
		return depositeAmt;
	}
	public void setDepositeAmt(double depositeAmt) {
		this.depositeAmt = depositeAmt;
	}
	public double getWithdrawamt() {
		return withdrawamt;
	}
	public void setWithdrawamt(double withdrawamt) {
		this.withdrawamt = withdrawamt;
	}

}
