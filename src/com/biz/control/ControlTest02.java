package com.biz.control;

public class ControlTest02 {

	public static void main(String[] args) {
		
		
		boolean bTest1;
		boolean bTest2;
		
		boolean bT;
		
		int intNum1 = 30;
		int intNum2 = 40;
		//=================
		bTest1 = (intNum1 < intNum2); // T
		bTest2 = (intNum1 < intNum2); // T
		// ================
		bT = (bTest1 || bTest2); // OR : T
		bT = (bTest1 && bTest2); // AND : T
		
		//=================
				bTest1 = (intNum1 < intNum2); // T
				bTest2 = (intNum1 > intNum2); // F
				// ================
				bT = (bTest1 || bTest2); // OR : T
				System.out.println(bT);
				bT = (bTest1 && bTest2); // AND : F
				System.out.println(bT);
				
		
		
		
		
		System.out.println();
		
		
		
		
		
		
		
		
		
	}

}
