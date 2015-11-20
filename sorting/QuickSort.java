package sorting;


public class QuickSort {
	private static int [] array;
	public static void main(String [] args){
		int [] data = {
				2,9,65,14,12,96,15,1,4,3,6,14
		};
		printArray("Before Sort", data);
		
		quickSort(data);
		
		printArray("After Sort", data);
	}
	
	private static void printArray(String title, int [] data){
		System.out.println(title);
		for (int i = 0; i < data.length; i++){
			System.out.print(data[i] + " ");
		}
	}
	
	private static void quickSort(int [] data){
		array = data;
		qSort(0, data.length - 1);
	}
	
	private static void qSort(int low, int high){
		if (low < high){
			int p = partition(low, high);
			qSort(low, p - 1);
			qSort(p + 1, high);
		}
	}
	
	private static int partition(int low, int high){
		int pivot = array[high];
		int i = low;
		int temp;
		for (int j = low; j < high; j++){
			if (array[j] <= pivot){
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				i++;
			}
		}
		temp = array[i];
		array[i] = array[high];
		array[high] = temp;
		return i;
	}
}
