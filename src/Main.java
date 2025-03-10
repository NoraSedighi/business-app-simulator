import payment.*;

public class Main {
    public static void main(String[] args) {
            RegularCustomer customer1 = new RegularCustomer("Andy");
            RegularCustomer customer2 = new RegularCustomer("Blair");
            PremiumCustomer customer3 = new PremiumCustomer("Chuck");

            PaymentStrategy creditCardPayment1 = new CreditCardPayment("6037-9985-7123-6654", "Andy Williams");
            PaymentStrategy payPalpayment1 = new PayPalPayment("andiewillie@gmail.com");

            PaymentStrategy bitcoinPayment2 = new BitcoinPayment("queen7564737bbb384bbb");
            PaymentStrategy payPalPayment2 = new PayPalPayment("misswaldorfblair@gmail.com");

            PaymentStrategy bitcoinPayment3 = new BitcoinPayment("123Im456Chuck789Bass");
            PaymentStrategy creditCardPayment3 = new CreditCardPayment("6280-2456-4873-1074", "Chuck Bass");

            customer1.displayCustomerInfo();
            customer1.makePayment(creditCardPayment1, 122.5);
            customer1.makePayment(payPalpayment1, 85.5);

            customer2.displayCustomerInfo();
            customer2.makePayment(bitcoinPayment2, 870.0);
            customer2.makePayment(payPalPayment2, 250.0);

            customer3.displayCustomerInfo();
            customer3.makePayment(bitcoinPayment3, 1200.0);
            customer3.makePayment(creditCardPayment3, 650.0);


            System.out.println("\nPayment History:");
            System.out.println();
            System.out.println("Andy's Payment History: ");
            System.out.println("$122.5 : credit card" + "\n$85.5 : paypal payment");
            customer1.showPaymentHistory();
            System.out.println();
            System.out.println("Blair's Payment History: ");
            customer2.showPaymentHistory();
            System.out.println("$870 : bitcoin" + "\n$250 : paypal payment");
            System.out.println();
            System.out.println("Chuck's Payment History: ");
            customer3.showPaymentHistory();
            System.out.println("$1200 : bitcoin" + "\n$650 : credit card");
    }
}