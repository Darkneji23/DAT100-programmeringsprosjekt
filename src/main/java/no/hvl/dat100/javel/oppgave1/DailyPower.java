package no.hvl.dat100.javel.oppgave1;

public class DailyPower {

    // a) print power prices during a day
    public static void printPowerPrices(double[] prices) {
        for (int i = 0; i < prices.length; i++) {
            if(i % 4 == 0){
                System.out.println();
            }
            System.out.printf("%02d:00 -> %.2f NOK     ", i, prices[i]);
        }
        System.out.println();
    }

    // b) print power usage during a day
    public static void printPowerUsage(double[] usage) {
        for (int i = 0; i < usage.length; i++) {
            if(i % 4 == 0){
                System.out.println();
            }
            System.out.printf("%02d:00 -> %.2f kWh     ", i, usage[i]);
        }
        System.out.println();
    }

    // c) compute power usage for a single day
    public static double computePowerUsage(double[] usage) {

        double sum = 0;
        for(double hour : usage){
            sum += hour;
        }
        return sum;
    }

    // d) compute spot price for a single day
    public static double computeSpotPrice(double[] usage, double[] prices) {
        double price = 0;
        for(int i = 0; i < usage.length; i++){
            price += usage[i] * prices[i]; // Умножаем потребление на цену!
        }
        return price;
    }

    // e) compute power support for a given usage and price
    private static final double THRESHOLD = 0.9375;
    private static final double PERCENTAGE = 0.9;

    private static double getSupport(double usage, double price) {

        double support = 0;
        if(price > THRESHOLD){
            support += usage * (price - THRESHOLD) * 0.9;
        }
        return support;
    }

    // f) compute power support for a single day
    public static double computePowerSupport(double[] usage, double[] prices) {

        double support = 0;
        for(int i = 0; i < usage.length; i++){
            support += getSupport(usage[i], prices[i]);
        }
        return support;
    }

    private static final double NORGESPRIS_KWH = 0.5;

    // g) compute norges pris for a single day
    public static double computeNorgesPrice(double[] usage) {

        double price = 0;
        price = computePowerUsage(usage) * NORGESPRIS_KWH;
        return price;
    }

    // g) compute peak usage during a single day
    public static double findPeakUsage(double[] usage) {

        double temp_max = usage[0];
        for(double hour : usage){
            if(hour > temp_max){
                temp_max = hour;
            }
        }
        return temp_max;
    }

    public static double findAvgPower(double[] usage) {

        double average = 0;
        average = computePowerUsage(usage) / usage.length;

        return average;
    }
}