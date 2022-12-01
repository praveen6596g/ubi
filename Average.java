package FunctionsCall;

public class Average {
 public void average(int tamil,int english,int maths,int science,int social,int average) {
	 System.out.println("average="+(tamil+english+science+social+maths)/average);
	 
	 
 }
 public static void main(String[] args) {
	 Average ad=new Average();
	 ad.average(89, 40, 60, 70, 80,5);
 }
}
