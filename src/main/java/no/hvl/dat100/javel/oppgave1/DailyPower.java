package no.hvl.dat100.javel.oppgave1;

public class DailyPower {

    public static void printPowerPrices(double[] prices) {

        for (int i = 0; i < prices.length; i++) {
            if (i % 4 == 0) {
                System.out.println();
            }
            System.out.printf("%-8s %.2f NOK/kWh    ", "Hour " + (i+1) + ":", prices[i]);
        }
        System.out.println();
    }
    public static void printPowerUsage(double[] usage) {

        for (int i = 0; i < usage.length; i++) {
            if (i % 4 == 0) {
                System.out.println();
            }
            System.out.printf("%-8s %.2f kWh    ", "Hour " + (i+1) + ":", usage[i]);
        }
        System.out.println();
    }
    public static double computePowerUsage(double[] usage) {

        double sum = 0;
        for (int i = 0; i < usage.length; i++) {
            sum += usage[i];
        }
        return sum;
    }
    public static double computeSpotPrice(double[] usage, double[] prices) {

        double totalPrice = 0;
        for (int i = 0; i < usage.length; i++) {
            totalPrice += usage[i] * prices[i];
        }
        return totalPrice;
    }

    private static final double THRESHOLD = 0.9375;
    private static final double PERCENTAGE = 0.9;
    private static double getSupport(double usage, double price) {

        double support = 0; 
        if (price > THRESHOLD) 
            { 
                support = usage * (price - THRESHOLD) * PERCENTAGE; 
            }
        return support;
    }
    public static double computePowerSupport(double[] usage, double[] prices) {

        double support = 0;
        for (int i = 0; i < usage.length; i++) {
            support += getSupport(usage[i], prices[i]);
        }
        return support;
    }
    private static final double NORGESPRIS_KWH = 0.5;
    public static double computeNorgesPrice(double[] usage) {

        double price = 0;
        for (int i = 0; i < usage.length; i++) {
            price += usage[i] * NORGESPRIS_KWH;
        }
        return price;
    }
    public static double findPeakUsage(double[] usage) {
        
        double tempMax = 0;
        for (int i = 0; i < usage.length; i++) {
            if (usage[i] > tempMax) {
                tempMax = usage[i];
            }
        }
        return tempMax;
    }
    public static double findAvgPower(double[] usage) {

        double average = 0;
        for (int i = 0; i < usage.length; i++) {
            average += usage[i];
        }
        average /= usage.length;
        return average;
    }
}