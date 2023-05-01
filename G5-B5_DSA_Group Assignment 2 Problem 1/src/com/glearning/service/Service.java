package com.glearning.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Service {

	PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());

	public void orderOfConstruction(ArrayList<Integer> arr) {

		int max = arr.size();
		System.out.println("The order of construction is as follows");
		for (int i = 0; i < arr.size(); i++) {

			System.out.println("Day " + (i + 1) + ":");
			int val = arr.get(i);
			q.add(val);

			if (val == max) {
				while (!q.isEmpty() && q.contains(max)) {
					System.out.print(q.remove() + " ");
					max--;
				}
			}
			System.out.println();
		}
	}
}
