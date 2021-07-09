package mentor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DuplicateElementWithRanage {

	public static void duplicateElementsNaive(ArrayList<Integer> arr) {
		arr.sort(null);
		// System.out.println(arr);
		int count = 0;
		if (arr.size() >= 2) {
			for (int i = 0; i < arr.size() - 1; i++) {
				if (arr.get(i) == arr.get(i + 1)) {
					count++;

				} else {
					if (count > 0)
						System.out.println(arr.get(i));
					count = 0;
				}

			}
			if (arr.get(arr.size() - 1) == arr.get(arr.size() - 2))
				System.out.println(arr.get(arr.size() - 1));
		}
		/*
		 * else there will be no duplicates
		 */
	}

	public static void duplicateElements(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < arr.length) {
				if (arr[arr[i]] > arr.length) {
					if (!(map.containsKey(arr[i]))) {
						
						map.put(arr[i], i);
					} else
						arr[arr[i]] = arr[arr[i]] + arr.length;
				} else {
					if (!(map.containsKey(arr[i] - arr.length))) {
					
						map.put(arr[i] , i);
					}
				}
			}
		}

		if (!(map.isEmpty())) {
			for (Integer i : map.keySet()) {
				System.out.println(i);
			}
		}

	}

	public static void duplicateElementsOptimized(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			//why mod ? because when we are adding the the length again and again it will go out of range 
			// for ex element = 1 , size = 7 , 1+7 = new element , now arr[8] .. -> out of range so to avoid that use mod
			
			arr[arr[i] % arr.length] = arr[arr[i] % arr.length] + arr.length;
				
		}
		System.out.println("The repeating elements are : ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= arr.length * 2) { // why *2 , coz , if 1 element is occuring twice then we would be adding the length twice
                System.out.println(i + " ");
            }
        }
		
	}

	public static void main(String args[]) {
		int a[] = { 1, 1, 3, 1, 3, 6, 6, 1, 4, 4, 4

		};
		ArrayList<Integer> arr = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			arr.add(a[i]);
		}
		System.out.println("Naive");
		duplicateElementsNaive(arr);
		System.out.println("Mine");
		duplicateElements(a);
		System.out.println("Optimized");
		duplicateElementsOptimized(a);
	}
}
