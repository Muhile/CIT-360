// Java program for write a JSON

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJson {

    public static String carToJSON(Car car){
        ObjectMapper mapper = new ObjectMapper();
        String s = "";

        try {
            s = mapper.writeValueAsString(car);
        } catch (JsonProcessingException e) {
            System.err.println(e.toString());
        }

        return s;
    }

    public static Car JSONToCar(String s) {

        ObjectMapper mapper = new ObjectMapper();
        Car car = null;

        try {
            car = mapper.readValue(s, Car.class);
        } catch (JsonProcessingException e) {
            System.err.println(e.toString());
        }

        return car;
    }

    public static void main(String[] args) {

        Car kar = new Car();
        kar.setName("Ford");
        kar.setVin(64565);

        String json = JavaToJson.carToJSON(kar);
        System.out.println(json);

        Car kar2 = JavaToJson.JSONToCar(json);
        System.out.println(kar2);
    }
}
