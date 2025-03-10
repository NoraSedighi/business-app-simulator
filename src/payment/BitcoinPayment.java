package payment;

public class BitcoinPayment implements PaymentStrategy{
    String walletAddress;

    public BitcoinPayment(String walletAddress){
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.println(getPaymentDetails() + "\n  Amount: $" + amount);
    }

    @Override
    public String getPaymentDetails() {
        return "Payment made with Bitcoin"+ "\nWallet Address: " + walletAddress;
    }

}
