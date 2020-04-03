package at.ta.Airplane;

import java.util.Objects;

public class Aircraft {
    private String identification;
    private double maximumWeight;
    private double emptyWeight;
    private double fuelCapacity;

    public Aircraft(String identification, double maximumWeight, double emptyWeight, double fuelCapacity) {
        this.identification = identification;
        this.maximumWeight = maximumWeight;
        this.emptyWeight = emptyWeight;
        this.fuelCapacity = fuelCapacity;
    }

    public String getIdentification() {
        return identification;
    }

    public double getMaximumWeight() {
        return maximumWeight;
    }

    public boolean hasFlyPermit(String flyId) {
        return flyId.equalsIgnoreCase(getIdentification());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aircraft aircraft = (Aircraft) o;
        return Objects.equals(identification, aircraft.identification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identification);
    }
}
