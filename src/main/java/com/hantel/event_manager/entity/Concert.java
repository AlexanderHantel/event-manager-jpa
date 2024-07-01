package com.hantel.event_manager.entity;

import com.hantel.event_manager.entity.hall.Hall;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Concert {

    @Id
    @GeneratedValue
    private Long id;

    private LocalDateTime startDateTime;

    @OneToOne
    private Hall hall;

    @ManyToOne
    private Musical musical;

    @OneToMany(mappedBy = "concert")
    private List<Ticket> tickets = new ArrayList<>();
}
