package sortArray;

import java.util.HashMap;
import java.util.Map;



public class countMembers {

	public static void main(String[] args) {
		
				
		int[] array = {30,50,30,30,50,50,60,80,50,60,80,80,90,20,80,82,60,50,80,90,20,80,60};
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int a: array){
			
			if(map.containsKey(a)){
				map.put(a, map.get(a)+1);
			}
			else{	
				map.put(a, +1);
			}
		}
		System.out.println(map.toString());
	}

	

}
