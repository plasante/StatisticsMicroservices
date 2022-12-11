package com.quicktutorials.learnmicroservices.StatisticsMicroservices.entities;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name="latest_statistics")
@AllArgsConstructor
@NoArgsConstructor
public class Statistics {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID")
    @Getter @Setter
    private Integer Id;

    @Column(name="DESCRIPTION")
    @Getter @Setter
    @NotBlank @NotNull @NotEmpty
    private String description;

    @Column(name="DATE")
    @Getter @Setter
    private Date date;

    @Column(name="EMAIL")
    @Getter @Setter
    @NotBlank @NotNull @NotEmpty
    private String email;

    @PrePersist
    private void getTimeOperation() {
        this.date = new Date();
    }
}
