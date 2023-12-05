package Collections_concept_Rec_Sr_2;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrLst {//All of this Collection concepts r present in Java.Util package.
	public static void main(String[] args) {
		ArrayList x = new ArrayList();//The field <> is called Generics. //We r creating an object of arrayList. So we should understand that by this a DataStructure gets created with a Initial size of 10indexes. After storing 10 elements in it, the size of the array increase to 15 automatically/dynamically that is 1.5x of initial size. And all the values stored based on the index no.
		x.add(10);//To store the values as objects inside array we have built-in method add().
		x.add(20);//This add() method will return boolean value.
		x.add(new Integer(10));//The values are getting wrapped into Integer Wrapper class & getting stored into array indexes as Objects(Integer). This is called as Boxing.
		x.add(30);//Here also it is happening to be Boxing.
		//That's why ArrayList is a Collection. And Collection is a group of objects.
		//That means, whatever values we r storing r not just primitive data, but actually converting those values into Objects & putting inside index of array.
		//Now we can see a lot of warnings because of not using Generics in our ArrayList.
		
		//We can store heterogeneous values in ArrayList when no generic is applied, but that's not a good practice.
		x.add("Pankaj");//We don't get any error for heterogeneous values insertion. It still works.
		x.add(true);
		x.add(10.3);
		
		System.out.println(x);//We can see here a lot of warning messages here. Because even compiler also don't want us to store Heterogeneous values in AL, and suggests to use with generic AL.
		
		//To avoid keeping heterogeneous data in ArrayList we go for Collection with Generic..
		ArrayList<Integer> y = new ArrayList<Integer>();//For applying Generic we use Wrapper class within Angular beackets. We cannot store any value other than Integer.
		y.add(25);//Now we can see the warning messages will not appear. Bcz the compiler didn't want to store heterogeneous data in ArrayList.
		y.add(29);
		y.add(30);
		
		System.out.println("addMethod():"+y);//By writing this String in this stmnt, we can understand what addMethod() is it's adding the elements to the ArrayList.
		y.add(1, 500);//Here we are using add method with index number specified to insert element in between..
		System.out.println("add(index, value) method():"+y);//Now we should get the clarity why it is called as a Framework. Bcz there r so many readily available logic present inside methods, simplifying our work like anything. We need not build the logic.
		
		ArrayList<Integer> z = new ArrayList<Integer>();
		z.add(300);
		z.add(500);
		
		y.addAll(2, z);//Using this addAll() we can give the variable of other collection in it. So z is a Collection here. Let's take z and put that in y ArrayList. So to an existing ArrayList, we can take the data from another ArrayList, at the specified index & put into it.
		System.out.println("addAll(index, collection) method()"+y);
		//add() will add the values at the end of the Array, which means it'll add in sequence.
		//If we give addAll() method collection with index no, there is another ArrayList it will inject that data at the position we want.
		
		if(z.contains(500)){//We can see in the proposal in contains method that the values are in Object form. ArrayList is taking the values as Integer, not int values. So Integer is a Wrapper class. Whenever the data is stored in the Wrapper class, what happens is it created an Object for every values.
			//So what contains() does is, it is like Search operation, it searches whether the value is present in the ArrayList or not.
			System.out.println("Yes Present");//It is saying that 500 value is present in the z ArrayList.
		}else {
			System.out.println("Not present");
		}
		
		y.remove(1);//But here we r not able to write z collection.
		System.out.println("remove(index) method():"+y);

		System.out.println(y.indexOf(0));//Here to obtain the value based on index number, we r trying with indexOf() method. But it's not giving the required data. And for any value it is giving -1 data.
		System.out.println(y.get(1));//So this get method gives the value based on index no. So if we want to read the data based on the index number, we have to use the get() method. We cannot write y(0) or anything y[0].
//		System.out.println(y[1]);//Error.
		
		//Using Iterator how we can read the values from an ArrayList.
		Iterator itr = y.iterator();//We have to import it from util package only. This Iterator helps us out to build a while loop and read the data..
		while (itr.hasNext()) {//We should all know that what hasNext() method does. It will just check is there a data present in our collection, if yes then it'll enter the while loop and itr.next() method would fetch the value.
			System.out.println("Value of x:"+itr.next());
		}//We have done something similar in database, String Tokenizer.
		//What hasNext() does is it checks is there a element, if yes, it returns true, and the next() method will read the data one by one.
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
	}
}