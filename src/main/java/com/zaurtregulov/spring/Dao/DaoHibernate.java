package com.zaurtregulov.spring.Dao;

import com.zaurtregulov.spring.Enty.Enty;
import com.zaurtregulov.spring.Model.Util;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

import static org.hibernate.resource.transaction.spi.TransactionStatus.ACTIVE;
import static org.hibernate.resource.transaction.spi.TransactionStatus.MARKED_ROLLBACK;

public class DaoHibernate implements Dao {
    private SessionFactory sessionFactory = Util.session();
    Transaction transaction = null;
    public DaoHibernate() {

    }
    public void createTable() {
        try (Session session = sessionFactory.openSession()){
            //try {
                transaction = session.beginTransaction();
                session.createSQLQuery("CREATE TABLE IF NOT EXISTS Enty" +
                        "(id INT AUTO_INCREMENT, name VARCHAR(255), PRIMARY KEY (id))").executeUpdate();
                session.save(new Enty("fuck"));
                session.createSQLQuery("INSERT INTO entyy VALUES (null, 'eno')").executeUpdate();
                transaction.commit();
            } catch (Exception e) {
                if (transaction != null){
                    transaction.rollback();
                    System.out.println("roll");
                }
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        //}
    }
    public void dropTable() {

    }
    public void updateOrSave(String name) {

    }
    public List<Enty> takeAll() {
        return null;
    }
    public void delete(int id) {

    }
}
