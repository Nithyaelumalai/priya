package Demo;

public class Demo2  {
	
	static int a=20;
	int c=50;
	public static void main(String[] args) {
		
		System.out.println("Static variable-"+ a);
		
		int c=10;
		System.out.println("Local variable -"+ c);
		
		
		Demo2 a = new Demo2();
		System.out.println(a.c);
		
	}

}
