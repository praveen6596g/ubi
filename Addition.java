package FunctionsCall;

public class Addition {
	public int addition() {
	int tamilMark=80;
	int mathsMark=99;
	int total=tamilMark+mathsMark;
	return total;
	}
	public static void main(String[] args) {
		Addition add=new Addition();
		System.out.println(add.addition());
	}

}
