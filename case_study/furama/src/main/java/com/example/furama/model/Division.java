package com.example.furama.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "division")
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long divisionId;
    private String divisionName;

    @OneToMany(mappedBy = "division", cascade = CascadeType.ALL)
    private Set<Employee> employees;

    public Division() {
    }

    public Division(Long divisionId, String divisionName) {
        this.divisionId = divisionId;
        this.divisionName = divisionName;
    }

    public Division(String divisionName) {
        this.divisionName = divisionName;
    }

    public Long getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(Long divisionId) {
        this.divisionId = divisionId;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
}
