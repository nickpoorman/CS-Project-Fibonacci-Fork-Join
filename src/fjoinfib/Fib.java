package fjoinfib;

import java.util.concurrent.*;

public class Fib extends RecursiveTask<Integer>{

	Integer arg;

	Fib(Integer arg){ this.arg = arg; }

	public Integer compute(){
		int n = arg;
		if(n < 2)
			return n;
		else{
			Fib f1 = new Fib(n-1);
			f1.fork();
			Integer r2 = new Fib(n-2).invoke();
			return r2 + f1.join();
		}
	}

}
