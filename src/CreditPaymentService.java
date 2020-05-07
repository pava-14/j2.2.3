public class CreditPaymentService {
    public double calculate (double amount, int years, double perc) {
        double yearPerc = perc / 12 / 100;
        return amount * (yearPerc * Math.pow(1 + yearPerc, years * 12)) /
                ((Math.pow(1 + yearPerc, years * 12)) - 1);
    }
}
