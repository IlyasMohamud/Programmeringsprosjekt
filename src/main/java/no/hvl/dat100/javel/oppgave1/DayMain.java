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
        System.out.printf("Total Usage: %.2f kWh %s\n", totalUsage,
            Math.round(totalUsage*100.0)/100.0 == 27.68 ? "PASS" : "FAIL");

        // d) total spot price
        double totalSpot = DailyPower.computeSpotPrice(usage, prices);
        System.out.printf("Total Spot Price: %.2f NOK %s\n", totalSpot,
            Math.round(totalSpot*100.0)/100.0 == 37.02 ? "PASS" : "FAIL");

        // f) total power support
        double totalSupport = DailyPower.computePowerSupport(usage, prices);
        System.out.printf("Total Power Support: %.2f NOK %s\n", totalSupport,
            Math.round(totalSupport*100.0)/100.0 == 18.93 ? "PASS" : "FAIL");

        // g) Norges price
        double norgesPrice = DailyPower.computeNorgesPrice(usage);
        System.out.printf("Norges Price: %.2f NOK %s\n", norgesPrice,
            Math.round(norgesPrice*100.0)/100.0 == 13.84 ? "PASS" : "FAIL");

        // h) peak usage
        double peak = DailyPower.findPeakUsage(usage);
        System.out.printf("Peak Usage: %.2f kWh %s\n", peak,
            Math.round(peak*100.0)/100.0 == 2.78 ? "PASS" : "FAIL");

        // i) average usage
        double avg = DailyPower.findAvgPower(usage);
        System.out.printf("Average Usage: %.2f kWh %s\n", avg,
            Math.round(avg*100.0)/100.0 == 1.15 ? "PASS" : "FAIL");
    

    }
}
