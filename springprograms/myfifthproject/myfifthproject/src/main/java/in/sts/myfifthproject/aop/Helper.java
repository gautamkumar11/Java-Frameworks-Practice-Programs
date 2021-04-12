package in.sts.myfifthproject.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Helper {
	
	@Before("execution(public void show())")
	public void beforeLog()
	{
		System.out.println("log called");
	}
	@After("execution(public void show())")
	public void afterLog()
	{
		System.out.println("afterLog called");
	}
	
	@Around("execution(public void show())")
	public void around(ProceedingJoinPoint pjp) throws Throwable
	{
		System.out.println("Additional Concern Before calling actual method");
		pjp.proceed();
		System.out.println("Additional Concern After calling actual method");
	}
	
	@AfterReturning(pointcut = "execution(public int m())", returning = "result")
	public void afterReturningAdvice(JoinPoint jp, Object result)
	{
		System.out.println("afterReturningAdvice is called by m()");
		System.out.println("Method Signature: "  + jp.getSignature());  
        System.out.println("Result in advice: "+result);  
	}
	
	@AfterThrowing(pointcut = "execution(public void validate())", throwing = "error")
	public void afterThrowingAdvice(JoinPoint jp, Object error) {
		System.out.println("@AfterThrowing is called by validate..... ");
		System.out.println("Method Signature: "  + jp.getSignature());  
	    System.out.println("Exception is: "+error);  
	    System.out.println("end of after throwing advice...");  
	}
	
	
}
