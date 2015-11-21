package dataStructures.hashTable;


public class LinearProbingHashTable<Key, Value> implements STInterface<Key, Value> {
	
	private static final int INIT_CAPACITY = 4;
	private Key [] keys;
	private Value [] values;
	private int size;
	private int capacity;
	private int probes;
	private boolean resizing;
	
	public LinearProbingHashTable(){
		this(INIT_CAPACITY, true);
	}
	
	public LinearProbingHashTable(int capacity, boolean resizing){
		this.capacity = capacity;
		this.resizing = resizing;
		this.keys = (Key[]) new Object[capacity];
		this.values = (Value[]) new Object[capacity];
	}
	
	public int size(){
		return this.size;
	}
	
	public boolean isEmpty(){
		return this.size() == 0;
	}
	
	public boolean contains(Key key){
		return this.get(key) != null;
	}
	
	public void put(Key key, Value value){
		if (value == null)
			this.delete(key);
		
		if (this.size >= this.capacity / 2)
			this.resize(2 * this.capacity);
		
		int i;
		for (i = hash(key); this.keys[i] != null; i = (i + 1) % this.capacity){
			if (keys[i].equals(key)){
				this.values[i] = value;
				return;
			}
		}
		this.keys[i] = key;
		this.values[i] = value;
		this.size++;
	}
	
	private void resize(int capacity){
		if (this.resizing){
			LinearProbingHashTable<Key, Value> temp = new LinearProbingHashTable<Key, Value>(this.capacity, true);
			for (int i = 0; i < this.capacity; i++){
				if (keys[i] != null){
					temp.put(this.keys[i], this.values[i]);
				}
			}
			this.keys = temp.keys;
			this.values = temp.values;
			this.capacity = temp.capacity;
		}
	}
	
	private int hash(Key key){
		return (key.hashCode() & 0x7fffffff) % this.capacity;
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
