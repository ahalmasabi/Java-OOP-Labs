
public class DogClass extends Animal implements AnimalName{

public DogClass(String name, int legs) {
	super(name, legs);
	
}

	public String eat() {
		return "I eat Dog food";
	}

	public String sleep() {
		return "I sleep 6 hours";
	}

	public String toString() {
		return "I am a Dog my name is: " + name + ", I have " + legs + " legs, " + eat() + ", " + sleep() ;
	}

}
	
	
	


