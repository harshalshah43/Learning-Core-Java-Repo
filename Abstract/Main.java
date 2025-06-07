class Main
{
    public static void main(String[] args)
    {
        CreditCardPayment c = new CreditCardPayment();
        c.makePayment(1500);
        c.printReceipt();


        UPIPayment u = new UPIPayment();
        u.makePayment(2000);
        u.printReceipt();

    }
}