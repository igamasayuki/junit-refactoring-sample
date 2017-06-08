package com.example.sample;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.example.refactoring.ExerciseMathBefore;

public class ExerciseMathTest {

	@Test
	public void testFactorial() {
		int answer = 0;
		try {
			answer = ExerciseMathBefore.factorial(-1);
			fail("TC1:例外が発生しなければなりません");
		} catch (IllegalArgumentException e) {
			assertThat("TC1:メッセージが一致しません",
					e.getMessage(),
					is("0以下の値は不正です。"));
		}
		
		try {
			answer = ExerciseMathBefore.factorial(0);
			fail("TC2:例外が発生しなければなりません");
		} catch (IllegalArgumentException e) {
			assertThat("TC2:メッセージが一致しません",
					e.getMessage(),
					is("0以下の値は不正です。"));
		}
		
		answer = ExerciseMathBefore.factorial(1);
		System.out.println(answer);
		assertThat("TC3:値が一致しません", answer, is(1));
		
		answer = ExerciseMathBefore.factorial(2);
		assertThat("TC4:値が一致しません", answer, is(2));
		
		answer = ExerciseMathBefore.factorial(3);
		assertThat("TC5:値が一致しません", answer, is(6));
		
		answer = ExerciseMathBefore.factorial(4);
		assertThat("TC6:値が一致しません", answer, is(24));
		
		answer = ExerciseMathBefore.factorial(11);
		assertThat("TC7:値が一致しません", answer, is(39916800));
		
		answer = ExerciseMathBefore.factorial(12);
		assertThat("TC8:値が一致しません", answer, is(479001600));
		
		try {
			answer = ExerciseMathBefore.factorial(13);
			fail("TC9:例外が発生しなければなりません");
		} catch (IllegalArgumentException e) {
			assertThat("TC9:メッセージが一致しません",
					e.getMessage(),
					is("13以上の値は不正です。"));
		}
		
		try {
			answer = ExerciseMathBefore.factorial(14);
			fail("TC10:例外が発生しなければなりません");
		} catch (IllegalArgumentException e) {
			assertThat("TC10:メッセージが一致しません",
					e.getMessage(),
					is("13以上の値は不正です。"));
		}
	}

}
