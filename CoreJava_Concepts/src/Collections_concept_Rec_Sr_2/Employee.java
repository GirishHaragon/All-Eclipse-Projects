package Collections_concept_Rec_Sr_2;

public class Employee {
	private String firstName;
	private String lastName;
	private int id;
	
	//We will create a constructor, Employee const which would take firstName, lastName & id
	Employee(String firstName, String lastName, int id){
		//To initialize the elements we use this keyword. Then we initialize all the variables.
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}