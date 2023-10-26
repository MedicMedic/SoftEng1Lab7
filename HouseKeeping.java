package main;

public class HouseKeeping implements HotelService
{
    private static String roomNumber;

    public static void setRoomNumber(String roomNum) 
    {
        roomNumber = roomNum;
    }

    public HouseKeeping(String roomNum)
    {
        roomNumber = roomNum;
    }

    public void cleanRoom(String roomNumber)
    {
        HouseKeeping.roomNumber = roomNumber;
        System.out.println("Room " + roomNumber + " will be cleaned!");
    }

    public void doservice() 
    {
        cleanRoom(roomNumber);
    }
}
