public abstract class Payment
{
    public abstract void makePayment(double amount); //abstract method does not have definition

    public void printReceipt() // concrete method, must have a funciton definition
    {
        System.out.println("Payment Successful");
    }

}