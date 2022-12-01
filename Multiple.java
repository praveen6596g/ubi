package FunctionsCall;

public class Multiple {
	public int multiple (int tamilMark,int mathsMark) {
		return(tamilMark*mathsMark);
	}
	public static void main(String[] args) {
		Multiple mul=new Multiple();
		System.out.println(mul.multiple(80,99));
	}
	

}
