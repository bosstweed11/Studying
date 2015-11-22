package dataStructures.hashTable;


public class HashTableTest {
	public static void main(String [] args){
		System.out.println("start");
		Integer[] data = {
				2,9,65,14,12,96,15,1,4,3,6,14
		};
		String [] keys = {
				"first", "second", "third", "fourth", "fifth", "sixth", "seventh",
				"eigth", "ninth", "tenth", "eleventh", "twelveth"
		};
		LinearProbingHashTable<String, Integer> h = new LinearProbingHashTable<String, Integer>();
		for(int i = 0; i < data.length; i++){
			h.put(keys[i], data[i]);
		}
		Integer test = h.get("third");
		System.out.println("test: " + test);
		h.delete("third");
		
		test = h.get("third");
		System.out.println("test: " + test);
		
		test = h.get("fourth");
		System.out.println("test: " + test);
	}
}
