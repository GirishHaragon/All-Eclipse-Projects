package app_java_8;

//Lets assume it to be DTO Class/Payload layer. Of-course we r not using any Annot @Entity.
public class PostDto {
	private int id;
	private String name;
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
}