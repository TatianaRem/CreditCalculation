public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double creditDuration = 12;
        double monthlyPayment = service.calculate(creditDuration);

        System.out.println("Ежемесячный платеж");
        System.out.println(monthlyPayment);

    }

}