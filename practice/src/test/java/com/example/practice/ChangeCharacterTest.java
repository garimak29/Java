package com.example.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ChangeCharacterTest {

	@Test
	void test() {
		String A = "abcabbccd";
		int B = 3;
		int expected = 2;
		int actual = ChangeCharacter.solve(A, B);
		assertEquals(expected, actual);
	}

	@Test
	void test1() {
		String A = "qghumeaylnlfdxfircvscxggbwkfnqduxwfnfozvsrtkjprepggxrpnrvystmwcysyycqpevikeffmznimkkasvwsrenzkycxfxtlsgypsfadpooefxzbcoejuvpvaboygpoeylfpbnpljvrvipyamyehwqnqrqpmxujjloovaowuxwhmsncbxcoksfzkvatxdknlyjyhfixjswnkkufnuxxzrzbmnmgqooketlyhnkoaugzqrcddiuteiojwayyzpvscmpsajlfvgubfaaovlzylntrkdcpwsrtesjwhdizcobzcnfwlqijtvdwvxhrcbldvgylwgbusbmborxtlhcsmpxohgmgnkeufdxotogbgxpeyanfetcukepzshkljugggekjdqzjenpevqgxiepjsrdzjazujllchhbfqmkimwzobiwybxduunfsksrsrtekmq";
		int B = 119;
		int expected = 18;
		int actual = ChangeCharacter.solve(A, B);
		assertEquals(expected, actual);
	}
	
	@Test
	void test2() {
		String A = "ircvscxggbwkfnqd";
		int B = 2;
		int expected = 12;
		int actual = ChangeCharacter.solve(A, B);
		assertEquals(expected, actual);
	}
	@Test
	void test3() {
		String A = "umeaylnlfd";
		int B = 1;
		int expected = 8;
		int actual = ChangeCharacter.solve(A, B);
		assertEquals(expected, actual);
	}

}
