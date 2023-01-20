public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double creditSum = 1_000_000;
        double creditDuration = 12;
        double yearPercent = 9.99;
        double monthlyPayment = service.calculate(creditDuration, creditSum, yearPercent);

        System.out.println("Ежемесячный платеж");
        System.out.println(monthlyPayment);

    }

}