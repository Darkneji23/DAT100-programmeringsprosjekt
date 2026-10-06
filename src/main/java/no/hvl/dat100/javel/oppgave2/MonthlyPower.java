package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;

public class MonthlyPower {
    public static void printPowerUsage(double[][] usage) {

        for (int i = 0; i < usage.length; i++) {
            System.out.println("Day " + (i+1) + ":");
            for (int j = 0; j < usage[i].length; j++) {
                System.out.printf("%-8s %.2f kWh    ", "Hour " + (j+1) + ":", usage[i][j]);
                if ((j + 1) % 6 == 0) {
                    System.out.println();
                }
            }
              System.out.println();
        }
    }
    public static void printPowerPrices(double[][] prices) {

            for (int i = 0; i < prices.length; i++) {
                System.out.println("Day " + (i+1) + ":");
            for (int j = 0; j < prices[i].length; j++) {
                System.out.printf("%-8s %.2f NOK/kWh    ", "Hour " + (j+1) + ":", prices[i][j]);
                if ((j + 1) % 6 == 0) {
                    System.out.println();
                }
            }
              System.out.println();
        }
    }
    public static double computePowerUsage(double[][] usage) {

        double sum = 0;

        for (int i = 0; i < usage.length; i++) {
            for (int j = 0; j < usage[i].length; j++) {
                sum += usage[i][j];
            }
        }

        return sum;
    }
    public static boolean exceedThreshold(double[][] powerusage, double threshold) {

        boolean exceeded = false;
        double usage = 0;

        for (int i = 0; i < powerusage.length; i++) {
            for (int j = 0; j < powerusage[i].length; j++) {
                usage += powerusage[i][j];
            }
        }

        if (usage > threshold) {
            exceeded = true;
        }

        return exceeded;
    }
    public static double computeSpotPrice(double[][] usage, double[][] prices) {

        double price = 0;
        for (int i = 0; i < usage.length; i++) {
            for (int j = 0; j < usage[i].length; j++) {
                price += usage[i][j] * prices[i][j];
            }
        }
        return price;
    }
    public static double computePowerSupport(double[][] usage, double[][] prices) {

        double support = 0;
        for (int i = 0; i < usage.length; i++) {
        support += DailyPower.computePowerSupport(usage[i], prices[i]);
    }
        return support;
    }
    private static final double NORGESPRIS_KWH = 0.5;
    public static double computeNorgesPrice(double[][] usage) {

        double price = 0;
        for (int i = 0; i < usage.length; i++) {
            for (int j = 0; j < usage[i].length; j++) {
                price += usage[i][j] * MonthlyPower.NORGESPRIS_KWH;
            }
        }
        return price;
    }
}
