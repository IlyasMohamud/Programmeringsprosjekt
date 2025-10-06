package no.hvl.dat100.javel.oppgave1;

public class DailyPower {

    // a) print power prices during a day
    public static void printPowerPrices(double[] prices) {

        for (double price : prices) {
            System.out.printf("%.2f kWh ", price);
        }

    }

    // b) print power usage during a day
    public static void printPowerUsage(double[] usage) {

        for (double curUsage : usage) {
            System.out.printf("%.2f kr ", curUsage);
        }

    }

    // c) compute power usage for a single day
    public static double computePowerUsage(double[] usage) {

        double sum = 0;
        int lengthz = usage.length;
        for (int i = 0; i < lengthz; i++) {
            sum += usage[i];
        }

        return sum;
    }

    // d) compute spot price for a single day
    public static double computeSpotPrice(double[] usage, double[] prices) {

        double price = 0;

        int lengthz = usage.length;
        for (int i = 0; i < lengthz; i++) {
            price += usage[i]* prices[i];
        }

        return price;
    }

    // e) compute power support for a given usage and price
    private static final double THRESHOLD = 0.9375;
    private static final double PERCENTAGE = 0.9;

    private static double getSupport(double usage, double price) {

        double support = 0;
        double result = usage * price;
        if (result > THRESHOLD) {
            support = (result - THRESHOLD) * PERCENTAGE;
        }
        

        return support;
    }

    // f) compute power support for a single day
    public static double computePowerSupport(double[] usage, double[] prices) {

        double support = 0;
        int lengthz = usage.length;
        for (int i = 0; i < lengthz; i++) {
            support += getSupport(usage[i], prices[i]);
        }

        return support;
    }

    private static final double NORGESPRIS_KWH = 0.5;

    // g) compute norges pris for a single day
    public static double computeNorgesPrice(double[] usage) {

        double price = 0;
        int lengthz = usage.length;
        for (int i = 0; i < lengthz; i++) {
            price += usage[i] * NORGESPRIS_KWH;
        }
        

        return price;
    }

    // g) compute peak usage during a single day
    public static double findPeakUsage(double[] usage) {

        double temp_max = 0;

        int lengthz = usage.length;
        for (int i = 0; i < lengthz; i++) {
            if (usage[i] > temp_max) {
                temp_max = usage[i];
            }
        }

        return temp_max;
    }

    public static double findAvgPower(double[] usage) {

        double average = 0;
        int lengthz = usage.length;
        for (int i = 0; i < lengthz; i++) {
            average += usage[i];
        }

        

        return average/lengthz;
    }
}