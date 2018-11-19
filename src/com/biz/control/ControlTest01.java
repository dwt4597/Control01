package com.biz.control;

public class ControlTest01 {

	public static void main(String[] args) {
		boolean bTest = false;
		int intNum1 = 30;
		int intNum2 = 40;
		
		
		
		// +-*/% : 산술연산자
		// <> = : 비교연산자, 관계연산자라고 함
		bTest = (intNum1 < intNum2); // true값이 입력됨
		System.out.println(bTest);
		
		bTest = (intNum1 > intNum2); // false값이 입력됨
		System.out.println(bTest);
		
		bTest = (intNum1 == intNum2); // false값이 입력됨
		System.out.println(bTest);
		
		bTest = (intNum1 <= intNum2); // true값이 입력됨
		System.out.println(bTest);
		
		bTest = (intNum1 >= intNum2); // false값이 입력됨
		System.out.println(bTest);
		
		
		bTest = (intNum1 != intNum2); // true값이 입력됨
		System.out.println(bTest);
		
		
		
		
		
	}

}
