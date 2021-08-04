package com.nagarro.model;

import javax.persistence.Entity;
import javax.persistence.Id;


public class User {
	
    private int id;
    private String name;
    private String prodName;

    public User() {
    	
    }

	public User(int id, String name, String prodName) {
        this.id = id;
        this.name = name;
        this.prodName = prodName;
    }
	
    public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}