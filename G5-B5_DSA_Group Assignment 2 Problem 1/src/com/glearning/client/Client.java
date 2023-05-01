package com.glearning.client;

import java.util.ArrayList;
import java.util.Scanner;

import com.glearning.service.Service;

public class Client {

	public static void main(String[] args) {

		int n, value;
		ArrayList<Integer> arr = new ArrayList<>();

		Scanner in = new Scanner(System.in);
		Service obj = new Service();

		System.out.println("enter the total no of floors in the building");
		n = in.nextInt();
		// { 1 2 3 8 9 10 4 5 7 6 };

		for (int i = 0; i < n; i++) {

			System.out.println("enter the floor size given on day : " + (i + 1));
			value = in.nextInt();

			// Check for values not in range
			if (value < 1 || value > n) {

				System.out.println("Enter a valid value from 1 to " + n);
				i--;

				// Check for duplicate values
			} else if (arr.contains(value)) {
				System.out.println("Enter a value not already entered");
				i--;
			} else {
				arr.add(value);
			}
		}

		obj.orderOfConstruction(arr);
		in.close();
	}

}
