package in.sts.myfifthproject.aop;

import org.springframework.stereotype.Component;

@Component
public class AfterReturnExample {
	
	public int m()
	 {
		 System.out.println("m() method invoked");
		 return 2;
	 } 
}
