/*
 * 
 * Single Element in a Sorted Array
Problem Description

Given a sorted array of integers A where every element appears twice except for one element which appears once, find and return this single element that appears only once.

NOTE: Users are expected to solve this in O(log(N)) time.



Problem Constraints
1 <= |A| <= 100000

1 <= A[i] <= 10^9



Input Format
The only argument given is the integer array A.



Output Format
Return the single element that appears only once.



Example Input
Input 1:

A = [1, 1, 7]
Input 2:

A = [2, 3, 3]


Example Output
Output 1:

 7
Output 2:

 2


Example Explanation
Explanation 1:

 7 appears once
Explanation 2:

 2 appears once
 * */
package searching;

public class SingleElementInSortedArray {

	/*
	 * Naive solution TC : O(N) SC : O(1)
	 */
	public static int naiveSolve(int[] A) {
		int res = Integer.MIN_VALUE;
		int count = 0;
		for (int i = 0; i < A.length - 1;) {
			// System.out.println(A[i]+" : "+count);

			if (A[i] == A[i + 1]) {
				count += 2;
				i += 2;

			} else {
				// System.out.println("insde"+A[i+1] + "count : "+count);
				if (count != 2)
					return A[i];
				count = 0;
			}

		}

		if (res == Integer.MIN_VALUE)
			res = A[A.length - 1];

		return res;
	}

	public static int optimizedSolution(int[] A) {
		int res = Integer.MIN_VALUE;
		int low = 0, high = A.length;
		int mid;
		// Edge conditions
		if (A[0] != A[1]) {
			return A[0];
		} else if (A[A.length - 1] != A[A.length - 2]) {
			return A[A.length - 1];
		}
		while (low <= high) {
			mid = low + (high - low) / 2;
			if (A[mid] != A[mid + 1] && A[mid] != A[mid - 1]) {
				return A[mid];
			}

			if (A[mid] == A[mid - 1]) {
				if (mid % 2 != 0)
					low = mid + 1;

				else
					high = mid - 1;

			} else if (A[mid] == A[mid + 1]) {
				if (mid % 2 != 0)
					high = mid - 1;

				else
					low = mid +1;

			}

		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 91, 91, 158, 158, 167, 167, 231, 231, 238, 238, 275, 275, 289, 289, 290, 290, 306, 306, 308, 308,
				332, 332, 339, 339, 403, 403, 414, 414, 416, 416, 445, 445, 449, 449, 479, 479, 523, 523, 531, 531, 549,
				549, 563, 563, 586, 586, 648, 648, 676, 676, 717, 717, 726, 726, 754, 754, 762, 762, 827, 827, 852, 852,
				951, 951, 960, 960, 962, 962, 963, 963, 964, 964, 967, 967, 968, 968, 978, 978, 1098, 1098, 1123, 1123,
				1175, 1175, 1213, 1213, 1232, 1232, 1256, 1256, 1277, 1277, 1287, 1287, 1326, 1326, 1329, 1329, 1343,
				1343, 1408, 1408, 1438, 1438, 1444, 1444, 1467, 1467, 1528, 1528, 1563, 1563, 1620, 1620, 1625, 1625,
				1672, 1672, 1734, 1734, 1781, 1781, 1801, 1801, 1811, 1811, 1860, 1860, 1876, 1876, 1902, 1902, 1919,
				1919, 1935, 1935, 1959, 1959, 2010, 2010, 2033, 2033, 2071, 2071, 2087, 2087, 2104, 2104, 2202, 2202,
				2323, 2323, 2367, 2367, 2387, 2387, 2428, 2428, 2461, 2461, 2497, 2497, 2508, 2508, 2525, 2525, 2580,
				2580, 2700, 2700, 2764, 2764, 2804, 2804, 2821, 2821, 2827, 2827, 2845, 2845, 2846, 2846, 2864, 2864,
				2883, 2883, 2892, 2892, 2902, 2902, 2938, 2938, 2984, 2984, 3002, 3002, 3100, 3100, 3110, 3110, 3127,
				3127, 3175, 3175, 3187, 3187, 3206, 3206, 3228, 3228, 3255, 3255, 3260, 3260, 3291, 3291, 3346, 3346,
				3488, 3488, 3532, 3532, 3546, 3546, 3552, 3552, 3596, 3596, 3622, 3622, 3638, 3638, 3674, 3674, 3692,
				3692, 3696, 3696, 3800, 3800, 3822, 3822, 3837, 3837, 3862, 3862, 3900, 3900, 4019, 4019, 4105, 4105,
				4112, 4112, 4130, 4130, 4146, 4146, 4148, 4148, 4149, 4149, 4178, 4178, 4201, 4201, 4214, 4214, 4239,
				4239, 4301, 4301, 4309, 4309, 4341, 4341, 4387, 4387, 4402, 4402, 4444, 4444, 4449, 4449, 4485, 4485,
				4506, 4506, 4527, 4527, 4548, 4548, 4577, 4577, 4578, 4578, 4613, 4613, 4623, 4623, 4654, 4654, 4727,
				4727, 4760, 4760, 4767, 4767, 4821, 4821, 4829, 4829, 4843, 4843, 4863, 4863, 4871, 4871, 4872, 4872,
				4876, 4876, 4949, 4949, 4953, 4953, 4955, 4955, 4957, 4957, 4996, 4996, 4998, 4998, 5003, 5003, 5067,
				5067, 5075, 5075, 5083, 5083, 5091, 5091, 5119, 5119, 5120, 5120, 5129, 5129, 5173, 5173, 5193, 5193,
				5272, 5272, 5315, 5315, 5321, 5321, 5324, 5324, 5334, 5334, 5389, 5389, 5435, 5435, 5447, 5447, 5516,
				5516, 5531, 5531, 5537, 5537, 5597, 5597, 5628, 5628, 5672, 5672, 5678, 5678, 5694, 5694, 5713, 5713,
				5716, 5716, 5857, 5857, 5858, 5858, 5872, 5872, 5873, 5873, 5976, 5976, 5995, 5995, 6020, 6020, 6026,
				6026, 6086, 6086, 6096, 6096, 6156, 6156, 6173, 6173, 6191, 6191, 6211, 6211, 6225, 6225, 6234, 6234,
				6243, 6243, 6331, 6331, 6347, 6347, 6404, 6404, 6428, 6428, 6456, 6456, 6468, 6468, 6531, 6531, 6544,
				6544, 6558, 6558, 6565, 6565, 6569, 6569, 6590, 6590, 6591, 6591, 6600, 6600, 6698, 6698, 6703, 6703,
				6719, 6719, 6735, 6735, 6740, 6740, 6752, 6752, 6826, 6826, 6841, 6841, 6917, 6917, 7066, 7066, 7073,
				7073, 7075, 7075, 7187, 7187, 7356, 7356, 7357, 7357, 7365, 7365, 7376, 7376, 7417, 7417, 7420, 7420,
				7432, 7432, 7436, 7436, 7502, 7502, 7525, 7525, 7564, 7564, 7592, 7592, 7630, 7630, 7651, 7651, 7677,
				7677, 7724, 7724, 7730, 7730, 7822, 7822, 7829, 7829, 7830, 7830, 7891, 7891, 7930, 7930, 7942, 7942,
				8048, 8048, 8050, 8050, 8063, 8063, 8070, 8070, 8107, 8107, 8135, 8135, 8154, 8154, 8162, 8167, 8167,
				8214, 8214, 8215, 8215, 8258, 8258, 8276, 8276, 8278, 8278, 8304, 8304, 8336, 8336, 8337, 8337, 8372,
				8372, 8379, 8379, 8405, 8405, 8429, 8429, 8486, 8486, 8490, 8490, 8528, 8528, 8536, 8536, 8565, 8565,
				8572, 8572, 8586, 8586, 8604, 8604, 8614, 8614, 8628, 8628, 8632, 8632, 8640, 8640, 8665, 8665, 8690,
				8690, 8708, 8708, 8721, 8721, 8731, 8731, 8742, 8742, 8769, 8769, 8856, 8856, 8869, 8869, 8884, 8884,
				8888, 8888, 8899, 8899, 8943, 8943, 8969, 8969, 9000, 9000, 9035, 9035, 9087, 9087, 9110, 9110, 9111,
				9111, 9130, 9130, 9184, 9184, 9208, 9208, 9229, 9229, 9245, 9245, 9272, 9272, 9293, 9293, 9358, 9358,
				9385, 9385, 9394, 9394, 9437, 9437, 9447, 9447, 9455, 9455, 9459, 9459, 9500, 9500, 9604, 9604, 9693,
				9693, 9713, 9713, 9718, 9718, 9770, 9770, 9787, 9787, 9971, 9971 };
		System.out.println(optimizedSolution(a));

	}

}
