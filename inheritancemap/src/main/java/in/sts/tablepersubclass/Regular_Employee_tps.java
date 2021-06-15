package in.sts.tablepersubclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import in.sts.tableperconcrete.Employee_tpc;

@Entity
@Table(name = "regular_employee103")
@PrimaryKeyJoinColumn(name = "id")
public class Regular_Employee_tps extends Employee_tps{

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

