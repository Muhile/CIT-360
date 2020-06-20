package hibernatePotluck;

import javax.persistence.*;


    /** This Data Object class corresponds with customer table
     *  in database. */
    @Entity
    @Table(name = "potluck")

    public class Potluck {

        /** id is an identity type field in the database and the primary key */
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private int id;

        @Column(name = "name")
        private String name;

        @Column(name = "food")
        private String food;

        @Column(name = "confirmed")
        private String confirmed;

        @Column(name = "signup_date")
        private String signup_date;


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


        public String getConfirmed() {
            return confirmed;
        }

        public void setConfirmed(String confirmed) {
            this.confirmed = confirmed;
        }

        public String getSignup_date() {
            return signup_date;
        }

        public void setSignup_date(String signup_date) {
            this.signup_date = signup_date;
        }

        public String toString() {
            return Integer.toString(id) + " " + name + " " + confirmed + " " + signup_date;
        }
    }
