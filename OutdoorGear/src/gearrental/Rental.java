package gearrental;

import javax.persistence.*;

/**
 * This Data Object class corresponds with customer table
 * in database.
 */
@Entity
@Table(name = "rental")
public class Rental {
    /**
     * id is an identity type field in the database and the primary key
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "gear")
    private String gear;


    public Rental() {
    }

    public Rental(String name, String email, String gear) {
        super();
        this.name = name;
        this.email = email;
        this.gear = gear;
    }

    public Rental(int id, String name, String email, String gear) {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
        this.gear = gear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        this.gear = gear;
    }


    /*public String toString() {

        return Integer.toString(id) + " " + name + " " + gear + " " + rental_date;
    } */
}
