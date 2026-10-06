package no.hvl.dat100.javel.oppgave1;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;

public class DayMain {

    public static void main(String[] args) {

        double[] powerusage_day = DayPowerData.powerusage_day;
        double[] powerprices_day = DayPowerData.powerprices_day;

        double totalUsage = DailyPower.computePowerUsage(powerusage_day);
        double totalSpotPrice = DailyPower.computeSpotPrice(powerusage_day, powerprices_day);
        double totalSupport = DailyPower.computePowerSupport(powerusage_day, powerprices_day);
        double norgesPrice = DailyPower.computeNorgesPrice(powerusage_day);
        double peakUsage = DailyPower.findPeakUsage(powerusage_day);
        double avgPower = DailyPower.findAvgPower(powerusage_day);

        System.out.println("==============");
        System.out.println("OPPGAVE 1");
        System.out.println("==============");
        System.out.println();
        System.out.println("Power prices during a day:");
        DailyPower.printPowerPrices(powerprices_day);
        System.out.println();
        System.out.println("Power usage during a day:");
        DailyPower.printPowerUsage(powerusage_day);
        System.out.println();
        System.out.println("Total power usage during the day: " + totalUsage + " kWh");
        System.out.println();
        System.out.println("Total spot price during the day: " + totalSpotPrice + " NOK");
        System.out.println();
        System.out.println("Total power support during the day: " + totalSupport + " NOK");
        System.out.println();
        System.out.println("Total norges pris during the day: " + norgesPrice + " NOK");
        System.out.println();
        System.out.println("Peak usage during the day: " + peakUsage + " kWh");
        System.out.println();
        System.out.println("Average power usage during the day: " + avgPower + " kWh");
        System.out.println();
    }
}
