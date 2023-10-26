package main;

public class Valet implements HotelService
{
    private static String plateNumber;

    public static void setPlateNumber(String plateNum) 
    {
        plateNumber = plateNum;
    }

    public Valet(String plateNum)
    {
        plateNumber = plateNum;
    }

    public void pickUpVehicle (String plateNum)
    {
        String plateNumber = plateNum;
        System.out.println("Vehicle " + plateNumber + " is ready for pick up!");
    }   
    
    public void doservice() 
    {
        pickUpVehicle(plateNumber);
    }
}
