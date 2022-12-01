package FunctionsCall;

public class Square {
	public int square (int a)
	{
		return(a*a);
	}
	public static void main(String[] args) {
		Square s=new Square();
		System.out.println(s.square(7));
	}

}
