package no.hvl.dat100.javel.oppgave1;



public class DayMain {

    public static void main(String[] args) {

        double[] usage = DayPowerData.powerusage_day;
        double[] prices = DayPowerData.powerprices_day;

        // a) print prices and usage
System.out.println("Power Prices:");
DailyPower.printPowerPrices(prices);
System.out.println("\nPower Usage:");
DailyPower.printPowerUsage(usage);
System.out.println();

// c) total usage
double totalUsage = DailyPower.computePowerUsage(usage);
System.out.printf("Total Usage: %.2f kWh\n", totalUsage);

// d) total spot price
double totalSpot = DailyPower.computeSpotPrice(usage, prices);
System.out.printf("Total Spot Price: %.2f NOK\n", totalSpot);

// f) total power support
double totalSupport = DailyPower.computePowerSupport(usage, prices);
System.out.printf("Total Power Support: %.2f NOK\n", totalSupport);

// g) Norges price
double norgesPrice = DailyPower.computeNorgesPrice(usage);
System.out.printf("Norges Price: %.2f NOK\n", norgesPrice);

// h) peak usage
double peak = DailyPower.findPeakUsage(usage);
System.out.printf("Peak Usage: %.2f kWh\n", peak);

// i) average usage
double avg = DailyPower.findAvgPower(usage);
System.out.printf("Average Usage: %.2f kWh\n", avg);

    

    }
}
