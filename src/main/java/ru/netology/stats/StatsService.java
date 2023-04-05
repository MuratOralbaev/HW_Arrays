package ru.netology.stats;

public class StatsService {
    public int salesAmount(int[] sales) {
        int amount = 0;
        for (int i = 0; i < sales.length; i++) {
            amount += sales[i];
        }
        return amount;
    }

    public int averageSalesAmount(int[] sales) {
        int averSales = 0;
        int amount = salesAmount(sales);
        for (int i = 0; i < sales.length; i++) {
            averSales = amount / sales.length;
        }
        return averSales;
    }

    public int numberMonthPeakSales(int[] sales) {
        int peakSalesNumber = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[peakSalesNumber]) {
                peakSalesNumber = i;
            }
        }
        return peakSalesNumber;
    }

    public int numberMonthMinSales(int[] sales) {
        int minSalesNumber = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minSalesNumber]) {
                minSalesNumber = i;
            }
        }
        return minSalesNumber;
    }

    public int numberMonthBelowOverage(int[] sales) {
        int count = 0;
        int averSales = averageSalesAmount(sales);
        for (int sale : sales) {
            if (sale < averSales) {
                count++;
            }
        }
        return count;
    }

    public int numberMonthAboveOverage(int[] sales) {
        int count = 0;
        int averSales = averageSalesAmount(sales);
        for (int sale : sales) {
            if (sale > averSales) {
                count++;
            }
        }
        return count;
    }
}
