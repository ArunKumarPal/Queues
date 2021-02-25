package com.queue.demo;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		System.out.print("You want to create a Queue then press 1 else 0 : ");
		int key;
		Scanner s = new Scanner(System.in);
		key = s.nextInt();
		Queue queue = new Queue();
		while(key == 1 || key == 2 || key == 3) {
			System.out.println("press 1 and Enter for Enqueue");
			System.out.println("press 2 and Enter for Dequeue");
			System.out.println("press 3 and Enter for peek");
			System.out.println("press 0 and Enter for Exit");
			key = s.nextInt();
			if(key == 1){
				System.out.println("Please enter the value");
				String value = s.next();
				queue.enQueue(value);
			}
			else if(key == 2){
				System.out.println(queue.deQueue());
			}
			else if(key == 3){
				System.out.println(queue.peek());
			}
			
		} 

	}

}
