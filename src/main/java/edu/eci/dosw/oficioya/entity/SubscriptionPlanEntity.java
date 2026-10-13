package edu.eci.dosw.oficioya.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name = "subscription_plan")
public class SubscriptionPlanEntity {

    @Id
    @Column(name = "plan_name", length = 20)
    private String planName; // La PK es el nombre del plan según el diagrama

    @NotNull
    @Column(precision = 10, scale = 2)
    private BigDecimal price;


}