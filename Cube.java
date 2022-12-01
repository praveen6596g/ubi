package FunctionsCall;

public class Cube {
	public void cube(int a) {
		System.out.println(a*a*a);
	}
	public static void main(String[] args) {
		Cube c=new Cube();
		c.cube(17);
	}

}
