package week3.day1;

public class AxisBank extends BankInfo{
	
	public void deposit()
	{
		System.out.println("Deposit in Child class level");
	}

	public static void main(String[] args) {
		AxisBank bnk = new AxisBank();
		bnk.deposit();
		bnk.saving();
		bnk.fixed();
	}
}
