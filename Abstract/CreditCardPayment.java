public class CreditCardPayment extends Payment
{
    //Need to override all abstract method
    public void makePayment(double amount)
    {
        System.out.println("Amount "+ amount + " Paid using Credit Card");
    }
    
    public void printReceipt()
    {
        System.out.println("Payment Successful via Credit Card");
    }
}