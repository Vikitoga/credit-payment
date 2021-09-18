public class Main {
    public static void main(String[] args) {
        CreditPaymentService payment = new CreditPaymentService();

        int paymentForOneYear = payment.calculate(1_000_000, 12, 9.99);
        System.out.println("Ежемесячный платёж при кредите на 1 год: " + paymentForOneYear);

        int paymentForTowYears = payment.calculate(1_000_000, 24, 9.99);
        System.out.println("Ежемесячный платёж при кредите на 2 года: " + paymentForTowYears);

        int paymentForThreeYears = payment.calculate(1_000_000, 36, 9.99);
        System.out.println("Ежемесячный платёж при кредите в 3 года: " + paymentForThreeYears);
    }
}
