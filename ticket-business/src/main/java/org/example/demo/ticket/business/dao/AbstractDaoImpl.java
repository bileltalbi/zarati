package org.example.demo.ticket.business.dao;

import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;


public abstract class AbstractDaoImpl {

    private DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}