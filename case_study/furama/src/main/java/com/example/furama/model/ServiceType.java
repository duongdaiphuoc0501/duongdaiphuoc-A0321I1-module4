package com.example.furama.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "service_type")
public class ServiceType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long servicetypeId;
    private String servicetypeName;

    @OneToMany(mappedBy = "serviceType", cascade = CascadeType.ALL)
    private Set<Service> services;

    public ServiceType() {
    }

    public ServiceType(String servicetypeName) {
        this.servicetypeName = servicetypeName;
    }

    public Long getServicetypeId() {
        return servicetypeId;
    }

    public void setServicetypeId(Long servicetypeId) {
        this.servicetypeId = servicetypeId;
    }

    public String getServicetypeName() {
        return servicetypeName;
    }

    public void setServicetypeName(String servicetypeName) {
        this.servicetypeName = servicetypeName;
    }

    public Set<Service> getServices() {
        return services;
    }

    public void setServices(Set<Service> services) {
        this.services = services;
    }
}
