/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Bophan;
import java.util.List;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author thinhnt
 */
public class BoPhanDAO {

    private SessionFactory sf = HibernateUtil.getSessionFactory();

    public BoPhanDAO() {

    }

    public List<Bophan> findAll() {
        Transaction tran = sf.getCurrentSession().getTransaction();
        try {
            tran.begin();
            List<Bophan> rs = sf.getCurrentSession().createCriteria(Bophan.class).list();
            tran.commit();
            return rs;
        } catch (RuntimeException e) {
            System.err.print(e);
            tran.rollback();
            return null;
        }
    }

    public Bophan find(int id) {
         Transaction tran = sf.getCurrentSession().getTransaction();
        try {
            tran.begin();
            Bophan rs = (Bophan) sf.getCurrentSession().get(Bophan.class, id);
            tran.commit();
            return rs;
        } catch (Exception e) {
            System.err.print(e);
            tran.rollback();
            return null;
        }
    }

    public boolean updateOrSave(Bophan bp) {
        Transaction tran = sf.getCurrentSession().getTransaction();
        try {
            tran.begin();
            sf.getCurrentSession().saveOrUpdate(bp);
            tran.commit();
            return true;
        } catch (Exception e) {
            System.err.print(e);
            tran.rollback();
            return false;
        }
    }
    
    public boolean delete(Bophan bp){
        Transaction tran = sf.getCurrentSession().getTransaction();
        try {
            tran.begin();
            sf.getCurrentSession().delete(bp);
            tran.commit();
            return true;
        } catch (Exception e) {
            System.err.print(e);
            tran.rollback();
            return false;
        }
    }

}
