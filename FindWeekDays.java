package FunctionsCall;

public class FindWeekDays {
	public void FindDay(int week) {
	
	
		switch(week) {
		case 1: System.out.println("sunday");break;
		case 2: System.out.println("monday");break;
		case 3: System.out.println("tuesday");break;
		case 4: System.out.println("wednesday"); break;
		case 5: System.out.println("thursday");break;
		case 6: System.out.println("Friday");break;
		case 7: System.out.println("saturaday");break;
		}
	}
	public static void main(String[] args) {
		FindWeekDays wd=new FindWeekDays();
		wd.FindDay(5);
	}

}
