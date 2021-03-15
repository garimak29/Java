package com.example.practice;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfSortedArray {

	public static ArrayList<Integer> intersect1(final List<Integer> A, final List<Integer> B) {
		ArrayList<Integer> arr = new ArrayList<Integer>();

		int i = 0, j = 0;
		System.out.println(A.size() + " : " + B.size());
		while (i < A.size() && j < B.size()) {
			System.out.println("A:" + A.get(i) + " : B:" + B.get(j) + " - condition : " + (A.get(i) == B.get(j)));
			if (A.get(i) * 1 == B.get(j) * 1) {
				// System.out.println(A.get(i));
				arr.add(A.get(i));
				if (A.size() > B.size())
					j++;
				else
					i++;
			} else if (A.get(i) * 1 > B.get(j) * 1 && A.size() > B.size()) {
				System.out.println("OOOOOOO");
				while (A.get(i) > B.get(j) && j < B.size() - 1) {
					j++;
				}
				if (j < B.size() && A.get(i) * 1 == B.get(j) * 1) {
					// System.out.println(A.get(i));
					arr.add(A.get(i));
					j++;
				}
			} else if (A.get(i) * 1 < B.get(j) * 1 && A.size() < B.size()) {
				System.out.println("O+OOOOOO");
				while (A.get(i) < B.get(j) && i < A.size() - 1) {
					i++;
				}

				if (i < A.size() && A.get(i) * 1 == B.get(j) * 1) {
					// System.out.println(B.get(i));
					arr.add(A.get(i));
					i++;
				}
			} else if (A.size() == B.size() && A.get(i) < B.get(j)) {
				while (A.get(i) < B.get(j))
					i++;

			}
			/*
			 * else if ((A.get(i) * 1 < B.get(j) * 1 ) || (A.get(i) * 1 > B.get(j) * 1 ) &&
			 * A.size() == B.size()) { System.out.println("O+O--OOOOO");
			 * System.out.println("A"+ A.get(i)+" b "+B.get(j)); while (A.get(i) <= B.get(j)
			 * && i<A.size()-1) { i++; } while (A.get(i) >= B.get(j) && j<B.size()-1) { j++;
			 * }
			 * 
			 * if (j<B.size() && i < A.size() && A.get(i) * 1 == B.get(j) * 1) {
			 * System.out.println("inside"+B.get(j)); arr.add(B.get(j)); i++; j++; } }
			 */
			if (A.size() > B.size()) {
				i++;
			} else if (A.size() < B.size()) {
				j++;
			} else {
				i++;
				j++;
			}
		}

		return arr;
	}

	public static ArrayList<Integer> intersect(final List<Integer> A, final List<Integer> B) {
		ArrayList<Integer> arr = new ArrayList<Integer>();

		int i = 0, j = 0;
		while (i < A.size() && j < B.size()) {
			System.out.println(A.get(i) + " : " + B.get(j));
			
			if(A.get(i)*1 == B.get(j)*1) {
				arr.add(A.get(i));
				if(i < A.size())
					i++;
				if(j<B.size())
					j++;
			}
			else if (A.get(i)*1 < B.get(j)*1 && i<A.size()) {
				i++;
			}
			else if (B.get(j)*1 < A.get(i)*1 && j<B.size()) {
				j++;
			}
			
		}

		

		return arr;
	}

}
