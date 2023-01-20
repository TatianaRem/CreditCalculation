public class CreditPaymentService {
    public double calculate(double creditDuration) {
        double creditSum = 1_000_000;
        double yearPercent = 9.99;
        double monthlyPercent = yearPercent / 12 / 100;
        double annuitet = monthlyPercent * Math.pow(1 + monthlyPercent, creditDuration) / (Math.pow(1 + monthlyPercent, creditDuration) - 1);
        double monthlyPayment = creditSum * annuitet;
        return monthlyPayment;
    }

}
