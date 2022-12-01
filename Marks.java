package FunctionsCall;

public class Marks {
	public String mark(int tamilMark,int mathsMark,int englishMark,int scienceMark ) {
		return "tamil=" +tamilMark+"Maths="+ mathsMark+"english=" + englishMark+"science"+ scienceMark;
		
	}
	public static void main(String[] args) {
		Marks ma=new Marks();
		System.out.println(ma.mark(69,78,97,72));
		
	}

}
