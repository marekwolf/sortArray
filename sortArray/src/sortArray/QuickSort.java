package sortArray;

public class QuickSort {

	public static void main(String[] args) {
		int[] array = { 56, 45, 22, 3, 758, 4, 222, 211, 345, 7 };
		class Sorter{
			void quickSort(int[] a, int lo, int hi){
				
				if(lo < hi){
					int pivot=a[hi];
					int pivotindex = lo;
					System.out.println("PIVOT:" + pivot);
					for(int i = lo; i < hi; i++){
						
						if(a[i] < pivot){
							int tmp = a[pivotindex];
							a[pivotindex] = a[i];
							a[i] = tmp;
							pivotindex++;
						}
						
					}
					int tmp = a[pivotindex];
					a[pivotindex] = a[hi];
					a[hi] = tmp;
					for(int ai: a){
						System.out.println(ai);
					}
					System.out.println("end");
					
					quickSort(a, lo, pivotindex-1);
					
					quickSort(a, pivotindex+1, hi);
				}	
				
			}
		}
		Sorter s = new Sorter();
		s.quickSort(array, 0, array.length-1);
		System.out.println("FINAL:");
		for(int ai: array){
			System.out.println(ai);
		}
	}

}
