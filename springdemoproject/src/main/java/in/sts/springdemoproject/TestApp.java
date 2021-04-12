package in.sts.springdemoproject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sts.springdemoproject.config.EmployeeConfig;
import in.sts.springdemoproject.entities.Employee;

public class TestApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		Employee empref = context.getBean(Employee.class);
		empref.setId(1);
		empref.setName("Gautam Kumar");
		empref.setAddress("Nagpur");
		
		System.out.println("Id = "+empref.getId()+ " Name = "+empref.getName()+" Address : "+empref.getAddress()+ " hashcode = " + empref.hashCode());
	
		Employee empref2 = context.getBean(Employee.class);
		empref2.setId(2);
		empref2.setName("Rakesh Kumar");
		empref2.setAddress("Tata Nagar");
		
		System.out.println("Id = "+empref2.getId()+ " Name = "+empref2.getName()+" Address : "+empref2.getAddress()+ " hashcode = " + empref2.hashCode());
	}

}
