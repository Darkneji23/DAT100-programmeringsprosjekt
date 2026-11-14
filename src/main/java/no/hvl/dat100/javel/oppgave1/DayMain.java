package no.hvl.dat100.javel.oppgave1;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;

public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;

        double[] powerprices_day = DayPowerData.powerprices_day;
        System.out.println("==============");
        System.out.println("OPPGAVE 1");
        System.out.println("==============");
        System.out.println();
        System.out.println("PRINT POWER PRICES:");
        double usagePerDay = DailyPower.computePowerUsage(powerusage_day);
        double pricePerDay = DailyPower.computeSpotPrice(powerusage_day, powerprices_day);
        double totalSupport = DailyPower.computePowerSupport(powerusage_day, powerprices_day);
        double norgesPrice = DailyPower.computeNorgesPrice(powerusage_day);
        double peak = DailyPower.findPeakUsage(powerusage_day);
        double avg = DailyPower.findAvgPower(powerusage_day);
        DailyPower.printPowerPrices(powerprices_day);
        DailyPower.printPowerUsage(powerusage_day);
        System.out.println("Usage for the day: " + usagePerDay + " kWh");
        System.out.println("Price for the day: " + pricePerDay + " NOK");
        System.out.printf("Общая господдержка за день: %.2f NOK\n", totalSupport);
        System.out.printf("Стоимость по Norgespris (0.50 NOK): %.2f NOK\n", norgesPrice);
        System.out.printf("Максимальное потребление за 1 час (Peak): %.2f kWh\n", peak);
        System.out.printf("Среднее потребление в час: %.2f kWh\n", avg);

    }
}
