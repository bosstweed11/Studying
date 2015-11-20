package sorting;

/*
 * Merge Sort
 * 
 * 	Initialize
 * 		set the static array variables so we can manipulate them in all the functions
 * 		and not worry about returning
 * 
 * 	Move to small arrays
 * 
 * 
 * 	Merge
 */
public class MergeSort {
	private static int [] array;
	private static int [] tempArray;
	public static void main(String [] args){
		int [] data = {
				2,9,65,14,12,96,15,1,4,3,6,14
		};
		printArray("Before Sort", data);
		
		mergeSort(data);
		
		printArray("After Sort", data);
	}
	
	private static void printArray(String title, int [] data){
		System.out.println(title);
		for (int i = 0; i < data.length; i++){
			System.out.print(data[i] + " ");
		}
	}
	
	private static void mergeSort(int [] data){
		int length = data.length;
		array = data;
		tempArray = new int [length];
		merge(0, length - 1);
	}
	
	private static void merge(int leftIndex, int rightIndex){
		if (leftIndex < rightIndex){
			int middle = leftIndex + (rightIndex - leftIndex) / 2;
			merge(leftIndex, middle);
			merge(middle + 1, rightIndex);
			mergeParts(leftIndex, middle, rightIndex);
			
		}
	}
	
	private static void mergeParts(int leftIndex, int middle, int rightIndex){
		for(int i = leftIndex; i <= rightIndex; i++){
			tempArray[i] = array[i];
		}
		
		int i = leftIndex;
		int j = middle + 1;
		int k = leftIndex;
		
		while ( i <= middle && j <= rightIndex){
			if (tempArray[i] < tempArray[j]){
				array[k] = tempArray[i];
				i++;
			}
			else{
				array[k] = tempArray[j];
				j++;
			}
			k++;
		}
		
		while (i <= middle){
			array[k] = tempArray[i];
			i++;
			k++;
		}
	}
}
