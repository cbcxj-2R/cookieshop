package utils;

import java.math.BigDecimal;

public class PriceUtils {
	//¼Ó
		public float add(float a,float b) {
			float result=0.0f;
			//
			BigDecimal bigA=new BigDecimal(Float.toString(a));
			BigDecimal bigB=new BigDecimal(Float.toString(b));
			result=bigA.add(bigB).floatValue();
			
			return result;
		}
		
		public double add(double a,double b) {
			double result=0.0;
			//
			BigDecimal bigA=new BigDecimal(Double.toString(a));
			BigDecimal bigB=new BigDecimal(Double.toString(b));
			result=bigA.add(bigB).doubleValue();
			
			return result;
		}
		
		//¼õ
		public float subtract(float a,float b) {
			float result=0.0f;
			//
			BigDecimal bigA=new BigDecimal(Float.toString(a));
			BigDecimal bigB=new BigDecimal(Float.toString(b));
			result=bigA.subtract(bigB).floatValue();
			
			return result;
		}
		
		public double subtract(double a,double b) {
			double result=0.0;
			//
			BigDecimal bigA=new BigDecimal(Double.toString(a));
			BigDecimal bigB=new BigDecimal(Double.toString(b));
			result=bigA.subtract(bigB).doubleValue();
			
			return result;
		}
}