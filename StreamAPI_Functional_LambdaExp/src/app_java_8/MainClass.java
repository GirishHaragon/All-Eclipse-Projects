package app_java_8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//Lets assume it to be Service Class. Of course we r not using any Annot @Service.
public class MainClass {
	public static void main(String[] args) {
		Post post1 = new Post();
		post1.setId(1);
		post1.setName("Mike");
		Post post2 = new Post();
		post2.setId(2);
		post2.setName("Stallin");
		Post post3 = new Post();
		post3.setId(3);
		post3.setName("Satish");
		
		List<Post> posts = Arrays.asList(post1,post2,post3);//We have a List of 3 objects, which are entity object. Now we need to convert these 3 entity object into dto object.
		System.out.println(posts);//This will print these 3 object adresses before conversion to PostDto
		
		//Stream API is applied on a collection (List is a Coll). 
		List<PostDto> postDto = posts.stream().map(p->mapToDto(p)).collect(Collectors.toList());//We have made mapToDto method static bcs we would be calling this mapToDto method without creating Object. Here 'p'(variable) denotes every element of the Array List. Initially p will be post1, we r taking the post1, sending it to mapToDto->dto obj, there it will convert it to dto, & that dto is stored into the List by this line. then p will take post2, sending it to post & it will convert it to dto(postDto) & that dto is stored into List and same goes to all  the records in List. Now we assign it to new local var.
		//By the above stream Api means whatever posts objects were there we have converted that in one line into postDto. Which is something very much important for us.
		System.out.println(postDto);//This will print all 3 object which are dtos(postDto)
	}
	
	//Now to convert that to DTO we have a method called mapToDto which will take the entity object 1by1, and it'll convert that entity object into PostDto object.
	static PostDto mapToDto(Post post){
		PostDto dto = new PostDto();
		dto.setId(post.getId());//Using this we are storing post entity values inside dto object using setter method of dto and getter method of entity.
		dto.setName(post.getName());
		return dto;
	}
}