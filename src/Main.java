public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        // Вариант 1: 1 000 000 на 1 год под 9.99%
        System.out.printf("%.0f\n", service.calculate(1_000_000,1,9.99));
        // Вариант 2: 1 000 000 на 2 года под 9.99%
        System.out.printf("%.0f\n", service.calculate(1_000_000,2,9.99));
        // Вариант 3: 1 000 000 на 3 года под 9.99%
        System.out.printf("%.0f\n", service.calculate(1_000_000,3,9.99));
    }
}
