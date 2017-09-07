package sorting;

import java.util.HashMap;

public class FibDP {
	static HashMap m=new HashMap();
	public static void main(String[] args) {
			m.put(0,0);
			m.put(1, 1);
			System.out.println(fib(10));
			
	}

	private static int fib(int n) {
		int value,f,f1;
			if(n==0)
				return (int) m.get(n);
			if(n==1)
				return (int) m.get(n);
			if(m.containsKey(n))
				return (int) m.get(n);
			else{
				value=fib(n-1)+fib(n-2);
				m.put(n, value);
				return value;
			}
	}

}
