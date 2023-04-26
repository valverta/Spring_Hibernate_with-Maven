package com.zaurtregulov.spring.Service;

import com.zaurtregulov.spring.Dao.Dao;
import com.zaurtregulov.spring.Dao.DaoHibernate;
import com.zaurtregulov.spring.Enty.Enty;

import java.util.List;

public class Service {
    Dao use = new DaoHibernate();
    public void createTable() {
        use.createTable();
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
