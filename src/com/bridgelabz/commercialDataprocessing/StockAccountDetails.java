package com.bridgelabz.commercialDataprocessing;

public class StockAccountDetails {

	private String stockNames;
	private int numOfShares;
	private double sharePrices;
	private double totalValueOfShares;

	public String getStockNames() {
		return stockNames;
	}

	public void setStockNames(String stockNames) {
		this.stockNames = stockNames;
	}

	public int getNumOfShares() {
		return numOfShares;
	}

	public void setNumOfShares(int numOfShares) {
		this.numOfShares = numOfShares;
	}

	public double getSharePrices() {
		return sharePrices;
	}

	public void setSharePrices(double sharePrices) {
		this.sharePrices = sharePrices;
	}

	public double getTotalValueOfShares() {
		return totalValueOfShares;
	}

	public void setTotalValueOfShares(double totalValueOfShares, double sharePrices) {
		this.totalValueOfShares = totalValueOfShares;
	}
}