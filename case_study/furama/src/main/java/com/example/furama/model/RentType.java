package com.example.furama.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "rent_type")
public class RentType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long renttypeId;
    private String renttypeName;
    private Double renttypeCost;

    @OneToMany(mappedBy = "rentType", cascade = CascadeType.ALL)
    private Set<Service> services;

    public RentType() {
    }

    public RentType(String renttypeName, Double renttypeCost) {
        this.renttypeName = renttypeName;
        this.renttypeCost = renttypeCost;
    }

    public Long getRenttypeId() {
        return renttypeId;
    }

    public void setRenttypeId(Long renttypeId) {
        this.renttypeId = renttypeId;
    }

    public String getRenttypeName() {
        return renttypeName;
    }

    public void setRenttypeName(String renttypeName) {
        this.renttypeName = renttypeName;
    }

    public Double getRenttypeCost() {
        return renttypeCost;
    }

    public void setRenttypeCost(Double renttypeCost) {
        this.renttypeCost = renttypeCost;
    }

    public Set<Service> getServices() {
        return services;
    }

    public void setServices(Set<Service> services) {
        this.services = services;
    }
}
