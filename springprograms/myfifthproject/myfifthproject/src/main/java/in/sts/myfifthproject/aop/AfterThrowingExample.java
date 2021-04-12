package in.sts.myfifthproject.aop;

import org.springframework.stereotype.Component;

@Component
public class AfterThrowingExample {
	public void validate(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("invalid age");
		}else
		{
			System.out.println("Thankl you for vote");
		}
	}
}
