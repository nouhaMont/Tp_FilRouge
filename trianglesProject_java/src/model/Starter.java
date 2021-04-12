package model;

import java.util.Scanner;

public class Starter {

	public static void main(String[] args) {
		
		System.out.println("Trouver le type de triangle: ");
		System.out.println("-------------------------------");
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Entrez la longueur du côté a = ");
	        int a = sc.nextInt();
	        System.out.println("Entrez la longueur du côté b = ");
	        int b = sc.nextInt();
	        System.out.println("Entrez la longueur du côté c =");
	        int c = sc.nextInt();
	        
	        if(a==b && b==c)
	            System.out.println("Votre triangle est: Equilateral");

	        else if(a >= (b+c) || c >= (b+a) || b >= (a+c) )
	            System.out.println("le résultat: Not a triangle");

	        else if ((a==b && b!=c ) || (a!=b && c==a) || (c==b && c!=a))
	            System.out.println("Votre triangle est: Isosceles");

	        else if(a!=b && b!=c && c!=a)
	            System.out.println("Votre triangle est: Scalene");


	}

}
