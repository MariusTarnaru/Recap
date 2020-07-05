package builder;

public class Car {

    private String type;
    private String fuel;
    private int seats;
    private boolean isManualGear;
    private String color;

    public static Carbuilder builder() {
        return new Carbuilder();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public boolean isManualGear() {
        return isManualGear;
    }

    public void setManualGear(boolean manualGear) {
        isManualGear = manualGear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
