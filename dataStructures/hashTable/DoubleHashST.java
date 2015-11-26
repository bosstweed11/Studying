package dataStructures.hashTable;


public class DoubleHashST<Key, Value> implements STInterface<Key, Value>{
	
	private static final int INIT_CAPACITY = 4;
	private int size;
	private int capacity;
	private int primeNumber;
	private Key[] keys;
	private Value[] values;
	private int deleted = 0;
	private boolean resizing = true;
	private int probes = 0;
	
	public DoubleHashST(){
		this(INIT_CAPACITY, true);
	}
	
	public DoubleHashST(int initialCapacity, boolean resizing){
		this.size = 0;
		this.capacity = initialCapacity;
		primeNumber = findNextPrime(this.capacity);
		this.resizing = resizing;
		keys = (Key[]) new Object[this.capacity];
		values = (Value[]) new Object[this.capacity];
	}
	
	private int findNextPrime(int value){
		boolean found = false;
		while (!found){
			value--;
			if ( isPrime(value)){
				found = true;
			}
		}
		return value;
	}
	
	private boolean isPrime(int value){
		boolean isPrime = true;
		for ( int i = 2; i < Math.sqrt(value); i++){
			if ( value % i == 0){
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
}
