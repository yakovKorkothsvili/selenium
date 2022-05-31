package selenium;
import java.util.Scanner;


public class JavaClass {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
       int a=scan.nextInt();
       int b=scan.nextInt();
       int c=scan.nextInt();
       int d=scan.nextInt();
       FromBigToLow(a, b, c, d);
	}

	private static void FromBigToLow(int a, int b, int c, int d) {
		int biggerNum=0;
		int biggerNumer=0;
		
		int lowerNumber=0;
		int LowerNumber=0;
		if (a>b) {
			biggerNum=a;
			lowerNumber=b;
		}
		else {
			biggerNum=b;
			lowerNumber=a;
		}
		
		
		if (c>d) {
			biggerNumer=c;
			LowerNumber=d;
		}
		else {
			biggerNumer=d;
			LowerNumber=c;
		}
		FromBigToLow(biggerNumer, biggerNum);
		FromlowToBig(lowerNumber, LowerNumber);
	}
	
	private static void FromBigToLow(int BiggerNumber,int BigNumber) {
		if (BiggerNumber>BigNumber) {
			System.out.println(BiggerNumber);
			System.out.println(BigNumber);
		}
		else {
			System.out.println(BigNumber);
			System.out.println(BiggerNumber);
		}
		
	}
	private static void FromlowToBig(int lowerNumber,int LowerNumber) {
		if (lowerNumber>LowerNumber) {
			System.out.println(lowerNumber);
			System.out.println(LowerNumber);
		}
		else {
			System.out.println(LowerNumber);
			System.out.println(lowerNumber);
		}
	}
	
}


