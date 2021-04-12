package in.sts.mythirdproject.entity;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRun {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = null;
        context = new ClassPathXmlApplicationContext("in/sts/mythirdproject/entity/entityconfig.xml");
   	
        Run run1 = (Run)context.getBean("run");
        System.out.println("Address of run1 : "+run1.hashCode());
        Run run2 = (Run)context.getBean("run");
        System.out.println("Address of run1 : "+run2.hashCode());
        if(context!=null)
        {
       	 context.close();
        }
	}

}
