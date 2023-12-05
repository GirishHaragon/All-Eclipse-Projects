package p2;

public class PostServiceImpl {
	public static void main(String[] args) {
		PostEntity postEntity = new PostEntity();//Object of PostEntity is created.
		PostDto objectPostDto = PostServiceImpl.getObjectPostDto(postEntity);//We can see the only warning that objectPostDto is not used. bcz we will be using it where we need to convert dto to entity.
	}
	
	public static PostDto getObjectPostDto(PostEntity post) {
		PostDto postDto = new PostDto();
		postDto.setId(post.getId());
		postDto.setAge(post.getAge());
		return postDto;
	}
}