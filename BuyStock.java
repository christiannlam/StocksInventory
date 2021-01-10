public class BuyStock implements Order
{
    private Stock s;
    int quantity;

    public BuyStock( Stock s, int quantity)
    {
        this.s = s;
        this.quantity = quantity;
    }

    @Override
    public void execute()
    {
        s.buy(quantity);
    }
}
