package at.ta.Airplane;

public class CargoAircraft extends Aircraft {
    private double cargo;

    public CargoAircraft(String identification, double maximumWeight, double emptyWeight, double fuelCapacity, double cargo) {
        super(identification, maximumWeight, emptyWeight, fuelCapacity);
        this.cargo = cargo;
    }

    public double unloadCargo() {
        System.out.println("This Stop we unload all: " + this.cargo);
        System.out.println();
        this.cargo = 0;
        return this.cargo;
    }

    public double loadedCargo(double newCargo) {
        System.out.println("This Stop we load " + newCargo);
        System.out.println();
        this.cargo = this.cargo + newCargo;
        System.out.println("The Cargo Weigt ist now: " + cargo);
        return cargo;
    }

    public void statusCargoAircraft() {
        System.out.println("The maximum Weight of this CargoAircraft are: " + getMaximumWeight() + " kg.");
        System.out.println("The maximum Cargo Weight are 25.000 KG.");
        double cargoStatus = 25000.0 - this.cargo;
        System.out.println("You can still load: " + cargoStatus + " kg.");
        System.out.println();
    }
}
