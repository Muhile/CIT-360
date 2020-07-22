package gearrental;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class JSON {

    public static String carToJSON(List<Rental> p){
        ObjectMapper mapper = new ObjectMapper();
        String s = "";

        try {
            s = mapper.writeValueAsString(p);
        } catch (JsonProcessingException e) {
            System.err.println(e.toString());
        }

        return s;
    }

//    public static Rental JSONToCar(String s) {
//
//        ObjectMapper mapper = new ObjectMapper();
//        Rental rental = null;
//
//        try {
//            rental = mapper.readValue(s, Rental.class);
//        } catch (JsonProcessingException e) {
//            System.err.println(e.toString());
//        }
//
//        return rental;
//    }

}
