/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edwin.Hibernate;

/**
 *
 * @author EDWIN
 */
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public final class SessionManager {

    private Configuration config;

    private SessionFactory sessionFactory;

    private Session session;

    public Criteria createCriteria(Class persistentClass) {
        return session.createCriteria(persistentClass);
    }

    private void buildSession() {
        sessionFactory = config.buildSessionFactory();
        session = sessionFactory.openSession();
    }

    public SessionManager(String configFile) {
        config = new Configuration().configure(configFile);
        buildSession();
    }

    public Session getSession() {
        return session;
    }

    public void save(Object obj) {
        Transaction tx = session.beginTransaction();
        session.save(obj);
        tx.commit();
    }

    public Object load(Class clas, Integer priId) {
        return session.get(clas, priId);
    }

    public Query findbyhql(String hql) {
        return session.createQuery(hql);
    }

    public List pageSizeByhql(String hql) {
        return findbyhql(hql).list();
    }

    public SQLQuery findbysql(String sql) {
        return session.createSQLQuery(sql);
    }

    public void update(Object obj) {
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(obj);
        tx.commit();
    }

    public void delete(Class clas, Integer inte) {
        session.delete(load(clas, inte));
    }

    public void delete(Object obj) {
        session.delete(obj);
    }

    public void deletebyhql(String hql) {
        Query query = session.createQuery(hql);
        query.executeUpdate();
    }

    public Query createQuery(String hql) {
        return session.createQuery(hql);
    }

}
