package hibernatePotluck;

import java.util.*;

public class RunHibernateExample {

    public static void main(String[] args) {

        machine t = machine.getInstance();

        List<Potluck> p = t.getPotluck();
        for (Potluck i : p) {
            System.out.println(i);
        }

        System.out.println(t.getPotluck(2));
    }
}
