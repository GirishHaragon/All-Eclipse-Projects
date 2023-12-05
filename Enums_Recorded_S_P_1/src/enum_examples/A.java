package enum_examples;

public class A {
	public static void main(String[] args) {
		System.out.println(Calender.Oct);//When u r referring to Enum, we can select only those members inside enum, we cannot select a member which is ideally not a part of Enum.
		
		//Whatever months present in the Enum are constants. So constants are shown as a collection in Enum, We will be using it in Advance development, but not very much, when we r developing a software, but actually there r lot of built-in instances where we see these enums. Built-in features will have Enums. 
		//One case where we can use Enums is when we r building name Salutations (Like Mr, Ms Dr, Prof) probably we can build Enum there.
		//But we are not using Enums in developing a software, but there are built in features, which happens to consist of Enums. Wherever we use enums we should immediately understand that, Enum has got Collection of Constants & it is one of the constant in it, like Oct is one of the constant thats present in Calender & Calender here is Enum.
		//But when we r working wih spring boot projects / working with advance java, we never use Enums effectively there.
		
	}
}
