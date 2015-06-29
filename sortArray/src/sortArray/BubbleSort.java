package sortArray;

public class BubbleSort {

	public static void main(String[] args) {
		int[] array = { 56, 45, 22, 3, 758, 4, 222, 211, 345, 7 };
		class Sorter{
			int x = 1;
			void bubbleSort(int[] array){	
				if(x < array.length){
					for (int i = 0; i < array.length-x; i++) {
						if (array[i] > array[i+ 1] ) {
							int tmp = array[i];
							array[i] = array[i + 1];
							array[i + 1] = tmp;
							}
					}
					for (int a : array) {
						System.out.println(a);
					
					}
					System.out.println("end" + x);
					x++;
					bubbleSort(array);
				}
		
			}
		}
		Sorter s = new Sorter();
		s.bubbleSort(array);
		System.out.println("FINAL:");
		for (int a : array) {
			System.out.println(a);
		}

	}

	

}
