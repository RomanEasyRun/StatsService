package ru.netology.stats;

public class StatsService {


    public int calculateSum(int[] purchases) {
        int sum = 0;
        for (int purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }


    public int averageSalesPerMonth(int[] purchases) {
        int avg = calculateSum(purchases);
        return avg / 12;
    }


    public int monthWithMaxSales(int[] purchases) {
        int max = purchases[0];
        for (int purchase : purchases) {
            if (purchase > max) {
                max = purchase;
            }
        }
        int month = 0;
        int result = 0;
        for (int purchase : purchases) {
            month++;
            if (purchase == max) {
                result = month;
            }
        }
        return result;
    }


    public int monthWithMinSales(int[] purchases) {
        int min = purchases[0];
        for (int purchase : purchases) {
            if (purchase < min) {
                min = purchase;
            }
        }
        int month = 0;
        int result = 0;
        for (int purchase : purchases) {
            month++;
            if (purchase == min) {
                result = month;
            }
        }
        return result;
    }


    public int moreThanAvg(int[] purchases) {
        int month = 0;

        int avg = averageSalesPerMonth(purchases);

        for (int purchase : purchases) {
            if (purchase > avg) {
                month++;
            }
        }
        return month;
    }


    public int lessThanAvg(int[] purchases) {
        int month = 0;

        int avg = averageSalesPerMonth(purchases);

        for (int purchase : purchases) {
            if (purchase < avg) {
                month++;
            }
        }
        return month;
    }
}