package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;
import no.hvl.dat100.javel.oppgave1.DayPowerData;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MonthMain {
    public static void main(String[] args) {

        // test data
        double[][] power_prices_month = MonthPowerData.powerprices_month;
        double[][] power_usage_month = MonthPowerData.powerusage_month;
        double monthlyUsage = MonthlyPower.computePowerUsage(power_usage_month);
        double monthlyPrice = MonthlyPower.computeSpotPrice(power_usage_month, power_prices_month);
        boolean exceedThreshold = MonthlyPower.exceedThreshold(power_usage_month, 2000);
        double totalSupport = MonthlyPower.computePowerSupport(power_usage_month, power_prices_month);
        double norgespris = MonthlyPower.computeNorgesPrice(power_usage_month);
        System.out.println("==============");
        System.out.println("OPPGAVE 2");
        System.out.println("==============");
        System.out.println();
        System.out.println("Print");
        MonthlyPower.print_PowerUsage(power_usage_month);
        MonthlyPower.print_PowerPrices(power_prices_month);
        System.out.println("Usage of power for the month is: " + monthlyUsage + " kWh");
        System.out.println("Price for power for the month is: " + monthlyPrice + " NOK");
        System.out.println("Threshold: " + exceedThreshold);
        System.out.println("Total support for the month is: " + totalSupport + " NOK");
        System.out.println("Price with NorgesPris : " + norgespris + " NOK");
        
        
    }
}