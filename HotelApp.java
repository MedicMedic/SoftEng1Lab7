package main;

import java.util.Scanner;

public class HotelApp 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        FrontDesk receptionist = new FrontDesk();

        System.out.println("Welcome to Hotel California!");

        boolean loop = true;

        while (loop)
        {
            System.out.print("Type in the service you need:\n\t[1] Valet\n\t[2] Housekeeping\n\t[3] Cart\n\t[4] Exit\nInput here: ");
            int service = input.nextInt();

            switch (service) 
            {
                case 1: System.out.print("Enter your plate number for pickup!\nInput here: ");
                        String plateNumber = input.next();
                        Valet.setPlateNumber(plateNumber);
                        HotelService valet = new Valet(plateNumber);
                        FrontDesk.goodService(valet);
                        break;
                case 2: System.out.print("Enter your room number for clean up!\nInput here: ");
                        String roomNumber = input.next();
                        HouseKeeping.setRoomNumber(roomNumber);
                        HotelService housekeeping = new HouseKeeping(roomNumber);
                        FrontDesk.goodService(housekeeping);
                        break;
                case 3: System.out.print("Enter the number of your luggages for...cart up(?)!\nInput here: ");
                        int numberOfCarts = input.nextInt();
                        Cart.setNumberOfLuggages(numberOfCarts);
                        HotelService cart = new Cart(numberOfCarts);
                        FrontDesk.goodService(cart);
                        break;
                case 4: 
                        System.out.println("We are programmed to receive\nYou can check" 
                        + "out any time you like\nBut you can never leave!");
                        loop = false;
                        break;
            }
        }

    }
}
