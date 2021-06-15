package in.sts.tableperhierarchy;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import in.sts.tableperconcrete.Employee_tpc;

@Entity
@DiscriminatorValue(value = "regularemployee")
public class Regular_Employee_tph extends Employee_tph{

	@Column(name="salary")    
	private float salary;  
	  
	@Column(name="bonus")     
	private int bonus;

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}  
	  
}
