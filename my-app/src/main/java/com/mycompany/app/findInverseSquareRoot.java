package com.mycompany.app;

public class findInverseSquareRoot {

		public static float Q_rsqurt(float x) {
			if (x <= 0) {
	        	throw new ArithmeticException("Input should be bigger than 0.");
	        }
	        int i;
	        float x2, y;
	        float thereehalfs = 1.5f;
	
	        x2 = x * 0.5f;
	        y = x;
	        i = Float.floatToIntBits(y);
	        i = 0x5f3759df - (i >> 1);
	        y = Float.intBitsToFloat(i);
	        // 
	        y = y * (thereehalfs - (x2 * y * y));
	        y = y * (thereehalfs - (x2 * y * y));
	        y = y * (thereehalfs - (x2 * y * y));
	
	        return y;
	    }

}
