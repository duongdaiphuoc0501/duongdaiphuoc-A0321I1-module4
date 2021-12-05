package com.example.bai_hat.model;

import net.bytebuddy.implementation.bind.annotation.Empty;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "bai_hat")
public class Bai_hat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Max(800)
    @NotEmpty
    private String name;
    @Max(800)
    @NotEmpty
    private String nghe_si;
    @Max(1000)
    @NotEmpty
    private String the_loai;

    public Bai_hat() {
    }

    public Bai_hat(Long id, String name, String nghe_si, String the_loai) {
        this.id = id;
        this.name = name;
        this.nghe_si = nghe_si;
        this.the_loai = the_loai;
    }
}
