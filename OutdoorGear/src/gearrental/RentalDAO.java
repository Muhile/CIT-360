package gearrental;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import gearrental.*;

import java.util.Iterator;
import java.util.List;

public class RentalDAO {
    SessionFactory factory = null;
    Session session = null;

    private static gearrental.RentalDAO single_instance = null;

    public RentalDAO()
    {
        factory = HibernateUtils.getSessionFactory();
    }

    /** This is what makes this class a singleton.  You use this
     *  class to get an instance of the class. */
    public static gearrental.RentalDAO getInstance()
    {
        if (single_instance == null) {
            single_instance = new gearrental.RentalDAO();
        }

        return single_instance;
    }


    public List<Rental> getRentalList() {

        try {
            session = factory.openSession();
            session.getTransaction().begin();
            String sql = "from gearrental.Rental";
            List<Rental> cs = (List<Rental>)session.createQuery(sql).getResultList();
            session.getTransaction().commit();
            return cs;

        } catch (Exception e) {
            e.printStackTrace();
            // Rollback in case of an error occurred.
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }

    }
    public List<Rental> addRentalDetails(String name, String email, String gear){
        try {
            session = factory.openSession();
            session.getTransaction().begin();
            Rental r = new Rental();
            r.setName(name);
            r.setEmail(email);
            r.setGear(gear);
            session.save(r);
            String sql = "from gearrental.Rental";
            List<Rental> cs = (List<Rental>)session.createQuery(sql).getResultList();
            session.getTransaction().commit();
            return cs;

        } catch (Exception e) {
            e.printStackTrace();
            // Rollback in case of an error occurred.
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }
    } 

    //Extra code
    //
//                System.out.println("name: "+ r.getName() + " email: " + r.getEmail() + " gear: " + r.getGear());

//    Iterator it = cs.iterator();
//            while (it.hasNext()){
//        Object o = (Object)it.next();
//        Rental r = (Rental)o;
////                System.out.println(it.next());
//    }

}
