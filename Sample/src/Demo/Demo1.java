package Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo1 {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(10);
		l.add("java");
		l.add(123);
		l.add(132.876544);
		
		System.out.println(l);
		 Collections.sort(l, "Hello");
		 
		 System.out.println(l);
		 Collections.sort(l);
		 
		 System.out.println(l);
		 
		
	}
	

}
