package builder;

public class Carbuilder {

    private String type;
    private String fuel;
    private int seats;
    private boolean isManualGear;
    private String color;

    public Carbuilder type(String type) {
        this.type = type;
        return this;
    }

    public Carbuilder fuel(String fuel) {
        this.fuel = fuel;
        return this;
    }

    public Carbuilder isManualGear(boolean isManualGear) {
        this.isManualGear = isManualGear;
        return this;
    }

    public Carbuilder seats(int seats) {
        this.seats = seats;
        return this;
    }

    public Carbuilder color(String color) {
        this.color = color;
        return this;
    }

    public Car build() {
        Car car = new Car();
        car.setColor(color);
        car.setFuel(fuel);
        car.setManualGear(isManualGear);
        car.setSeats(seats);
        car.setType(type);
        return car;
    }
}
