package web.model;

public class Car {
    String model;
    String color;
    String gear;

    public Car() {}

    public Car(String model, String color, String gear) {
        this.model = model;
        this.color = color;
        this.gear = gear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        this.gear = gear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", gear='" + gear + '\'' +
                '}';
    }
}
