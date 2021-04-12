package in.sts.mysecondproject;

public class Entity {
	
	private int id;
	private String name;
	public void hi()
	{
		System.out.println("initializing.......");
	}
	public void bye()
	{
		System.out.println("destroying.......");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Entity [id=" + id + ", name=" + name + "]";
	}
	

}
