package Collections_concept_Rec_Sr_2;

import java.util.HashMap;
import java.util.Map;

public class HashMap_ex {
	public static void main(String[] args) {
		Map<Integer, String> studentInfo = new HashMap<>();//Here we purposefully written Map instead of HashMap, bcz Map is the parent interface of HashMap and it has the capability to hold the child class or interface object address in it. Which is again Class Up-Casting. Bcz we need to store the values in Key-Value pair we need to give the generic as <Key, Value> pair. And the key and values can be of any DT.
		studentInfo.put(100, "Pankaj");
		studentInfo.put(101, "Ravi");
		studentInfo.put(102, "Sam");
		
		System.out.println(studentInfo);//We can see the values are stored in Key-Value pair.
		System.out.println(studentInfo.get(102));//Based on the Key we can fetch the value in a HashMap using get() method present in HashMap.
		System.out.println(studentInfo.values());//Using values() method we can get/fetch only the values present in HashMap.
		
		//One practical implementation we can think as, in Shopping malls, there will be many products for which different ProductIds will be given and for ex if we take there is a Carrot present in Vegetables section for which ProductId is 100. And that 100 key is not only for a single carrot right, it is same for all the carrots. We can provide product Id in a Barcode form. In such case Key will be productId 100 and the value will be Carrot. And then they can put the sticker on the products and then consumers can take them to billing counter and get it billed by the ProductId. That's how they keep records of products in Malls. This one basic implementation of HashMap.
		//HashMap would play a Major role, in the above case wherever Java is used for developing a software from which they will take the data from the DB and put that into a HashMap, so that once for all we will fetch the data from DB and put into HashMap the performance will be better. They need not interact every time with the DB. But if we Shutdown the Computer, the HashMap will be gone, again when we restart the computer the data should be fetched from the DB to the HashMap again bcz accessing the data from the HashMap is faster than compared to data accessing from a DB directly.
		//So how we read the data from the DB, how we structure that particular data these all we should understand.
		//Interviewer might ask where will you practically use HashMap?
		
		//If we need to get all the keys stored in the HashMap. If somebody is asking what all products/things do they have in the Shopping mall? then we would need to get all the keys/productIds using the below method.
		System.out.println(studentInfo.keySet());//The return type of keySet() is a Set (Interface) which is implemented by Collection. Super most Interface in Java - Collection. Set cannot consist of duplicate values.
	}
}