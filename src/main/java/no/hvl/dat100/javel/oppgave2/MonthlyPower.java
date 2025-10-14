package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;


public class MonthlyPower {

    // a) print power usage for a month
    public static void print_PowerUsage(double[][] usage) {

        for(double[]usages : usage){
            DailyPower.printPowerUsage(usages);
        }

    }

    // b) print power prices for a month
    public static void print_PowerPrices(double[][] prices) {
        for(double[]price :prices){
            DailyPower.printPowerPrices(price);
        }

    }

    // c) compute total power usage for a month
    public static double computePowerUsage(double[][] usage) {

        double sum = 0;

        for(double[]usages : usage){

            sum+= DailyPower.computePowerUsage(usages);
        }

        return sum;
    }

    // d) determine whether a given threshold in powerusage for the month has been exceeded
    public static boolean exceedThreshold(double[][] powerusage, double threshold) {

        int i = 0;
        double sum = 0;
        while (i < powerusage.length && sum <= threshold) {
            sum += DailyPower.computePowerUsage(powerusage[i]);
            i++;
        }
        return sum > threshold;
    }

    // e) compute spot price
    public static double computeSpotPrice(double[][] usage, double[][] prices) {

        double price = 0;
        int size = prices.length;
        for (int i = 0; i < size; i++) {
            price+=DailyPower.computeSpotPrice(usage[i],prices[i]);
        }

        

        return price;
    }

    // f) power support for the month
    public static double computePowerSupport(double[][] usage, double[][] prices) {

        double support = 0;
        int size = prices.length;
        for (int i = 0; i < size; i++) {
            support+=DailyPower.computePowerSupport(usage[i],prices[i]);
        }
        

        return support;
    }

    // g) Norgesprice for the month
    public static double computeNorgesPrice(double[][] usage) {

        double price = 0;
        int size = usage.length;
        for (int i = 0; i < size; i++) {
            price+=DailyPower.computeNorgesPrice(usage[i]);
        }

        return price;
    }
}
