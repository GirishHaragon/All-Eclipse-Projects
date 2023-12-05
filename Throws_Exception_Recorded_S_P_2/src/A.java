import java.io.FileWriter;

public class A {
	
	public static void main(String[] args) throws Exception{//Or instead of surrounding a1.test(); with try/catch block, we can write throws Exception in-front of this main Method only.
		A a1 = new A();
		a1.test();//To avoid Unhandled Exception we surround this line with try/catch block.
		//Unhandled Exception passed by the throws Exception from test method.
	}
	public void test() throws Exception{
		FileWriter fw = new FileWriter("D://test.txt");//Now here we can see Compile Time Exception, if throws Exception not used.
	}
}