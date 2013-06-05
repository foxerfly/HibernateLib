/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edwin.Hibernate;

/**
 *
 * @author EDWIN
 */
import java.util.HashMap;

public class DataBaseManager extends HashMap {

    private static final long serialVersionUID = 6491666983237498097L;
    private static DataBaseManager inst = new DataBaseManager();

    public static DataBaseManager getInst() {
        return inst;
    }

    public SessionManager get(Object key) {
        return (SessionManager) super.get(key);
    }

    @Override
    public Object put(Object key, Object value) {
        return super.put(key, value);
    }

    public static void setInst(DataBaseManager inst) {
        DataBaseManager.inst = inst;
    }

}
