package a_b_c_d;

import java.util.Scanner;

public class A_B_C_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	int variableA= 4;
	int variableB= 28;
	int variableC= 10;
	int variableD= 0;
	int temp= variableA;
	
	
	System.out.println(variableA);
	System.out.println(variableB);
	System.out.println(variableC);
	System.out.println(variableD);

	variableA = variableB;
	variableB = variableC;
	variableC = variableD;
	variableD = temp;
	
	System.out.println(variableA);
	System.out.println(variableB);
	System.out.println(variableC);
	System.out.println(variableD);
	
	
	}

}
