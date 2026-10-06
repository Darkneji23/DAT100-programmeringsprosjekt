package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DayPowerData;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MonthMain {
    public static void main(String[] args) {

        // test data
        double[][] power_prices_month = MonthPowerData.powerprices_month;
        double[][] power_usage_month = MonthPowerData.powerusage_month;

        double totalUsage = MonthlyPower.computePowerUsage(power_usage_month);
        double threshold = 1000.0;
        boolean exceeded = MonthlyPower.exceedThreshold(power_usage_month, threshold);
        double totalSpotPrice = MonthlyPower.computeSpotPrice(power_usage_month, power_prices_month);
        double totalSupport = MonthlyPower.computePowerSupport(power_usage_month, power_prices_month);
        double norgesPrice = MonthlyPower.computeNorgesPrice(power_usage_month);
        System.out.println("==============");
        System.out.println("OPPGAVE 2");
        System.out.println("==============");
        System.out.println();
        System.out.println("Power prices during a month:");
        MonthlyPower.printPowerPrices(power_prices_month);
        System.out.println();
        System.out.println("Power usage during a month:");
        MonthlyPower.printPowerUsage(power_usage_month);
        System.out.println();
        System.out.println("Total power usage during the month: " + totalUsage + " kWh");
        System.out.println();
        if (exceeded) {
            System.out.println("The power usage exceeded the threshold of " + threshold + " kWh.");
        } else {
            System.out.println("The power usage didnt exceed the threshold of " + threshold + " kWh.");
            System.out.println();
        }
        System.out.println("Total spot price during the month: " + totalSpotPrice + " NOK");
        System.out.println();
        System.out.println("Total power support during the month: " + totalSupport + " NOK");
        System.out.println();
        System.out.println("Total norges pris during the month: " + norgesPrice + " NOK");
        System.out.println();


    }
}