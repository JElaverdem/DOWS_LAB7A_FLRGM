package edu.eci.dosw.oficioya.model;
import java.time.LocalDateTime;

public class UserSubscriptionModel {
    private Long id;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private SubscriptionPlanModel plan;

    public UserSubscriptionModel(){

    }

    public Long getId(){
        return this.id;
    }

    public void setId(Long newId){
        this.id = newId;
    }

    public LocalDateTime getStartTime(){
        return this.startTime;
    }

    public void setStartTime(LocalDateTime newTime){
        this.startTime = newTime;
    }

    public LocalDateTime getEndTime(){
        return this.endTime;
    }

    public void setEndTime(LocalDateTime newTime){
        this.endTime = newTime;
    }

    public void setPlan(SubscriptionPlanModel newPlan){
        this.plan = newPlan;
    }

    public SubscriptionPlanModel getPlan(){
        return this.plan;
    }
}
