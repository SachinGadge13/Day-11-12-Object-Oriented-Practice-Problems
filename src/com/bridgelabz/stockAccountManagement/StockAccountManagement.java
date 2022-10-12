package com.bridgelabz.stockAccountManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class StockAccountManagement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StockPortfolio obj = new StockPortfolio();// constructor
		while (true) {
			System.out.println("1-Enter new stock \n2-Display Stock Report \n3-Exit");// display options
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1: {
				obj.addStocks();
			}
				break;
			case 2: {
				obj.stockReport();
			}
				break;
			case 3: {
				System.out.println("Exited the Program !! ");
				System.exit(0);
			}
			default:
				System.out.println("Invalid Input");
				sc.close();
			}
		}
	}

}

class Stock {
	ArrayList<String> stockName = new ArrayList<String>();// storing user i/p in arraylist
	ArrayList<Integer> numberOfShares = new ArrayList<Integer>();
	ArrayList<Integer> sharePrice = new ArrayList<Integer>();
	Scanner sc = new Scanner(System.in);

	public void addStocks() { // method for adding stocks
		System.out.print("Enter the stock name: ");// stock name in string
		stockName.add(sc.next());

		System.out.print("Enter number of shares present: ");
		numberOfShares.add(sc.nextInt());

		System.out.print("Enter price of each share: ");
		sharePrice.add(sc.nextInt());

	}
}

class StockPortfolio extends Stock {
	public void stockReport() {

		System.out.println("______STOCK REPORT______");
		for (int i = 0; i < stockName.size(); i++) {
			int total = (numberOfShares.get(i) * sharePrice.get(i));
			System.out.println("Stock name= " + stockName.get(i) + "\nValue of each share= " + sharePrice.get(i)
					+ "\nTotal value of share= " + total);
			System.out.println(" ");

		}

	}
}