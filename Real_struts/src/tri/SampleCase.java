package tri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SampleCase {

	public static void main(String args[])
	{	double a,b,c;
		Scanner sc=new Scanner(System.in);
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		sc.close();
		double p=(a+b+c)/2;
		double ss=Math.sqrt(p*(p-a)*(p-b)*(p-c));
		System.err.println(a+" "+b+" "+c+" "+ss);
		System.out.println((((long)((ss)*1000+0.5))*1.0/1000));
	}
	}
