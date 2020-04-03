package at.ta.Airplane;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CargoAircraft cargoAircraft = new CargoAircraft("lk548", 40000.0, 10000.0,
                500.0, 20000.0);
        PassengerPlane passengerPlane= new PassengerPlane("loi222",30000.0,15000.0,
                500,400,480);


        checkFlyPermition(cargoAircraft);
        cargoAircraft.statusCargoAircraft();
        cargoAircraft.loadedCargo(500);
        cargoAircraft.statusCargoAircraft();
        cargoAircraft.unloadCargo();
        cargoAircraft.statusCargoAircraft();

        checkFlyPermition(passengerPlane);
        Scanner singleBoarding = new Scanner(System.in);
        System.out.println("Wollen Sie alleine boarden?");
        String singleBoardingInput = singleBoarding.nextLine();
        if(singleBoardingInput.equalsIgnoreCase("yes")) {
            passengerPlane.singleBoarding();
        } else {
            passengerBoardingAmmount(passengerPlane);
        }
    }

    private static void passengerBoardingAmmount(PassengerPlane passengerPlane) {
        System.out.println("Please give the boarding amount: ");
        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();
        passengerPlane.boardingAmount(amount);
    }


    private static void checkFlyPermition(Aircraft aircraft) {
        boolean hasFlyPermit = false;

        while (!hasFlyPermit) {
            System.out.println("Pleace give you Fly-ID: ");
            Scanner input = new Scanner(System.in);
            String flyID = input.nextLine();

            hasFlyPermit = aircraft.hasFlyPermit(flyID);

            if(!hasFlyPermit){
                System.out.println("keine erlaubnis");
            }
        }

        if(hasFlyPermit){
            System.out.println("go and fly!");
        }
    }
}
