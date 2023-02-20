public class CreditPaymentService {
    public double calculate(double creditDuration, double creditSum, double yearPercent) {
        double monthlyPercent = yearPercent / creditDuration / 100;
        double annuitet = monthlyPercent * Math.pow(1 + monthlyPercent, creditDuration) / (Math.pow(1 + monthlyPercent, creditDuration) - 1);
        double monthlyPayment = creditSum * annuitet;
        return monthlyPayment;
    }

}
