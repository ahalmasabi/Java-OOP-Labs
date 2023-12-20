
public class MyData {
	private String Name;
	private int ID;
	private int Age;

	public MyData(String Name, int ID, int Age) {

		this.Name = Name;
		this.ID = ID;
		this.Age = Age;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public String getName() {
		return Name;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public int getID() {
		return ID;
	}

	public void setAge(int Age) {
		this.Age = Age;
	}

	public int getAge() {
		if (Age > 18 && Age < 23) {
			System.out.print("");
		} else {
			System.out.print("your age is out of range ");
		}
		return Age;
	}

}
//
