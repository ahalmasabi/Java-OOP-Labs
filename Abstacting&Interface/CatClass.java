
public class CatClass extends Animal implements AnimalName{

	public CatClass(String name, int legs) {
		super(name, legs);
		
	}

	public String eat() {
		return "I eat cat food";
	}

	public String sleep() {
		return "I sleep 14 hours";
	}
	public String toString() {
		return "I am a Cat my name is: " + name + ", I have " + legs + " legs, " + eat() + ", " + sleep() ;
	}
	
	
	
}