package edu.eci.dosw.oficioya.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "Worker")
@Inheritance(strategy = InheritanceType.JOINED)
public class Worker extends User {

    @NotBlank
    @Column(name = "main_trade", nullable = false, length = 200)
    private String mainTrade;

    @Enumerated(EnumType.STRING)
    @Column(name = "availability_state", nullable = false, length = 20)
    private Availability availabilityState;

    @NotNull
    @Column(nullable = false)
    private Long rate;

    @NotNull
    @Column(name = "completed_jobs", nullable = false)
    private Integer completedJobs;

    public Worker() {}

    public String getMainTrade() { return mainTrade; }
    public void setMainTrade(String mainTrade) { this.mainTrade = mainTrade; }

    public Availability getAvailabilityState() { return availabilityState; }
    public void setAvailabilityState(Availability availabilityState) { this.availabilityState = availabilityState; }

    public Long getRate() { return rate; }
    public void setRate(Long rate) { this.rate = rate; }

    public Integer getCompletedJobs() { return completedJobs; }
    public void setCompletedJobs(Integer completedJobs) { this.completedJobs = completedJobs; }

}
