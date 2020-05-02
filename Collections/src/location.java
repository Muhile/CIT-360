
public class location {
	
	private String state;
	private String city;
	private String manager;
	
	public location(String state, String city, String manager) {
        this.state = state;
        this.city = city;
        this.manager = manager;
    }

    public String toString() {
        return "State: " + state + ", City: " + city + ", Manager: " + manager;
    }

}
