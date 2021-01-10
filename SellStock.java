public class SellStock implements Order
{
    private Stock s;
    private int quantity;

    public SellStock( Stock s, int quantity)
    {
        this.s = s;
        this.quantity = quantity;
    }

    @Override
    public void execute()
    {
        s.sell(quantity);
    }
}
