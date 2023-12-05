package Collections_concept_Rec_Sr_2;

import java.util.Hashtable;

public class HashTable_ex {
	public static void main(String[] args) {
		//Hashtable is a vey old concept by Java since jdk 1.0. Hashtable is a class not Interface where Naming convention is not properly done. A it is very old class such class are called Legacy class. Legacy Meaning something which is kept on passing from one to other one as a tradition or as a following rule. Examples GrandParents give their assets to their kids/children which is known as a legacy, or a traditional way of living how old ones were following the new generations will also be keep on following that legacy in their life.
		//Like that legacy class is this HashTable class was kept on using in all the versions of JDK. Right now we r not using it but that is still there since Jdk 1.0.
		//So we may get to listen from anybody that HashTable is a legacy class.
		Hashtable<Integer, String> hashTable = new Hashtable<>();
		hashTable.put(100, "Pankaj");//This looks all very same as HashMap then what is the difference? //We actually never use these things while developing a software. 
		//HashTable are actually Synchronized. We can see everywhere in HashTable class synchronized word used for all it's built-in methods.
		//So the biggest difference is actually the only thing. Which is HashTable is Synchronized. And HashMap is non-synchronized.
		//So synchronized is explained while explaining Threads concept.
		//Synchronized means we avoid data corruption we make the methods synchronized. When we make method synchronized the performance will be high bcz the program execution will be linear & faster.
		//We can clearly mention that HashMap is better in performance bcz HashMap is not Synchronized & HashTable is Synchronized. However commonly Both HashTable and HashMap internally uses HashTable and uses Hashing technique and the data is stored as a Key-Value pair. Bcz the HashMap is not synchronized, the performance of HashMap is better. And where hashTable there is Synchronized the performance would not be better. But thread safety is achieved in HashTable and not achieved in HashMap.
	}
}