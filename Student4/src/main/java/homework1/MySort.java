package homework1;

import sorting.ISort;

public class MySort implements ISort {

	@Override
	public void sort(int[] array) {
		for(int i = 0; i < array.length; ++i) {
			for(int j = 0; j < array.length; ++j) {
				if(array[i] < array[j]) {
					int temp = array[j];
					array[i] = array[i];
					array[j] = temp;
				}
			}
		}
	}
}
