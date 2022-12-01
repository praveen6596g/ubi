package FunctionsCall;

public class UseBank {
	public static void main(String[] args) {
		Bank a=new Bank();
		a.mainBalance=50000;
		a.depositAmount=15000;
		a.bankName="sbi";
		System.out.println(a.Credit(a.mainBalance,a.depositAmount));
		a.Debit(a.mainBalance,a.depositAmount);
	}
	

}
