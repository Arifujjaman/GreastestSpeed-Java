package main;

import java.util.Scanner;

public class GreatestSpeed {
	
	public static int calculate(double m) {
		Scanner in = new Scanner(System.in);
		int v[] = {1,10,20,40};
		double T=60.0;
		int r=3;
		int a=0;
		
		for(int i=0;i<4;i++) {
			double x=m*(v[i]*v[i])/r;
			if(x<=T && a<v[i])
				a=v[i];
		}
		System.out.println("greatest Speed is : "+a);
		return a;

	}

}
