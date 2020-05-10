public class Car {
    private String make;
    private String model;
    private long price;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String toString() {
        return "Make: " + make + " Model: " + model + " Price: " + price;
    }
}
