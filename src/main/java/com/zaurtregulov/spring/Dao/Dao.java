package com.zaurtregulov.spring.Dao;

import com.zaurtregulov.spring.Enty.Enty;

import java.util.List;

public interface Dao {
    public void createTable();
    public void dropTable();
    public void updateOrSave(String name);
    public List<Enty> takeAll();
    public void delete(int id);
}
