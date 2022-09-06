package com.java18.nicolaos.model;


import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity
@Table(name="members")
public class Members {

    private Integer	id;
    private String name;

    public Members(){
    	
    }
    
    public Members(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="memberId")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name="name")
    public String getUserName() {
        return name;
    }

    public void setUserName(String name) {
        this.name = name;
    }

	@Override
	public String toString() {
		return "Members [id=" + id + ", name=" + name + "]";
	}
    
    
}
