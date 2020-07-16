package gearrental;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import gearrental.*;

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

    /** Used to get more than one customer from database
     *  Uses the OpenSession construct rather than the
     *  getCurrentSession method so that I control the
     *  session.  Need to close the session myself in finally.*/
    public List<Rental> getRental() {

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

    /** Used to get a single customer from database */
    public Rental getRental(int id) {

        try {
            session = factory.openSession();
            session.getTransaction().begin();
            String sql = "from gearrental.Rental where id=" + Integer.toString(id);
            Rental p = (Rental)session.createQuery(sql).getSingleResult();
            session.getTransaction().commit();
            return p;

        } catch (Exception e) {
            e.printStackTrace();
            // Rollback in case of an error occurred.
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }
    }

//    /**
//     * Save User
//     * @param rental
//     */
//    public void saveUser(Rental rental) {
//        Transaction transaction = null;
//        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
//            // start a transaction
//            transaction = session.beginTransaction();
//            // save the student object
//            session.save(rental);
//            // commit transaction
//            transaction.commit();
//        } catch (Exception e) {
//            if (transaction != null) {
//                transaction.rollback();
//            }
//            e.printStackTrace();
//        }
//    }
//
//    /**
//     * Update User
//     * @param rental
//     */
//    public void updateUser(Rental rental) {
//        Transaction transaction = null;
//        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
//            // start a transaction
//            transaction = session.beginTransaction();
//            // save the student object
//            session.update(rental);
//            // commit transaction
//            transaction.commit();
//        } catch (Exception e) {
//            if (transaction != null) {
//                transaction.rollback();
//            }
//            e.printStackTrace();
//        }
//    }
//
//    /**
//     * Delete User
//     * @param id
//     */
//    public void deleteUser(int id) {
//
//        Transaction transaction = null;
//        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
//            // start a transaction
//            transaction = session.beginTransaction();
//
//            // Delete a user object
//            Rental user = session.get(Rental.class, id);
//            if (user != null) {
//                session.delete(user);
//                System.out.println("rental is deleted");
//            }
//
//            // commit transaction
//            transaction.commit();
//        } catch (Exception e) {
//            if (transaction != null) {
//                transaction.rollback();
//            }
//            e.printStackTrace();
//        }
//    }
//
//    /**
//     * Get User By ID
//     * @param id
//     * @return
//     */
//    public static Rental getUser(int id) {
//
//        Transaction transaction = null;
//        Rental rental = null;
//        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
//            // start a transaction
//            transaction = session.beginTransaction();
//            // get an rental object
//            rental = session.get(Rental.class, id);
//            // commit transaction
//            transaction.commit();
//        } catch (Exception e) {
//            if (transaction != null) {
//                transaction.rollback();
//            }
//            e.printStackTrace();
//        }
//        return rental;
//    }
//
//    /**
//     * Get all Users
//     * @return
//     */
//    @SuppressWarnings("unchecked")
//    public List < Rental > getAllUser() {
//
//        Transaction transaction = null;
//        List < Rental > listOfUser = null;
//        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
//            // start a transaction
//            transaction = session.beginTransaction();
//            // get an user object
//
//            listOfUser = session.createQuery("from Rental").getResultList();
//
//            // commit transaction
//            transaction.commit();
//        } catch (Exception e) {
//            if (transaction != null) {
//                transaction.rollback();
//            }
//            e.printStackTrace();
//        }
//        return listOfUser;
//    }


}
