package sortArray;

public class SortArray {

	public static void main(String[] args) {
		int[] array = { 56, 45, 22, 3, 758, 4, 222, 211, 345, 7 };
		for (int i = 0; i < array.length-1; i++) {
			if (array[i] > array[i+ 1] ) {
				int tmp = array[i];
				array[i] = array[i + 1];
				array[i + 1] = tmp;
				i = -1;
				for (int a : array) {
					System.out.println(a);
					
				}
				System.out.println("end");
			}
		}
		for (int a : array) {
			System.out.println(a);
		}

	}

}
