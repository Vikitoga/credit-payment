public class CreditPaymentService {
    public int calculate(int creditAmount, int month, double percent) {
        double percentInMonth = percent / 12 / 100;
        double index = Math.pow(1 + percentInMonth, month);
        double paymentInMonth = (percentInMonth * index / (index - 1)) * creditAmount;
        return (int) paymentInMonth;
    }
}
