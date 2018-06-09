package com.code.vehicle.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@NamedQuery(name = "Vehicle.findByVehicleType",
query = "select u from Vehicle u where u.type = ?1")
@Table(name = "vehicle", catalog = "test")
@DiscriminatorColumn(name = "type")
public class Vehicle {

	
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @Column(name = "type")
    private String type;
    
    @Column(name = "name")
    private String name;
    
   // @Temporal(TemporalType.DATE)
    private Date createdDate;

    public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Vehicle() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
 
	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
}
