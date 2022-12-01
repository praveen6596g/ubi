package FunctionsCall;

public class FindM {
	public int value(int []a) {
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		return(max);
	}
public static void main(String[] args) {
	FindM m=new FindM();
	int [] age= {20,25,22,19,30};
	System.out.println(m.value(age));
}
}
