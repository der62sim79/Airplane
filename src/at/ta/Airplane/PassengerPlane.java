package at.ta.Airplane;



public class PassengerPlane extends Aircraft {
    private int amountOfPassenger;
    private int maxOfPassenger;

    public PassengerPlane(String identification, double maximumWeight, double emptyWeight, double fuelCapacity,
                          int amountOfPassenger, int maxOfPassenger) {
        super(identification, maximumWeight, emptyWeight, fuelCapacity);
        this.amountOfPassenger = amountOfPassenger;
        this.maxOfPassenger = maxOfPassenger;
    }


    public void singleBoarding() {
        System.out.println("you have to fill up nearly full rows");
        boardingAmount(1);
    }


    public int boardingAmount(int amount) {

        int boardingAmount = amount;
        int seatsTaken = this.amountOfPassenger;
        int maxSeats = this.maxOfPassenger;
        if (seatsTaken + boardingAmount <= maxSeats) {
            seatsTaken = seatsTaken + boardingAmount;
            System.out.println(boardingAmount + " people boarding: " + seatsTaken + " people on board");
        } else if (seatsTaken == maxSeats) {
            System.out.println("All seats are taken.");
        } else {

            int seatsAvaliable = maxSeats - seatsTaken;
            System.out.println("Only " + seatsAvaliable + " passangers can board the plain.");
            return boardingAmount(seatsAvaliable);
        }
        this.amountOfPassenger = seatsTaken;
        return this.amountOfPassenger;
    }
}
