public class Car {
    private String name;
    private long vin;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getVin() {
        return vin;
    }

    public void setVin(long vin) {
        this.vin = vin;
    }

    public String toString() {
        return "Name: " + name + " Vin: " + vin;
    }
}
