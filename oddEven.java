package FunctionsCall;

public class oddEven {
	public String Find(int number) {
		if(number%2==0) {
			return("is even");
		}
		else
		{
			return("is Odd");
		}
		
	}
	public static void main(String[] args) {
		oddEven oe=new oddEven();
		System.out.println(oe.Find(8));
	}

}
