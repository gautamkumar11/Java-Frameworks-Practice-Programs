package in.sts.DemoHib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity(name = "teacher_table")
@Table(name= "teachers_table")
public class Teacher {
	
	@Id
	private int id;
	private TeacherName name;
	@Transient
	private double mob;
	@Column(name = "teacher_department")
	private String department;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public TeacherName getName() {
		return name;
	}
	public void setName(TeacherName name) {
		this.name = name;
	}
	public double getMob() {
		return mob;
	}
	public void setMob(double mob) {
		this.mob = mob;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", mob=" + mob + ", department=" + department + "]";
	}
	
	
	

}
