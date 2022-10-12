package com.bridgelabz.commercialDataprocessing;

import java.util.ArrayList;
import java.util.Scanner;

public class StockAccount {

	// Array list of stock account
	ArrayList<StockAccountDetails> list = new ArrayList<>();
	// object of scanner class for user input
	Scanner sc = new Scanner(System.in);

	private void setStocks() {
		System.out.println("Enter the Number of Stock Accounts You Want To Have : ");
		int no = sc.nextInt();
		for (int i = 0; i < no; i++) {
			StockAccountDetails stockAccount = new StockAccountDetails();
			setStockInfo(stockAccount, i);
		}
	}

	private void setStockInfo(StockAccountDetails stockAccount, int i) {
		System.out.println("Enter the Stock " + (i + 1) + " Information :");
		System.out.println("Enter the Stock Name :");
		stockAccount.setStockNames(sc.next());
		System.out.println("Enter the Number of Shares :");
		stockAccount.setNumOfShares(sc.nextInt());
		System.out.println("Enter the Price of each Share :");
		stockAccount.setSharePrices(sc.nextDouble());
		stockAccount.setTotalValueOfShares(stockAccount.getNumOfShares(), stockAccount.getSharePrices());
		list.add(stockAccount);
	}

	private void getStockInfo() {
		int i = 1;
		for (StockAccountDetails stockAccount : list) {
			System.out.println("Stock " + i + " Information is :");
			System.out.println("Stock Name : " + stockAccount.getStockNames());
			System.out.println("Number of Shares : " + stockAccount.getNumOfShares());
			System.out.println("Price of each Shares : " + stockAccount.getSharePrices());
			System.out.println("Total Value of Shares : " + stockAccount.getTotalValueOfShares());
			i++;
		}
	}

	public static void main(String[] args) {
		StockAccount stockPortfolio = new StockAccount();
		stockPortfolio.setStocks();
		stockPortfolio.getStockInfo();
	}
}