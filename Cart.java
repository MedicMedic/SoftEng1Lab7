package main;

public class Cart implements HotelService
{
    private static int numberOfLuggages;

    public static void setNumberOfLuggages(int noOfLuggages) 
    {
        numberOfLuggages = noOfLuggages;
    }

    public Cart(int noOfLuggages)
    {
        numberOfLuggages = noOfLuggages;
    }

    public void requestCart(int numberOfLuggages)
    {
        int numberOfCarts = numberOfLuggages / 2;
        System.out.println(numberOfCarts + " cart/s will be picking up your " + numberOfLuggages + " luggages!");
    }

    public void doservice() 
    {
       requestCart(numberOfLuggages);
    }
}
