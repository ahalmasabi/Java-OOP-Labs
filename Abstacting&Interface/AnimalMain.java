public class AnimalMain {

	public static void main(String[] args) {
		
	CatClass Cat = new CatClass("Tom", 4);
	System.out.print(Cat+"\n");
	DogClass Dog = new DogClass("Spike", 4);
	System.out.println(Dog);
	Dog.eat();

	}

}