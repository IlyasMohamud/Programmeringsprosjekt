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

        System.out.println("==============");
        System.out.println("OPPGAVE 2");
        System.out.println("==============");
        System.out.println();

                // a) print prices and usage
    System.out.println("Power Prices:");
    MonthlyPower.print_PowerPrices(power_prices_month);
    System.out.println("\nPower Usage:");
    MonthlyPower.print_PowerUsage(power_usage_month);
    System.out.println();

    // c) total usage
    double totalUsage = MonthlyPower.computePowerUsage(power_usage_month);
    System.out.printf("Total Usage: %.2f kWh\n", totalUsage);

    // d) exceed threshold
    boolean exceeded = MonthlyPower.exceedThreshold(power_usage_month, 900);
    System.out.printf("Usage is %s", (exceeded) ? "HIGHER than threshold" : "LOWER than trheshold");
    



    }
}