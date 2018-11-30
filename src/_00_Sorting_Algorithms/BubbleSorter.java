package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
	public BubbleSorter() {
		type = "Bubble";
	}
	
	//1. Use the bubble sorting algorithm to sort the array.
	//   You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		for (int z = 0; z < array.length; z++) {
			
		
		for (int i = 0; i < array.length-1; i++) {
			if(array[i] > array[i+1]) {
				int uno= array[i];
				int dos = array[i+1];
				
				array[i] = dos;
				array[i+1] = uno;
				display.updateDisplay();
			}
		}
	}
	}
}
