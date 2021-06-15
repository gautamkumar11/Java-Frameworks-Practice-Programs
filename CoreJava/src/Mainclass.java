

class Outerclass{
	
	static int x= 5;
	int y = 2;
	
	public void show()
	{
		System.out.println("Outerclass");
	}
	
	class Innerclass{
		
		int a = 10;
	    static final int b = 20;
	    
	    public void show()
	    {
	    	System.out.println("Innerclass");
	    }
		
	}
	
	static class StaticInnerClass{
		
		static int z= 11;
		int w = 12;
		
		public void display() {
			System.out.println("StaticInnerclass");
		}
		
		public static void displaystatic() {
			System.out.println("displaystatic - StaticInnerclass");
		}
	}
}


public class Mainclass {

	
	public static void main(String args[]) {
		Outerclass obj1 = new Outerclass();
		//obj1.show();
		
		Outerclass.Innerclass obj2 = obj1.new Innerclass();
		obj2.show();
		
		Outerclass.StaticInnerClass.displaystatic();
		
		new Outerclass.StaticInnerClass().display();
	}
}
