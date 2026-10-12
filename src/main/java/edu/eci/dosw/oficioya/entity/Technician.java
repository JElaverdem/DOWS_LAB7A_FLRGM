package edu.eci.dosw.oficioya.entity;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "technician")
public class Technician extends Worker {

    @ElementCollection
    @CollectionTable(name = "technician_tool", joinColumns = @JoinColumn(name = "user_id"))
    @Column(name = "tool_name", length = 50)
    private Set<String> tools;

    @ElementCollection
    @CollectionTable(name = "technician_brand", joinColumns = @JoinColumn(name = "user_id"))
    @Column(name = "brand_name", length = 50)
    private Set<String> brands;

}
