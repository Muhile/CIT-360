package hibernatePotluck;

import hansenHibernate.Customer;
import hansenHibernate.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class machine {

        SessionFactory factory = null;
        Session session = null;

        private static hibernatePotluck.machine single_instance = null;

        private machine()
        {
            factory = HibernateUtils.getSessionFactory();
        }

        /** This is what makes this class a singleton.  You use this
         *  class to get an instance of the class. */
        public static hibernatePotluck.machine getInstance()
        {
            if (single_instance == null) {
                single_instance = new hibernatePotluck.machine();
            }

            return single_instance;
        }

        /** Used to get more than one customer from database
         *  Uses the OpenSession construct rather than the
         *  getCurrentSession method so that I control the
         *  session.  Need to close the session myself in finally.*/
        public List<Potluck> getPotluck() {

            try {
                session = factory.openSession();
                session.getTransaction().begin();
                String sql = "from hibernatePotluck.Potluck";
                List<Potluck> cs = (List<Potluck>)session.createQuery(sql).getResultList();
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
        public Potluck getPotluck(int id) {

            try {
                session = factory.openSession();
                session.getTransaction().begin();
                String sql = "from hibernatePotluck.Potluck where id=" + Integer.toString(id);
                Potluck p = (Potluck)session.createQuery(sql).getSingleResult();
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

    }
