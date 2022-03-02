package com.mycompany.app;

public class FindInverseSquareRoot {

	public static float q_rsqurt(float x) {
		if (x <= 0) {
			throw new ArithmeticException("Input should be bigger than 0.");
		}
		int i;
		float x2, y;
		float threeHalfs = 1.5f;

		x2 = x * 0.5f;
		y = x;
		i = Float.floatToIntBits(y);
		// This subtraction can get a aproximate result. The 'magic number' is an approximation of square root of 2 ^ 127.
		i = 0x5f3759df - (i >> 1);
		y = Float.intBitsToFloat(i);
		// More iteration, more precision.
		y = y * (threeHalfs - (x2 * y * y));
		y = y * (threeHalfs - (x2 * y * y));
		y = y * (threeHalfs - (x2 * y * y));

		return y;
	}

}
