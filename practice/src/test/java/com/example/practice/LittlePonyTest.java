package com.example.practice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

class LittlePonyTest {

	@Test
	void test() {
		 ArrayList<Integer> A = new ArrayList<Integer>();
		 ArrayList<Integer> B = new ArrayList<Integer>();
		 ArrayList<Integer> expected = new ArrayList<Integer>();
		 ArrayList<Integer> actual = new ArrayList<Integer>();
		
		 A.add(3);
		 A.add(4);
		 A.add(4);
		 A.add(6);
		 
		 B.add(20);
		 B.add(4);
		 B.add(10);
		 B.add(2);
		 
		 expected.add(4);
		 expected.add(1);
		 expected.add(2);
		 expected.add(0);
		 
		 actual = LittlePony.solve2(A, B);
		 assertEquals(expected, actual);
		 
		 
		 
		 
	}

	@Test
	void test1() {
		 ArrayList<Integer> A = new ArrayList<Integer>();
		 ArrayList<Integer> B = new ArrayList<Integer>();
		 ArrayList<Integer> expected = new ArrayList<Integer>();
		 ArrayList<Integer> actual = new ArrayList<Integer>();
		
		 A.add(20);
		 A.add(36);
		 A.add(58);
		 A.add(59);
		 
		 B.add(3);
		 B.add(207);
		 B.add(62);
		 B.add(654);
		 B.add(939);
		 B.add(680);
		 B.add(760);
		
		 
		 
		 expected.add(0);
		 expected.add(4);
		 expected.add(2);
		 expected.add(4);
		 expected.add(4);
		 expected.add(4);
		 expected.add(4);
		 
		 actual = LittlePony.solve2(A, B);
		 assertEquals(expected, actual);
		 
		 
		 
		 
	}
}
