package CustructorAndStrings;

public class Person {
	//Hellos

	String name;
	int id;
	
	public Person(int p_id, String p_name) {
		 id= p_id;
		 name = p_name;
		System.out.println("Constructor called");
	}
	
	public Person() {
		id= 10;
		name="Default";
		System.out.println("Default Constructor called");
	}
	
	public Person(String name) {
		 id= 0;
		 this.name = name;
		System.out.println("1 Arguument Constructor called");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person pooja = new Person(25, "Pooaj Sheety");
		pooja.walk();
		
		Person Deepak = new Person(37, "Deepak Tijori");
		Deepak.walk();
		
		Person HelloDefault = new Person();
		HelloDefault.walk();
		
		Person OneArg = new Person("One Argument name");
		OneArg.walk();
		
		System.out.println(OneArg.name.indexOf('A'));
		System.out.println(OneArg.name.toUpperCase());
		System.out.println(OneArg.name.toLowerCase());
		System.out.println(OneArg.name.indexOf('A'));
		
		
		
		
	}
	
	
	public void walk() {
		System.out.println("Age:"+id+"   Name:"+name+ "");
	}

}
