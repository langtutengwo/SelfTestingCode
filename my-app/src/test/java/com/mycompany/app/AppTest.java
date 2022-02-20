package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class AppTest 
{
    @Test
	void testQ_rsqurtNormalInput() {
		float a = 16;
		float actual= findInverseSquareRoot.Q_rsqurt(a);
        float expected = 0.25f;
        float epsilon = Math.abs(actual - expected);
        boolean result = false;
        if (epsilon < 0.0001) {
        	result = true;
        }
        assertTrue(result);
	}
	
	@Test
	void testQ_rsqurtInputIsZeroOrNegative() {
		Exception exception = assertThrows(ArithmeticException.class, () -> {
			findInverseSquareRoot.Q_rsqurt(-1);
		});
		String expectedMessage = "Input should be bigger than 0.";
		String actualMessage = exception.getMessage();
		assertTrue(actualMessage.contains(expectedMessage));
	}
}
