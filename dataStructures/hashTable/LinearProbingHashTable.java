package dataStructures.hashTable;


public class LinearProbingHashTable<Key, Value> implements STInterface<Key, Value> {
	
	private Key [] keys;
	private Value [] values;
	private int size;
	private int capacity;
	private int probes;
	private boolean resizing;
	
	public LinearProbingHashTable(){
		
	}
	
	public int size(){
		return size;
	}
	
	public boolean isEmpty(){
		return size() == 0;
	}
	
	public boolean contains(Key key){
		return false;
	}
	
	public void put(Key key, Value value){
		
	}
	
	public Value get(Key key){
		return null;
	}
	
	public void delete(Key key){
		
	}
	
	public Iterable<Key> keys(){
		return null;
	}
	
	public int getProbes(){
		return probes;
	}
}
