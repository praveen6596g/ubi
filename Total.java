package FunctionsCall;

public class Total {
	public String total (int tamil,int maths,int science,int english,int social)
	{
		return "total=" +(tamil+maths+science+english+social);
		
	}
	public static void main(String[] args) {
		Total to=new Total();
		System.out.println(to.total(79,76, 97, 80, 40));
	}

}
