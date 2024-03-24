package com.gulshan.expenseevent.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Event {

    @Id
    private Long  id;
    private String name;
    private String description;
    private double amount;
    private LocalDate startDate;
    private LocalDate emdDate;

}
