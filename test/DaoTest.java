/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.gh.Dao.AdminDaoImpl;
import model.AA;
import model.Admin;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lenovo
 */
public class DaoTest {

    private SessionFactory sessionFactory=null;
    private Configuration configuration=null;
    private Session session=null;
    private Transaction transaction=null;
    
    public DaoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
//         sessionFactory = null;
//         configuration = new Configuration().configure();
//         ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
//         sessionFactory = configuration.buildSessionFactory(serviceRegistry);
//         session = sessionFactory.openSession();
//         transaction = session.beginTransaction();
    }

    @After
    public void tearDown() {
//        transaction.commit();
//        session.close();
//        sessionFactory.close();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void hello() {
//       AA a = new AA();
//       a.setName("das");
//       session.save(a);
        AdminDaoImpl a =new AdminDaoImpl();
        Admin aa = new Admin("1","123");
        a.add(aa);
    }
}
