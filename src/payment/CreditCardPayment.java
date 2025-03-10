package payment;

public class CreditCardPayment implements PaymentStrategy{
    String cardNumber;
    String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName){
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void pay(double amount) {
        System.out.println(getPaymentDetails() + "\n  Amount: $" + amount);
    }

    @Override
    public String getPaymentDetails() {
        return "Payment made with Credit Card" + "\nCard Number: "  + cardNumber + "\nCard Holder Name: " + cardHolderName;
    }
}
