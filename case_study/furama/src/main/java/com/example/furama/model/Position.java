package com.example.furama.model;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "position")
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long positionId;
    private String positionName;

    @OneToMany(mappedBy = "position", cascade = CascadeType.ALL)
    private Set<Employee> employees;

    public Position() {
    }

    public Position(Long positionId, String positionName) {
        this.positionId = positionId;
        this.positionName = positionName;
    }

    public Position(String positionName) {
        this.positionName = positionName;
    }

    public Long getPositionId() {
        return positionId;
    }

    public void setPositionId(Long positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
}
