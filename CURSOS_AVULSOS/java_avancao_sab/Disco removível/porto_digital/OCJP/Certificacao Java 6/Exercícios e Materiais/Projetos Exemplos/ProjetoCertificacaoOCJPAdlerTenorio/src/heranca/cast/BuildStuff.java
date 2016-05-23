package heranca.cast;

public class BuildStuff {
	
	
	class Animal {
	    public String noise() {
	        return "peep";
	    }
	}

	class Dog extends Animal {
	    public String noise() {
	        return "bark";
	    }
	}

	class Cat extends Animal {
	    public String noise() {
	        return "meow";
	    }
	}

	public  void imprimir() {
		Animal animal = new Dog();
		Cat cat = (Cat)animal;
		System.out.println(cat.noise());
	}
	
	public static void main(String[] args) {
		BuildStuff b = new BuildStuff();
		b.imprimir();
	}
	
}
