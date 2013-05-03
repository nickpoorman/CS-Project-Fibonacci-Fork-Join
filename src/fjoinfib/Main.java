package fjoinfib;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.*;

public class Main {
	
	public static void main(String args[]){
		ForkJoinPool pool = new ForkJoinPool();		
		Integer tmp = pool.invoke(new Fib(42));
		System.out.println(tmp.intValue());
	}
}
