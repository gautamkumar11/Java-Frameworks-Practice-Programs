package in.sts.myfourthproject.autowiring.stereotype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("in/sts/myfourthproject/autowiring/stereotype/stereotypeconfig.xml");
		
		Person person1 =  (Person) context.getBean("personDetails");
		System.out.println(person1);
		
		Person person2 =  (Person) context.getBean("personDetails");
		System.out.println(person2);
		
		if(context!=null) {
			context.close();
		}
	}

}
