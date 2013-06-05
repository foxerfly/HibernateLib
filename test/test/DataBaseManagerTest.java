package test;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EDWIN
 */
import com.edwin.Hibernate.DataBaseManager;
import com.edwin.Hibernate.SessionManager;
import junit.framework.TestCase;

import org.hibernate.Query;

public class DataBaseManagerTest extends TestCase {

    DataBaseManager dbm = DataBaseManager.getInst();

    public void testDatabase() {
        setDatabase();
        SessionManager tempSess = dbm.get("dataLocal");
        Query query = tempSess.createQuery("from  Shop");
        query.list();

        SessionManager tempSess27 = dbm.get("dateManage");
        Query query27 = tempSess27.createQuery("from Shop");
        query27.list();
    }

    private void setDatabase() {
        SessionManager home = new SessionManager("hibernate.cfg");
        SessionManager company = new SessionManager("C_hibernate.cfg");
        dbm.put("dateManage", home);
        dbm.put("dataLocal", company);

    }
}
