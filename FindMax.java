package FunctionsCall;

public class FindMax {
	public void Max(int a,int b,int c) {
		if(a>b&&a>c)
		{
			System.out.println(a);
			
		}
		else if(b>a&&b>c)
		{
			System.out.println(b);
		}
		else if(c>a&&c>b)
		{
			System.out.println(c);
		}
	}
		public static void main(String[] args) {
			FindMax m=new FindMax();
			m.Max(7, 8, 10);
		
		}

}
