package com.example.furama.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "customer_type")
public class CustomerType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long customertypeId;
    private String customertypeName;


    @OneToMany(mappedBy = "customerType", cascade = CascadeType.ALL)
    private Set<Customer> customers;

    public CustomerType() {
    }

    public CustomerType(String customertypeName) {
        this.customertypeName = customertypeName;
    }

    public Long getCustomertypeId() {
        return customertypeId;
    }

    public void setCustomertypeId(Long customertypeId) {
        this.customertypeId = customertypeId;
    }

    public String getCustomertypeName() {
        return customertypeName;
    }

    public void setCustomertypeName(String customertypeName) {
        this.customertypeName = customertypeName;
    }

    public Set<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }
}
